package com.example.habitalert;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
public class SecondLoginActivity extends AppCompatActivity {

    private ImageView imageViewWelcome;
    private ImageButton btnBack;
    private Button btnLoginSecond;
    private Button btnRegister;
    private TextView textViewForgotPassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        imageViewWelcome = findViewById(R.id.imageViewWelcome);
        btnLoginSecond = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondLoginActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondLoginActivity.this, RegisterActivity.class);
                startActivity(intent);            }
        });
        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondLoginActivity.this, AccountRecoveryActivity.class);
                startActivity(intent);
            }
        });

    }
}
