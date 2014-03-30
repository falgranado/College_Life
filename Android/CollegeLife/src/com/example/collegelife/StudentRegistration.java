package com.example.collegelife;


import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class StudentRegistration extends Activity {

	//Private Fields

		private Button saveAndCreateButton;
		private EditText studentName,studentNumber,studentPassWord,studentReEnterPassword;



		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_student_registration);

		
			//This method initializes all fields
			instantiateFields();

			//This method will save the student data into the text file 
			saveAndCreateStudent();





		}

		private void saveAndCreateStudent() {




			//Step 1: Making the button responsive to user touch using onClick listener interfaces
			saveAndCreateButton.setOnClickListener( new OnClickListener() {

				//Event handler method
				@Override
				public void onClick(View v) {

					//Do something when the user hits this button
					if(!checkStudentPassWord())
					{	
						Toast.makeText( StudentRegistration.this, "Password not match! ", Toast.LENGTH_SHORT).show();

					}
					else
					{
						Toast.makeText( StudentRegistration.this, "Student Saved ", Toast.LENGTH_SHORT).show();

					}


				}


			});





		}

		private void instantiateFields(){

			saveAndCreateButton = (Button) findViewById(R.id.saveAndCreateButtonID);
			studentName = (EditText) findViewById(R.id.studentNameEditTextViewID);
			studentNumber = (EditText) findViewById(R.id.studentNumberEditTextViewID);
			studentPassWord = (EditText) findViewById(R.id.studentPasswordEditTextViewID);
			studentReEnterPassword = (EditText) findViewById(R.id.studentReEnterPasswordEditTextViewID);
		}

		private boolean checkStudentPassWord()
		{
			return studentPassWord.getText().toString().equals(studentReEnterPassword.getText().toString());

		}
		private boolean checkFields() 
		{
			return studentName.getText().toString().isEmpty()
					&&studentNumber.getText().toString().isEmpty()
					&&studentPassWord.getText().toString().isEmpty()
					&&studentReEnterPassword.getText().toString().isEmpty();
		}


}
