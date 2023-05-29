package com.uni.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        String usernameVal = username.getText().toString();
        String passwordVal = password.getText().toString();

        if(usernameVal.equals("admin") && passwordVal.equals("admin")){
            Intent intent = new Intent(this, ProActivity.class);
            intent.putExtra("NAME",usernameVal);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ErrorActivity.class);
            intent.putExtra("NAME",usernameVal);
            startActivity(intent);
        }
    }
}