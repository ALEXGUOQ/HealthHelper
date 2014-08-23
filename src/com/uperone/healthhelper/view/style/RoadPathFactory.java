package com.uperone.healthhelper.view.style;

import android.graphics.Canvas;
import android.graphics.Paint;

public class RoadPathFactory extends PathAbstractFactory {
	public RoadPathFactory( int width, int height ){
		mWidth = width;
		mHeight = height;
	}
	
	@Override
	public void draw( Canvas canvas, Paint paint, String content ) {
		int startX = 0;
		int startY = 0;
		int stopY = 0;
		
		mPath.moveTo(startX, startY);
		for( int index = 0; index < 10; index++ ){
			if( index % 2 == 0 ){
				stopY = mHeight - mFontSize;
			}else{
				stopY = startY + mFontSize;
			}
			
			mPath.lineTo( startX, stopY );
			startX += 2 * mFontSize;
			mPath.lineTo( startX, stopY + mFontSize );
		}
		
		canvas.drawTextOnPath(content, mPath, 0, 0, paint);
	}
}
