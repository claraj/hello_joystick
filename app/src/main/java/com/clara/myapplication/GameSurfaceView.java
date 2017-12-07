package com.clara.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by admin on 12/6/17.
 */

public class GameSurfaceView extends SurfaceView implements  SurfaceHolder.Callback {

	SurfaceHolder holder;
	Paint p;

	public GameSurfaceView(Context context, AttributeSet set) {
		super(context, set);
		p = new Paint();
		holder = getHolder();
		holder.addCallback(this);
		Log.d("SURFACE", "constructor");

	}

	public void drawSomething(Canvas canvas) {

		Log.d("SURFACE", "drawing");

		p.setColor(Color.BLACK);
		canvas.drawRect(0, 0, 30000, 30000, p);

		p.setColor(Color.MAGENTA);
		p.setStrokeWidth(30);
		canvas.drawLine(20, 900, 800, 700, p);

		p.setColor(Color.CYAN);
		canvas.drawCircle(200, 300, 200, p);
		p.setColor(Color.YELLOW);
		canvas.drawCircle(600, 550, 200, p);

	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		Canvas c = holder.lockCanvas();
		drawSomething(c);
		holder.unlockCanvasAndPost(c);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {

	}
}
