package com.example.collegelife;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView image_college_life;
	
	Button signUpButton, logInButton;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		
		image_college_life = (ImageView) findViewById(R.id.image_college_life);
		onClickButton();
	}
	
	public void onClickButton(){
		
		signUpButton = (Button) findViewById(R.id.button_sign_up);
		logInButton = (Button) findViewById(R.id.button_log_in);
		
		signUpButton.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
				
				startActivity(new Intent(MainActivity.this, StudentRegistration.class));
			    
			}
 
		});
		
		logInButton.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  //Intent activityLogIn; // = new Intent(MainActivity.this ,LoginActivity.class);
			  startActivity(new Intent(MainActivity.this ,LoginActivity.class));
			    
			}
 
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
