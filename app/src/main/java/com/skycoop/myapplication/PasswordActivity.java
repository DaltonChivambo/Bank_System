package com.skycoop.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class PasswordActivity extends AppCompatActivity {

    private EditText edit_password;
    private Button bt_sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        Objects.requireNonNull(getSupportActionBar()).hide();

        edit_password = findViewById(R.id.edit_password);
        bt_sign = findViewById(R.id.bt_sign);

        bt_sign.setOnClickListener(view -> {
            int registeredPassword = 111111;
            int typedPassword;
        });
    }
}