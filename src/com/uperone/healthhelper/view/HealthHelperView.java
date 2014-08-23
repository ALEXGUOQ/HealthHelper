package com.uperone.healthhelper.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

import com.uperone.healthhelper.view.style.ArcPathFactory;
import com.uperone.healthhelper.view.style.CircleFactory;
import com.uperone.healthhelper.view.style.PathAbstractFactory;
import com.uperone.healthhelper.view.style.RoadPathFactory;

public class HealthHelperView extends View {
	public HealthHelperView(Context context) {
		super(context);
		initHealthHelper( );
	}
	
	public HealthHelperView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initHealthHelper( );
	}
	
	public HealthHelperView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initHealthHelper( );
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		this.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		drawText( canvas, mShowTxt );
	}
	
	public void setText( String text ){
		mShowTxt = text;
		reset( );
		postInvalidate( );
	}
	
	public void setType( int type ){
		mType = type;
		reset( );
		postInvalidate( );
	}
	
	private void reset( ){
		mPath.reset( );
		mCurrentContent = "";
		mCurrentCnt = 0;
	}
	
	private void drawText( Canvas canvas, String content ){
		if( TextUtils.isEmpty( content ) ){
			return;
		}
		
		switch( mType ){
		case TYPE_CIRCLE:{
			if( null == mPathAbstractFactory || !( mPathAbstractFactory instanceof CircleFactory ) ){
				mPathAbstractFactory = new CircleFactory( getWidth( ), getHeight( ) );
			}
		}
		break;
		case TYPE_ARC:{
			if( null == mPathAbstractFactory || !( mPathAbstractFactory instanceof ArcPathFactory ) ){
				mPathAbstractFactory = new ArcPathFactory( getWidth( ), getHeight( ) );
			}
		}
		break;
		case TYPE_ROAD:{
			if( null == mPathAbstractFactory || !( mPathAbstractFactory instanceof RoadPathFactory ) ){
				mPathAbstractFactory = new RoadPathFactory( getWidth( ), getHeight( ) );
			}
		}
		break;
		default:{
			
		}
		break;
		}
		
		mPathAbstractFactory.draw( canvas, mPaint, mCurrentContent );
		if (mCurrentContent.length() < mShowTxt.length()){
            postDelayed(invalidateRunnable, INVALIDATE_TIME_LEN);
    	}
	}
	
	private PathAbstractFactory mPathAbstractFactory = null;
	
	private void initHealthHelper( ){
		mPaint = new Paint( );
		mPath = new Path( );
		
		mPaint.setColor(Color.BLUE);
		mPaint.setStyle(Paint.Style.FILL);
		mPaint.setStrokeWidth(2);
		mPaint.setTextSize( mFontSize );
	}
	
	private Runnable invalidateRunnable = new Runnable() {
        @Override
        public void run() {
        	if( mCurrentCnt + 1 < mShowTxt.length( ) ){
        		mCurrentContent += mShowTxt.substring(mCurrentCnt, ++mCurrentCnt);
                invalidate();
        	}
        }
    };
	
	public static final int TYPE_CIRCLE = 0x01;
	public static final int TYPE_ARC = 0x02;
	public static final int TYPE_ROAD = 0x03;
	private int mType = TYPE_CIRCLE;
	private int mFontSize = 40;
	private Paint mPaint = null;
	private Path mPath = null;
	private String mShowTxt = null;
	private static final int INVALIDATE_TIME_LEN = 40;
    private int mCurrentCnt = 0;
	private String mCurrentContent = null;
}
