package com.example.videoviewsample;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.VideoView;

public class CustomVideoView extends VideoView{

	public CustomVideoView(Context context)
	{
		super(context);
		Log.d("debug", "Context context");
	}

	public CustomVideoView(Context context, AttributeSet attrs)
	{
		super(context, attrs);

		mVideoWidth = 0;
		mVideoHeight = 0;
		Log.d("debug", "Context context, AttributeSet attrs");
	}

	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		int width = getDefaultSize(mVideoWidth, widthMeasureSpec);
		int height = getDefaultSize(mVideoHeight, heightMeasureSpec);
		setMeasuredDimension(width, height);
	}

	private int mVideoWidth;
	private int mVideoHeight;
}