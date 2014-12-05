package com.example.videoviewsample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		VideoView videoView = (VideoView) this.findViewById(R.id.videoView1);
		MediaController mc = new MediaController(this);
		videoView.setMediaController(mc);
	
		// 透過 url 播放
		// videoView.setVideoURI(Uri
		// .parse("http://www.test.123/testmovie.mp4"));

		// 透過 sdcard 路徑播放
		// videoView.setVideoPath("/sdcard/testmovie.mp4");

		/*
		 * 其他 sdcard 路徑的範例，給大家參考 videoView.setVideoURI( Uri.parse("file://" +
		 * Environment.getExternalStoragePublicDirectory(
		 * Environment.DIRECTORY_MOVIES) + "/testmovie.mp4"));
		 */

		// 本次用project下的目錄作為路徑來示範
		videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sunny));

		videoView.requestFocus();
		videoView.start();
	}
}
