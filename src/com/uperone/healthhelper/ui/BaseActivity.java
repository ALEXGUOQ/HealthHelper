package com.uperone.healthhelper.ui;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init( );
	}
	
	private void init( ){
		setContentView( );
		findViews( );
		getData( );
		showContent( );
	}
	
	public abstract void setContentView( );
	public abstract void findViews( );
	public abstract void getData( );
	public abstract void showContent( );
}
