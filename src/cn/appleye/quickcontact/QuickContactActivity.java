package cn.appleye.quickcontact;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import cn.appleye.quickcontact.common.ListAdapter;

public class QuickContactActivity extends Activity implements LoaderCallbacks<Cursor>{
	private static final String TAG = "QuickContactActivity";
	
	private EditText mSearchView;
	
	private ListView mListView;
	private ListAdapter mAdapter;
	private View mCreateContactsView;
	private View mContainerView;
	
	private View mSettingsView;
	private View mSlideGenerateView;
	
	private String mLastQueryString = "";
	
	private SlidingMenu mSlideMenu;
	
	private static final int LOADER_ID = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quick_contact);

		mSearchView = (EditText)findViewById(R.id.search_view);
		
		mAdapter = new ListAdapter(this);
		mListView = (ListView)findViewById(R.id.list_view);
		mCreateContactsView = findViewById(R.id.generate_contacts);
		mContainerView = findViewById(R.id.container_view);
		mListView.setEmptyView(mCreateContactsView);
		
		mCreateContactsView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startGenerateActivity();
			}
		});
		
		setupSlideMenu();
		setupSearchView();
		setupListView();
		
		startLoading();
	}
	
	private void setupSlideMenu() {
		mSlideMenu = new SlidingMenu(this);
		mSlideMenu.setMode(SlidingMenu.LEFT);
		mSlideMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		mSlideMenu.setShadowWidthRes(R.dimen.shadow_width);
		mSlideMenu.setShadowDrawable(R.drawable.shadow);
		mSlideMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		mSlideMenu.setFadeDegree(0.35f);
		mSlideMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		mSlideMenu.setMenu(R.layout.slide_menu);
        
        mSettingsView = mSlideMenu.findViewById(R.id.settings_view);
        mSlideGenerateView = mSlideMenu.findViewById(R.id.slide_generate_view);
        
        mSlideGenerateView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startGenerateActivity();
			}
		});
        
        mSettingsView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startSettingsActivity();
			}
		});
	}
	
	private void startGenerateActivity() {
		final Intent intent = new Intent(this, ContactGenerateActivity.class);
		startActivity(intent);
	}
	
	private void startSettingsActivity() {
		final Intent intent = new Intent(this, SettingsActivity.class);
		startActivity(intent);
	}
	
	private void setupSearchView() {
		mSearchView.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
	
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				startQuery();
			}
		});
	}
	
	private void setupListView() {
		mListView.setAdapter(mAdapter);
		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Uri uri = (Uri)mAdapter.getItem(position);
				
				Log.d(TAG, "[onItemClick] uri = " + uri);
				if (uri != null) {
					final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
					startActivity(intent);
				}
			}
		});
	}
	
	private void startLoading() {
		getLoaderManager().initLoader(LOADER_ID, null, this);
	}
	
	private void startQuery() {
		String queryString = mSearchView.getText().toString();
		mAdapter.setQueryString(queryString);
		
		if ((mLastQueryString==null && queryString == mLastQueryString) || queryString.equals(mLastQueryString)) {
			
		} else {
			getLoaderManager().restartLoader(LOADER_ID, null, this);
		}
		
		mLastQueryString = queryString;
	}
	
	private CursorLoader createCursorLoader() {
        return new CursorLoader(this, null, null, null, null, null);
    }

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		CursorLoader cursorLoader = createCursorLoader();
		mAdapter.configureLoader(cursorLoader);
		
		return cursorLoader;
	}
	
	public void onBackPressed() {
		if (mSlideMenu.isMenuShowing()) {
			mSlideMenu.toggle();
		} else {
			super.onBackPressed();
		}
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		mSlideMenu.toggle();
		
		return false;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
		Log.d(TAG, "[onLoadFinished] data.getCount = " + data.getCount());
		mAdapter.changeCursor(data);
		
		if (!mAdapter.isSearchMode() && (data ==null || data.getCount() == 0)) {
			mContainerView.setVisibility(View.GONE);
		} else {
			mContainerView.setVisibility(View.VISIBLE);
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> loader) {
	
	}
}
