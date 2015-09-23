package cn.appleye.quickcontact;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
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
import cn.appleye.quickcontact.widget.CheckableTextView;
import cn.appleye.quickcontact.widget.ClickableTextView;

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
	
	private ProgressDialog mLoadingDialog = null;
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
		mResetBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mSimpleInfoView.setChecked(true);
				mFullInfoView.setChecked(false);
				mCountsView.setText("");
				mMultiNumberCheckbox.setChecked(false);
				mSameRepeatCheckbox.setChecked(false);
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
	
	private void startGenerate(String countText) {
		try{
			final int count = Integer.parseInt(countText);
			
			showLoadingDialog();
			
			mLoadingDialog.setMax(count);
			
			mCancel = false;
			
			new Thread() {
				public void run() {
					ArrayList<ContentProviderOperation> operationList = new ArrayList<ContentProviderOperation>();
					for (int i=0; i< count; i++) {
						BaseContactType baseContactType = new BaseContactType();
						baseContactType.clear();
						if (mIsSimpleInfo) {
							baseContactType.addDataKindStructuredName();
							baseContactType.addDataKindPhone();
						} else {
							baseContactType.addDataKindStructuredName();
							baseContactType.addDataKindPhone();
							baseContactType.addDataKindEmail();
							baseContactType.addDataKindIm();
							baseContactType.addDataKindNickname();
							baseContactType.addDataKindNote();
							baseContactType.addDataKindOrganization();
							baseContactType.addDataKindWebsite();
							baseContactType.addDataKindStructuredPostal();
						}
						
						Uri uri = RawContacts.CONTENT_URI;
						long rawContactId = ContentUris.parseId(getContentResolver().insert(uri, new ContentValues()));
						
						ArrayList<ContentProviderOperation> perOperationList = baseContactType.buildContentValues(rawContactId, mIsMultiNumberAllowed);

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
			mLoadingDialog = new ProgressDialog(this);
			mLoadingDialog.setTitle(R.string.loading_dialog_title);
			mLoadingDialog.setMessage(getString(R.string.loading_dialog_message));
			mLoadingDialog.setCancelable(false);
			mLoadingDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
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
			dismissLoadingDialog();
			return true;
		} else if (MESSAGE_GENERATE_FAILED == what) {
			Toast.makeText(this, R.string.message_generate_cancel, Toast.LENGTH_SHORT).show();
			dismissLoadingDialog();
			return true;
		}

		return false;
	}
}
