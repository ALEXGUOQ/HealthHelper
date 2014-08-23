package com.uperone.healthhelper.view.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class ArcPathFactory extends PathAbstractFactory {
	public ArcPathFactory( int width, int height ){
		mWidth = width;
		mHeight = height;
	}
	
	@Override
	public void draw( Canvas canvas, Paint paint, String content ) {
		int offset = 0;
		int startRotate = 0;
		int sweepRotate = 0;
		
		for( int index = 0; index < 8; index++ ){
			if( index % 2 == 0 ){
				startRotate = -150;
				sweepRotate = 120;
				offset += 2*mFontSize;
			}else{
				startRotate = -30;
				sweepRotate = -120;
				offset += 2*mFontSize;
			}
			
			mPath.arcTo(new RectF(offset, offset, mWidth - offset, mHeight - offset), startRotate, sweepRotate);
		}
		
		canvas.drawTextOnPath( content, mPath, 0, 0, paint );
	}
}
