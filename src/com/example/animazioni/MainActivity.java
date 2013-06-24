package com.example.animazioni;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button tastoSposta;
	TextView testo;
	Animazione miaAnimazione;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		testo = (TextView) findViewById(R.id.testo);
		font = Typeface.createFromAsset(getAssets(),
				"Magician.ttf");
		testo.setVisibility(View.INVISIBLE);
		tastoSposta = (Button) findViewById(R.id.tasto_sposta);
		tastoSposta.setTypeface(font);
		miaAnimazione = new Animazione();
		tastoSposta.setAnimation(miaAnimazione.inFromBottomAnimation(3000));
		tastoSposta.setOnClickListener(this);
		testo.setTypeface(font);
		
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if (v == tastoSposta) {
			if(testo.getVisibility()==View.INVISIBLE){
			testo.setVisibility(View.VISIBLE);
			}
			else
				testo.setVisibility(View.INVISIBLE);

		}
		// TODO Auto-generated method stub

	}

}
