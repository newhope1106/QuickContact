package cn.appleye.quickcontact;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ContactGenerateActivity extends Activity{
	private RadioGroup mInfoRadioGroup;
	private RadioButton mSimpleInfoRadio;
	private RadioButton mFullInfoRadio;
	private EditText mCountsView;
	private CheckBox mMultiNumberCheckbox;
	private CheckBox mSameRepeatCheckbox;
	private Button mResetBtn;
	private Button mOKBtn;
	
	private boolean mIsSimpleInfo = true;
	private boolean mIsMultiNumberAllowed = false;
	private boolean mIsSameContactRepeat = false;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_generate_contacts);
		
		mInfoRadioGroup = (RadioGroup)findViewById(R.id.radio_group);
		mSimpleInfoRadio = (RadioButton)findViewById(R.id.simple_info_radio);
		mFullInfoRadio = (RadioButton)findViewById(R.id.full_info_radio);
		mCountsView = (EditText)findViewById(R.id.contacts_count);
		mMultiNumberCheckbox = (CheckBox)findViewById(R.id.multi_numbers_checkbox);
		mSameRepeatCheckbox = (CheckBox)findViewById(R.id.same_repeat_checkbox);
		mResetBtn = (Button)findViewById(R.id.reset_btn);
		mOKBtn = (Button)findViewById(R.id.ok_btn);
		
		setEventListener();
	}
	
	private void setEventListener() {
		mResetBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mSimpleInfoRadio.setChecked(true);
				mFullInfoRadio.setChecked(false);
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
					mIsSimpleInfo = mSimpleInfoRadio.isChecked();
					mIsMultiNumberAllowed = mMultiNumberCheckbox.isChecked();
					mIsSameContactRepeat = mSameRepeatCheckbox.isChecked();
					
					startGenerate(countText);
				}
			}
		});
	}
	
	private void startGenerate(String countText) {
		try{
			int count = Integer.parseInt(countText);
			
		}catch(NumberFormatException nfe) {
			Toast.makeText(ContactGenerateActivity.this, R.string.toast_invalid_number, Toast.LENGTH_SHORT).show();
		}
	}
}
