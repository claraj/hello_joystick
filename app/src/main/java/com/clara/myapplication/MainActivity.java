package com.clara.myapplication;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;

import com.erz.joysticklibrary.JoyStick;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "JOYSTICK" ;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.d("TAG", "create view");

		JoyStick joystick = (JoyStick) findViewById(R.id.joy1);
		joystick.bringToFront();

		joystick.setListener(new JoyStick.JoyStickListener(){

			@Override
			public void onMove(JoyStick joyStick, double angle, double power, int direction) {
				Log.d(TAG, "MOVE");
			}

			@Override
			public void onTap() {
				Log.d(TAG, "TAP");

			}

			@Override
			public void onDoubleTap() {
				Log.d(TAG, "DOUBLETAP");

			}
		});



	}
}
