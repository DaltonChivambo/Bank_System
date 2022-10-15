package com.skycoop.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView tv_balance;
    private EditText edit_balance;
    private Button bt_withdraw;

    double account_balance = 29000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        initComponents();
        tv_balance.setText("Balance Available:" + " MZN " + account_balance);

        bt_withdraw.setOnClickListener(view -> {
            Double requested_balance = Double.parseDouble(edit_balance.getText().toString());
            Double withdrawal_fee = 20.0;
            Double fee_plus_money = requested_balance + withdrawal_fee;

            if (account_balance < fee_plus_money){
                Toast.makeText(MainActivity.this,"Transaction Failed: Insufficient Balance",Toast.LENGTH_SHORT).show();

            }else if (requested_balance < 100 || requested_balance > 25000){
                Toast.makeText(MainActivity.this,"Transaction Failed: Cash withdrawal From 100MZN to 25000MZN",Toast.LENGTH_SHORT).show();
            }else {
                account_balance -= requested_balance+ withdrawal_fee;
                Toast.makeText(MainActivity.this,"Successful Withdrawal "+ requested_balance+"0MZN",Toast.LENGTH_SHORT).show();
                tv_balance.setText("Balance Available:" + " MZN " + account_balance);

            }
        });

    }

    private void initComponents(){
        tv_balance = findViewById(R.id.tv_balance);
        edit_balance = findViewById(R.id.edit_balance);
        bt_withdraw = findViewById(R.id.bt_withdraw);
    }
}