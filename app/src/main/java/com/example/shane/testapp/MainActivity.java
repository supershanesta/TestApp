package com.example.shane.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.shane.testapp.R.id.editText1;
import static com.example.shane.testapp.R.id.textView2;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void checkthisout(View v) {
        EditText editText = (EditText) findViewById(R.id.editText1);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("!");
        textView.append(editText.getText());


    }

}



