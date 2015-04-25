package com.pb.planner;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends Activity
{
	private EditText userName = null;
	private EditText password = null;
	private Button login; 	

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        userName = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);
        login = (Button)findViewById(R.id.button1);
     }

    public void login(View view)
    {
        if (userName.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {
        	Toast.makeText(getApplicationContext(), "Redirecting...", 
        			Toast.LENGTH_SHORT).show();
        }	
        else
        {
        	Toast.makeText(getApplicationContext(), "Wrong Credentials",
        			Toast.LENGTH_SHORT).show();
        }
    }
    
    
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
     }

}
