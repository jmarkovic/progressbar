package com.markovic.progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	
	EditText etUnos;
	TextProgressBar textProgressBar;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    textProgressBar = (TextProgressBar) findViewById(R.id.progressBarWithText);
	    textProgressBar.setText("Loading 0%");
	    textProgressBar.setProgress(0);
	    textProgressBar.setTextSize(18);
	    
	    button = (Button) findViewById(R.id.button1);
	    button.setOnClickListener(this);
	    
	    etUnos = (EditText) findViewById(R.id.editText1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			int num = Integer.parseInt(etUnos.getText().toString());
			textProgressBar.setProgress(num);
			textProgressBar.setText("Loading " + num + "%");
		}
		
	}

}
