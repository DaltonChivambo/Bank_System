package com.skycoop.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Objects.requireNonNull(getSupportActionBar()).hide();

        //Create transitions in screens
        new Handler().postDelayed(() -> {
            ActivityPassword();
        },2000);
    }


    private void ActivityPassword(){
        //Navegate to other activity (intent)

        Intent intent = new Intent(SplashActivity.this,PasswordActivity.class);
        startActivity(intent);
    }
}