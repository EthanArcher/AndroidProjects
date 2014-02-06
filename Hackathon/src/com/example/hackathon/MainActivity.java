package com.example.hackathon;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.Random;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
	
	Random rnd = new Random(); // Allows generation of a random number
	
	int playerScore = 0;
	int computerScore = 0;
	
	int num = rnd.nextInt(5) + 1;
	String result;
	//ImageView player = (ImageView) findViewById(R.id.Input);
	//ImageView computer = (ImageView) findViewById(R.id.Output);
	

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

	/*public void onMyButtonClick(View view)
    {
		 Button b1;
		 b1 = (Button)findViewById(R.id.button1);
		
		if (((Button)view).getId() == button1.getId())
			
		
		
    } */
	
	
	public void onRockClick (View view){
		
		num = rnd.nextInt(5) + 1;
		
		ImageView player = (ImageView) findViewById(R.id.Input);
		ImageView computer = (ImageView) findViewById(R.id.Output);
		TextView pScore = (TextView) findViewById(R.id.textView3);
		TextView cScore = (TextView) findViewById(R.id.textView4);
		
		player.setImageResource(R.drawable.rock);
		
		switch(num)
		{
		case 1:
			result = "Draw";
			computer.setImageResource(R.drawable.rock);
			break;
		case 2:
			result = "Lose";
			computer.setImageResource(R.drawable.paper);
			Toast.makeText(this, "Paper covers rock", Toast.LENGTH_SHORT).show();
			break;
		case 3:
			result = "Win";
			computer.setImageResource(R.drawable.scissors);
			Toast.makeText(this, "Rock breaks scissors", Toast.LENGTH_SHORT).show();
			break;
		case 4:
			result = "Win";
			computer.setImageResource(R.drawable.lizard);
			Toast.makeText(this, "Rock crushes lizard", Toast.LENGTH_SHORT).show();
			break;
		case 5:
			result = "Lose";
			computer.setImageResource(R.drawable.spock);
			Toast.makeText(this, "Spock vaporizes rock", Toast.LENGTH_SHORT).show();
			
			break;
		}
		
		if (result.equals("Draw")){
			Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
		}
		
		if (result.equals("Win")){
			playerScore++;
			pScore.setText("" + playerScore); 
		}
		
		if (result.equals("Lose")){
			computerScore++;
			cScore.setText("" + computerScore); 
		}
		
		if (playerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
		if (computerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
	}
	
	public void onPaperClick (View view){
		
		num = rnd.nextInt(5) + 1;
		
		ImageView player = (ImageView) findViewById(R.id.Input);
		ImageView computer = (ImageView) findViewById(R.id.Output);
		TextView pScore = (TextView) findViewById(R.id.textView3);
		TextView cScore = (TextView) findViewById(R.id.textView4);
		
		player.setImageResource(R.drawable.paper);
		
		switch(num)
		{
		case 1:
			result = "Win";
			computer.setImageResource(R.drawable.rock);
			Toast.makeText(this, "Paper covers rock", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			result = "Draw";
			computer.setImageResource(R.drawable.paper);
			break;
		case 3:
			result = "Lose";
			computer.setImageResource(R.drawable.scissors);
			Toast.makeText(this, "Scissors cut paper", Toast.LENGTH_SHORT).show();
			break;
		case 4:
			result = "Lose";
			computer.setImageResource(R.drawable.lizard);
			Toast.makeText(this, "Lizard eats paper", Toast.LENGTH_SHORT).show();
			
			break;
		case 5:
			result = "Win";
			computer.setImageResource(R.drawable.spock);
			Toast.makeText(this, "Paper disproves Spock", Toast.LENGTH_SHORT).show();
			break;
		}
		
		if (result.equals("Draw")){
			Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
		}
		
		if (result.equals("Win")){
			playerScore++;
			pScore.setText("" + playerScore); 
		}
		
		if (result.equals("Lose")){
			computerScore++;
			cScore.setText("" + computerScore); 
		}
		
		if (playerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
		if (computerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
	}
	
	public void onScissorsClick (View view){
		
		num = rnd.nextInt(5) + 1;
		
		ImageView player = (ImageView) findViewById(R.id.Input);
		ImageView computer = (ImageView) findViewById(R.id.Output);
		TextView pScore = (TextView) findViewById(R.id.textView3);
		TextView cScore = (TextView) findViewById(R.id.textView4);
		
		player.setImageResource(R.drawable.scissors);
		
		switch(num)
		{
		case 1:
			result = "Lose";
			computer.setImageResource(R.drawable.rock);
			Toast.makeText(this, "Rock breaks scissors", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			result = "Win";
			computer.setImageResource(R.drawable.paper);
			Toast.makeText(this, "Scissors cut paper", Toast.LENGTH_SHORT).show();
			break;
		case 3:
			result = "Draw";
			computer.setImageResource(R.drawable.scissors);
			break;
		case 4:
			result = "Win";
			computer.setImageResource(R.drawable.lizard);
			Toast.makeText(this, "Scissors decapitate lizard", Toast.LENGTH_SHORT).show();
			break;
		case 5:
			result = "Lose";
			computer.setImageResource(R.drawable.spock);
			Toast.makeText(this, "Spock melts scissors", Toast.LENGTH_SHORT).show();
			break;
		}
		
		if (result.equals("Draw")){
			Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
		}
		
		if (result.equals("Win")){
			playerScore++;
			pScore.setText("" + playerScore); 
		}
		
		if (result.equals("Lose")){
			computerScore++;
			cScore.setText("" + computerScore); 
		}
		
		if (playerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
		if (computerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
	}
	
	public void onLizardClick (View view){
		
		num = rnd.nextInt(5) + 1;
		
		ImageView player = (ImageView) findViewById(R.id.Input);
		ImageView computer = (ImageView) findViewById(R.id.Output);
		TextView pScore = (TextView) findViewById(R.id.textView3);
		TextView cScore = (TextView) findViewById(R.id.textView4);
		
		player.setImageResource(R.drawable.lizard);
		
		switch(num)
		{
		case 1:
			result = "Lose";
			computer.setImageResource(R.drawable.rock);
			Toast.makeText(this, "Rock crushes lizard", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			result = "Win";
			computer.setImageResource(R.drawable.paper);
			Toast.makeText(this, "Lizard eats paper", Toast.LENGTH_SHORT).show();
			break;
		case 3:
			result = "Lose";
			computer.setImageResource(R.drawable.scissors);
			Toast.makeText(this, "Scissors decapitate lizard", Toast.LENGTH_SHORT).show();
			break;
		case 4:
			result = "Draw";
			computer.setImageResource(R.drawable.lizard);
			break;
		case 5:
			result = "Win";
			computer.setImageResource(R.drawable.spock);
			Toast.makeText(this, "Lizard poisons Spock", Toast.LENGTH_SHORT).show();
			break;
		}
		
		if (result.equals("Draw")){
			Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
		}
		
		if (result.equals("Win")){
			playerScore++;
			pScore.setText("" + playerScore); 
		}
		
		if (result.equals("Lose")){
			computerScore++;
			cScore.setText("" + computerScore); 
		}
		
		if (playerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
		if (computerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
	}
	
	public void onSpockClick (View view){
		
		num = rnd.nextInt(5) + 1;
		
		ImageView player = (ImageView) findViewById(R.id.Input);
		ImageView computer = (ImageView) findViewById(R.id.Output);
		TextView pScore = (TextView) findViewById(R.id.textView3);
		TextView cScore = (TextView) findViewById(R.id.textView4);
		
		player.setImageResource(R.drawable.spock);
		
		switch(num)
		{
		case 1:
			result = "Win";
			computer.setImageResource(R.drawable.rock);
			Toast.makeText(this, "Spock vaporizes rock", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			result = "Lose";
			computer.setImageResource(R.drawable.paper);
			Toast.makeText(this, "Paper disproves Spock", Toast.LENGTH_SHORT).show();
			break;
		case 3:
			result = "Win";
			computer.setImageResource(R.drawable.scissors);
			Toast.makeText(this, "Spock melts scissors", Toast.LENGTH_SHORT).show();
			break;
		case 4:
			result = "Lose";
			computer.setImageResource(R.drawable.lizard);
			Toast.makeText(this, "Lizard poisons Spock", Toast.LENGTH_SHORT).show();
			break;
		case 5:
			result = "Draw";
			computer.setImageResource(R.drawable.spock);
			break;
		}
		
		if (result.equals("Draw")){
			Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
		}
		
		if (result.equals("Win")){
			playerScore++;
			pScore.setText("" + playerScore); 
		}
		
		if (result.equals("Lose")){
			computerScore++;
			cScore.setText("" + computerScore); 
		}
		
		if (playerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
		if (computerScore == 5){
			Toast.makeText(this, "YOU WIN!!! :)", Toast.LENGTH_SHORT).show();
			playerScore = 0;
			computerScore = 0;
			pScore.setText("" + playerScore); 
			cScore.setText("" + computerScore);
			player.setImageResource(R.drawable.mark);
			computer.setImageResource(R.drawable.mark);
			
		}
		
	}
}

