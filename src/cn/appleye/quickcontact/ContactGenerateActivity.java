package cn.appleye.quickcontact;

import java.util.ArrayList;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import cn.appleye.quickcontact.common.model.BaseContactType;
import cn.appleye.quickcontact.utils.SettingsUtils;
import cn.appleye.quickcontact.widget.CheckableTextView;
import cn.appleye.quickcontact.widget.ClickableTextView;
import cn.appleye.quickcontact.widget.ProgressDialogEx;

public class ContactGenerateActivity extends Activity implements Callback{
	private static final String TAG = "ContactGenerateActivity";
	
	private ClickableTextView mSimpleInfoView;
	private ClickableTextView mFullInfoView;
	private EditText mCountsView;
	private CheckableTextView mMultiNumberCheckbox;
	private CheckableTextView mSameRepeatCheckbox;
	private Button mResetBtn;
	private Button mOKBtn;
	
	private boolean mIsSimpleInfo = true;
	private boolean mIsMultiNumberAllowed = false;
	private boolean mIsSameContactRepeat = false;
	
	private ProgressDialogEx mLoadingDialog = null;
	private boolean mCancel = false;
	private Handler mMainHandler = new Handler(this);
	
	private static final int MESSAGE_GENERATE_SUCCESS = 1;
	private static final int MESSAGE_GENERATE_FAILED = 0;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_generate_contacts);

		mSimpleInfoView = (ClickableTextView)findViewById(R.id.simple_info_view);
		mSimpleInfoView.setChecked(true);
		mFullInfoView = (ClickableTextView)findViewById(R.id.full_info_view);
		mFullInfoView.setChecked(false);
		mCountsView = (EditText)findViewById(R.id.contacts_count);
		mMultiNumberCheckbox = (CheckableTextView)findViewById(R.id.multi_numbers_checkbox);
		mSameRepeatCheckbox = (CheckableTextView)findViewById(R.id.same_repeat_checkbox);
		mResetBtn = (Button)findViewById(R.id.reset_btn);
		mOKBtn = (Button)findViewById(R.id.ok_btn);
		
		setEventListener();
	}
	
	private void setEventListener() {
		mMultiNumberCheckbox.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mMultiNumberCheckbox.toggole();
			}
		});
		
		mSameRepeatCheckbox.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mSameRepeatCheckbox.toggole();
			}
		});
		
		mResetBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				resetItems();
			}
		});
		
		mOKBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String countText = mCountsView.getText().toString();
				
				if (TextUtils.isEmpty(countText)) {
					Toast.makeText(ContactGenerateActivity.this, R.string.toast_empty_counts, Toast.LENGTH_SHORT).show();
				} else if (!countText.matches("[1-9][0-9]{0,5}")) {
					Toast.makeText(ContactGenerateActivity.this, R.string.toast_invalid_number, Toast.LENGTH_SHORT).show();
				} else {
					mIsSimpleInfo = mSimpleInfoView.isChecked();
					mIsMultiNumberAllowed = mMultiNumberCheckbox.isChecked();
					mIsSameContactRepeat = mSameRepeatCheckbox.isChecked();
					
					startGenerate(countText);
				}
			}
		});
		
		mSimpleInfoView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mSimpleInfoView.toggole();
				mFullInfoView.toggole();
			}
		});
		
		mFullInfoView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mSimpleInfoView.toggole();
				mFullInfoView.toggole();
			}
		});
	}
	
	private void resetItems() {
		mSimpleInfoView.setChecked(true);
		mFullInfoView.setChecked(false);
		mCountsView.setText("");
		mMultiNumberCheckbox.setChecked(false);
		mSameRepeatCheckbox.setChecked(false);
	}
	
	private BaseContactType createBaseContactType() {
		BaseContactType baseContactType = new BaseContactType();
		baseContactType.clear();
		
		SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
		boolean value;

		value = pref.getBoolean(SettingsUtils.PRE_KEY_DISPLAY_NAME, true);
		if (value) {
			baseContactType.addDataKindStructuredName();
		}
		
		value = pref.getBoolean(SettingsUtils.PRE_KEY_PNONE_NUMBER, true);
		if (value) {
			baseContactType.addDataKindPhone(mIsMultiNumberAllowed?3:1);
		}
		
		value = pref.getBoolean(SettingsUtils.PRE_KEY_PHOTO, true);
		if (value) {
			baseContactType.addDataKindPhoto();
		}

		if (!mIsSimpleInfo){
			value = pref.getBoolean(SettingsUtils.PRE_KEY_EMAIL, true);
			if (value) {
				baseContactType.addDataKindEmail();
			}
			
			value = pref.getBoolean(SettingsUtils.PRE_KEY_IM, true);
			if (value) {
				baseContactType.addDataKindIm();
			}
			
			value = pref.getBoolean(SettingsUtils.PRE_KEY_NICK_NAME, true);
			if (value) {
				baseContactType.addDataKindNickname();
			}
			
			value = pref.getBoolean(SettingsUtils.PRE_KEY_NOTE, true);
			if (value) {
				baseContactType.addDataKindNote();
			}
			
			value = pref.getBoolean(SettingsUtils.PRE_KEY_ORG, true);
			if (value) {
				baseContactType.addDataKindOrganization();
			}
			
			value = pref.getBoolean(SettingsUtils.PRE_KEY_WEBSITE, true);
			if (value) {
				baseContactType.addDataKindWebsite();
			}
			
			value = pref.getBoolean(SettingsUtils.PRE_KEY_POSTAL, true);
			if (value) {
				baseContactType.addDataKindStructuredPostal();
			}
		}
		
		return baseContactType;
	}
	
	private void startGenerate(String countText) {
		try{
			final BaseContactType baseContactType = createBaseContactType();
			
			if(baseContactType.getDataKindSize() <= 0) {
				Toast.makeText(this, R.string.nothing_generate, Toast.LENGTH_SHORT).show();
				return;
			}
			
			final int count = Integer.parseInt(countText);
			
			showLoadingDialog();
			
			mLoadingDialog.setMax(count);
			
			mCancel = false;
			
			new Thread() {
				public void run() {
					ArrayList<ContentProviderOperation> operationList = new ArrayList<ContentProviderOperation>();
					ArrayList<ContentProviderOperation> perOperationList = null;

					if (mIsSameContactRepeat) {
						ArrayList<Long> rawContactIds = new ArrayList<Long>();
						int realCount = 0;
						for (int i=0; i< count; i++) {
							Uri uri = RawContacts.CONTENT_URI;
							long rawContactId = ContentUris.parseId(getContentResolver().insert(uri, new ContentValues()));
							rawContactIds.add(rawContactId);
							
							realCount++;
							if (mCancel) {
								break;
							}
						}
						
						perOperationList = baseContactType.buildRepeatContentValues(rawContactIds, true);
						
						int processedCount = 0, step = (int)(perOperationList.size()/realCount);
						for (ContentProviderOperation operation : perOperationList) {
							operationList.add(operation);
							
							if (operationList.size() >= 498) {
								try{
									getContentResolver().applyBatch(ContactsContract.AUTHORITY, operationList);
									operationList.clear();
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								mLoadingDialog.setProgress(processedCount/step);
							}
							
							processedCount ++ ;
						}
						
						if (operationList.size() != 0) {
							try{
								getContentResolver().applyBatch(ContactsContract.AUTHORITY, operationList);
								operationList.clear();
							} catch (Exception e) {
								e.printStackTrace();
							}
							
							processedCount = processedCount+operationList.size();
							mLoadingDialog.setProgress(realCount);
						}
					} else {
						for (int i=0; i< count; i++) {
							Uri uri = RawContacts.CONTENT_URI;
							long rawContactId = ContentUris.parseId(getContentResolver().insert(uri, new ContentValues()));
							
							perOperationList = baseContactType.buildContentValues(ContactGenerateActivity.this, rawContactId, true);

							if (operationList.size() + perOperationList.size() >= 500) {
								try{
									getContentResolver().applyBatch(ContactsContract.AUTHORITY, operationList);
									operationList.clear();
									
									getContentResolver().applyBatch(ContactsContract.AUTHORITY, perOperationList);
									perOperationList.clear();
								} catch (Exception e) {
									e.printStackTrace();
								}
							} else {
								operationList.addAll(perOperationList);
							}
							
							if (i%4 == 0) {
								mLoadingDialog.setProgress(i+1);
							}
							
							if (mCancel) {
								break;
							}
						}
					}
					
					if (!mCancel && operationList.size() > 0) {
						try{
							getContentResolver().applyBatch(ContactsContract.AUTHORITY, operationList);
							operationList.clear();
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						mLoadingDialog.setProgress(count);
					}
					
					if (mCancel) {
						mMainHandler.sendEmptyMessage(MESSAGE_GENERATE_FAILED);
					} else {
						mMainHandler.sendEmptyMessage(MESSAGE_GENERATE_SUCCESS);
					}
				}
			}.start();
		}catch(NumberFormatException nfe) {
			Toast.makeText(ContactGenerateActivity.this, R.string.toast_invalid_number, Toast.LENGTH_SHORT).show();
		}
	}
	
	private void showLoadingDialog(){
		if(mLoadingDialog == null){	
			mLoadingDialog = new ProgressDialogEx(this);
			mLoadingDialog.setTitle(R.string.loading_dialog_title);
			mLoadingDialog.setMessage(getString(R.string.loading_dialog_message));
			mLoadingDialog.setCancelable(false);
			mLoadingDialog.setProgressStyle(ProgressDialogEx.STYLE_HORIZONTAL);
			mLoadingDialog.show();
			
		}else if(mLoadingDialog!=null && !mLoadingDialog.isShowing()){
			mLoadingDialog.show();
		}		
	}
	
	private void dismissLoadingDialog(){
		if(mLoadingDialog != null && mLoadingDialog.isShowing()){
			mLoadingDialog.dismiss();
		}
	}
	
	public void onBackPressed() {
		if (mLoadingDialog!=null && mLoadingDialog.isShowing()) {
			mCancel = true;
		} else {
			super.onBackPressed();
		}
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			
			if (mLoadingDialog!=null && mLoadingDialog.isShowing()) {
				mCancel = true;
			} else {
				finish();
			}
			
			return false;
		}

		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean handleMessage(Message msg) {
		int what = msg.what;

		if (MESSAGE_GENERATE_SUCCESS == what) {
			Toast.makeText(this, R.string.message_generate_finish, Toast.LENGTH_SHORT).show();
			resetItems();
			dismissLoadingDialog();
			return true;
		} else if (MESSAGE_GENERATE_FAILED == what) {
			Toast.makeText(this, R.string.message_generate_cancel, Toast.LENGTH_SHORT).show();
			resetItems();
			dismissLoadingDialog();
			return true;
		}

		return false;
	}
}
