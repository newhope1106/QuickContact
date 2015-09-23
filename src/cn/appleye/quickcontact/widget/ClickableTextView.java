package cn.appleye.quickcontact.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ClickableTextView extends TextView{
	private int mNormalColor = 0xffecf0f1;
	private int mPressedColor = 0xff2ecc71;
	
	private boolean mChecked = false;

	public ClickableTextView(Context context) {
		super(context);
		setBackgroundColor(mNormalColor);
	}
	
	public ClickableTextView(Context context, AttributeSet attrs){
		super(context, attrs);
		setBackgroundColor(mNormalColor);
	}
	
	public ClickableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		setBackgroundColor(mNormalColor);
	}
	
	public void setChecked(boolean isChecked) {
		mChecked = isChecked;
		
		if (mChecked) {
			setBackgroundColor(mPressedColor);
		} else {
			setBackgroundColor(mNormalColor);
		}
	}
	
	public boolean isChecked() {
		return mChecked;
	}
	
	public void toggole() {
		setChecked(!mChecked);
	}
}
