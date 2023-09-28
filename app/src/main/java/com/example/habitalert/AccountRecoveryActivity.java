package com.example.habitalert;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AccountRecoveryActivity extends AppCompatActivity {
    private ImageButton btnBackRecovery;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        btnBackRecovery = findViewById(R.id.btnBackRecovery);
        btnBackRecovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountRecoveryActivity.this, SecondLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
