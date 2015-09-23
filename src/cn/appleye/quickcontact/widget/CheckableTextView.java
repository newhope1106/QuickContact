package cn.appleye.quickcontact.widget;

import cn.appleye.quickcontact.R;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.View;

public class CheckableTextView extends TextView implements View.OnClickListener{
	private int mNormalColor = 0xffecf0f1;
	
	private boolean mIsChecked = false;
	private Drawable mCheckDrawable;
	
	private int mCheckWidth;
	private int mCheckHeight;
	
	public CheckableTextView(Context context) {
		super(context);
		setBackgroundColor(mNormalColor);
		
		mCheckDrawable = context.getResources().getDrawable(R.drawable.btn_check_on);
		mCheckWidth = mCheckDrawable.getIntrinsicWidth();
		mCheckHeight = mCheckDrawable.getIntrinsicHeight();
		
		setOnClickListener(this);
	}
	
	public CheckableTextView(Context context, AttributeSet attrs){
		super(context, attrs);
		setBackgroundColor(mNormalColor);
		
		mCheckDrawable = context.getResources().getDrawable(R.drawable.btn_check_on);
		mCheckWidth = mCheckDrawable.getIntrinsicWidth();
		mCheckHeight = mCheckDrawable.getIntrinsicHeight();
		
		setOnClickListener(this);
	}
	
	public CheckableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		setBackgroundColor(mNormalColor);
		
		mCheckDrawable = context.getResources().getDrawable(R.drawable.btn_check_on);
		mCheckWidth = mCheckDrawable.getIntrinsicWidth();
		mCheckHeight = mCheckDrawable.getIntrinsicHeight();
		
		setOnClickListener(this);
	}
	
	public void setChecked(boolean isChecked) {
		mIsChecked = isChecked;
		
		requestLayout();
	}
	
	public boolean isChecked() {
		return mIsChecked;
	}
	
	public void toggole() {
		setChecked(!mIsChecked);
	}
	
	@Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
		if (mIsChecked) {
			int width = right-left;
			int height = bottom-top;
			mCheckDrawable.setBounds(width - mCheckWidth, (height - mCheckHeight)/2, width, (height + mCheckHeight)/2);
		}
		
		super.onLayout(changed, left, top, right, bottom);
	}
	
	/**
	 * we will draw the checked image here
	 * */
	@Override
	protected void dispatchDraw(Canvas canvas) {
		
		if (mIsChecked) {
			mCheckDrawable.draw(canvas);
		}
		
		super.dispatchDraw(canvas);
	}

	@Override
	public void onClick(View v) {
		toggole();
	}
}
