package com.uperone.healthhelper.view.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;

public class CircleFactory extends PathAbstractFactory {
	public CircleFactory( int width, int height ){
		mWidth = width;
		mHeight = height;
		setRadius( );
	}
	
	@Override
	public void draw(Canvas canvas, Paint paint, String content) {
		mPath.addCircle( mWidth / 2, mHeight / 2, mRadius, Direction.CCW);
		canvas.rotate(180, mWidth / 2, mHeight / 2);
		canvas.drawTextOnPath(content, mPath, 0, 0, paint );
	}
	
	private void setRadius( ){
		int halfWidth = mWidth / 2;
		int halfHeight = mHeight / 2;
		
		mRadius = ( halfWidth < halfHeight )?halfWidth:halfHeight;
		mRadius -= 10;
	}

	private int mRadius = 0;
}
