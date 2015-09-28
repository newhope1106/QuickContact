package cn.appleye.quickcontact;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import cn.appleye.quickcontact.utils.SettingsUtils;
import cn.appleye.quickcontact.widget.CheckableTextView;

public class SettingsActivity extends Activity{
	private ListView mListView;
	
	private ArrayList<Entry> mEntries = new ArrayList<Entry>();
	
	private ArrayAdapter<Entry> mAdapter ;
	
	private LayoutInflater mInflater;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_settings_activity);
		
		mListView = (ListView) findViewById(R.id.settings_list);
		
		mInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		initPreference();
		setupListView();
	}
	
	private void initPreference() {
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_DISPLAY_NAME, getString(R.string.generate_display_name)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_NICK_NAME, getString(R.string.generate_nick_name)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_PNONE_NUMBER, getString(R.string.generate_phone_number)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_EMAIL, getString(R.string.generate_email)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_POSTAL, getString(R.string.generate_postal)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_IM, getString(R.string.generate_im)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_ORG, getString(R.string.generate_org)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_PHOTO, getString(R.string.generate_photo)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_NOTE, getString(R.string.generate_note)));
		mEntries.add(new Entry(SettingsUtils.PRE_KEY_WEBSITE, getString(R.string.generate_web_site)));
	}
	
	private void setupListView() {

		mAdapter = new ArrayAdapter<Entry>(this, 0, mEntries){
			@Override
	        public View getView(int position, View convertView, ViewGroup parent){
				CheckableTextView checkableTextView;
				if (convertView == null) {
					checkableTextView = (CheckableTextView)mInflater.inflate(R.layout.setting_list_item_view, null);
				} else {
					checkableTextView = (CheckableTextView)convertView;
				}
				
				Entry entry = mEntries.get(position);
				
				checkableTextView.setText(entry.getTitle());
				checkableTextView.setChecked(entry.isChecked());
				
				return checkableTextView;
			}
		};
				
		mListView.setAdapter(mAdapter);
		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				CheckableTextView checkableTextView = (CheckableTextView) view;
				
				if (checkableTextView != null) {
					checkableTextView.toggole();
					mEntries.get(position).setChecked(checkableTextView.isChecked());
				}
			}
		});
		
		View footerView = mInflater.inflate(R.layout.settings_list_footer_view, null);
		mListView.addFooterView(footerView);
		
		footerView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
	}
	
	private class Entry{
		private String mTitle;
		private String mKey;
		private boolean mIsChecked;
		
		public Entry(String key, String title, boolean isChecked) {
			mKey = key;
			mTitle = title;
			mIsChecked = isChecked;
		}
		
		public Entry(String key, String title) {
			this(key, title, false);
		}
		
		public String getTitle() {
			return mTitle;
		}
		
		public String getKey() {
			return mKey;
		}
		
		public void setChecked(boolean isChecked) {
			mIsChecked = isChecked;
		}
		
		public boolean isChecked() {
			return mIsChecked;
		}
	}
}
