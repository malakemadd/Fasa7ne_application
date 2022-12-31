package com.example.fasa7neeee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseDest extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_dest);

		Button zamalek = (Button) findViewById(R.id.button5);
		zamalek.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ChooseDest.this, zamalek.class));

			}
		});

		Button sheikh = (Button) findViewById(R.id.button6);
		sheikh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ChooseDest.this, sheikhzayed.class));

			}
		});
	}
}