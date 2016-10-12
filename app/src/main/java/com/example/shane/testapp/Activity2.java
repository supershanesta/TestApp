package com.example.shane.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.textViewtest);
        textView.setTextSize(40);
        textView.setText(extras.getString("Passed_String"));




    }
}
