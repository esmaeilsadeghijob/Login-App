package com.uni.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

        Intent intent =  getIntent();
        String name = intent.getStringExtra("NAME");
         TextView textView = (TextView) findViewById(R.id.txtView_1);
        textView.setText(name);
    }
}