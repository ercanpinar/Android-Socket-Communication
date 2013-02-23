package com.socket.activity;

import android.app.Activity;
import android.os.Bundle;

import com.socket.R;
import com.socket.business.BusinessLogic;

public class MainActivity extends Activity{
	
	private BusinessLogic businessLogic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        businessLogic = new BusinessLogic(this);
        businessLogic.configView();
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	
    	businessLogic.closeCommunication();
    }
    
}