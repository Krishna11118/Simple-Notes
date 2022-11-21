package com.example.newnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       h.postDelayed(new Runnable()
       {
           @Override
           public void run(){

               Intent i = new Intent(splashActivity.this,MainActivity.class  );
               startActivity(i);
               finish();

           }
       },1000);
    }
}