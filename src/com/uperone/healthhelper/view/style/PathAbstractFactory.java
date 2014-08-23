package com.uperone.healthhelper.view.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public abstract class PathAbstractFactory {
	public abstract void draw( Canvas canvas, Paint paint, String content );
	
	public int mWidth = 0;
	public int mHeight = 0;
	public Path mPath = new Path( );
	public int mFontSize = 28;
}
