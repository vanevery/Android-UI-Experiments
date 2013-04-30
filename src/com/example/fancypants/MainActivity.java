package com.example.fancypants;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button myButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myButton = (Button) this.findViewById(R.id.button1);
		myButton.setOnClickListener(this);
		Typeface mytypeface = Typeface.createFromAsset(getAssets(), "Amadeus.ttf");
		myButton.setTypeface(mytypeface);
	}

	@Override
	public void onClick(View arg0) {
		Intent i = new Intent(this,MainActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.slideout,R.anim.slidein);
	}

}
