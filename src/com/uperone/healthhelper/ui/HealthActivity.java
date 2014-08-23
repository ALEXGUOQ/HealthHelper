package com.uperone.healthhelper.ui;

import android.view.View;
import android.widget.Button;

import com.uperone.healthhelper.R;
import com.uperone.healthhelper.view.HealthHelperView;

public class HealthActivity extends BaseActivity {
	@Override
	public void setContentView() {
		setContentView(R.layout.activity_health_layout);
	}
	
	public void onClick( View view ){
		switch( view.getId( ) ){
		case R.id.changeTypeBtnId:{
			changeType( mType );
		}
		break;
		default:{
			
		}
		break;
		}
	}

	@Override
	public void findViews() {
		mTypeBtn = ( Button )findViewById(R.id.changeTypeBtnId);
		mHealthHelperView = ( HealthHelperView )findViewById(R.id.healthHelperViewId);
	}

	@Override
	public void getData() {
		
	}

	@Override
	public void showContent() {
		mHealthHelperView.setType( HealthHelperView.TYPE_ARC );
		mHealthHelperView.setText( mContent );
	
		mTypeBtn.setText( "«–ªª¿‡–Õ" );
	}
	
	private void changeType( int type ){
		switch( type ){
		case HealthHelperView.TYPE_ARC:{
			mType = HealthHelperView.TYPE_CIRCLE;
		}
		break;
		case HealthHelperView.TYPE_CIRCLE:{
			mType = HealthHelperView.TYPE_ROAD;
		}
		break;
		case HealthHelperView.TYPE_ROAD:{
			mType = HealthHelperView.TYPE_ARC;
		}
		break;
		default:{
			
		}
		break;
		}
		
		mHealthHelperView.setType( mType );
	}

	private int mType = HealthHelperView.TYPE_ARC;
	private Button mTypeBtn = null;
	private HealthHelperView mHealthHelperView = null;
	private static final String mContent = ".....................................................................................................................................................";
}
