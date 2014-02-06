package com.example.myfirstgame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.Random;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.myfirstgame.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onMyButtonClick(View view)
    {
    	int num; // Stores the random number
		int numTyped; // Stores the number typed in by the user
		
		EditText et; // Will be used to create a local version of the EditText
		
		et = (EditText)findViewById(R.id.editText1); // Locally store the EditText element
		
		Random rnd = new Random(); // Allows generation of a random number
		
		num = rnd.nextInt(10) + 1; // Store a random number between 1 and 10
		
		try // Attempt to execute the proceeding code
		{
			numTyped = Integer.parseInt(et.getText().toString()); // Store the number typed in by the user, ensure integer value
			
			if (numTyped >= 1 && numTyped <= 10) // If the number typed is between 1 and 10
			{
				if (num == numTyped) // If the number was guessed correctly
				{
					Toast.makeText(this, "You guessed correctly!", Toast.LENGTH_SHORT).show(); // Output a toast notifying their success
				}
				else // Otherwise (if the number was not guessed correctly)
				{
					Toast.makeText(this, "You didn't get it right, the number was " + num, Toast.LENGTH_SHORT).show(); // Output a toast notifying their failure
				}
			}
			else // Otherwise (if the number typed was not between 1 and 10)
			{
				Toast.makeText(this, "Please type a number between 1 and 10", Toast.LENGTH_SHORT).show(); // Ask the user to type a number between 1 and 10
			}
		}
		catch(Exception e) // If the code failed to execute (perhaps if they did not type any number)
		{
			Toast.makeText(this, "Please type a number between 1 and 10", Toast.LENGTH_SHORT).show(); // Ask the user to type a number between 1 and 10
		}

    }
    
    
    public void sendData(View view) {
    	
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        
        EditText editText = (EditText) findViewById(R.id.editText2);
        
        String message = editText.getText().toString();
        
        intent.putExtra(EXTRA_MESSAGE, message);
        
        startActivity(intent);
    }
    
    
    
}


