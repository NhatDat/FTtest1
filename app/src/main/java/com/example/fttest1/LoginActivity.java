package com.example.fttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;

public class LoginActivity extends AppCompatActivity {

    //Connect MongoDB Realm
    String Appid = "ft88-uvzmn";
    //--------------------
    Button btnDangNhap;
    TextView txt_dangki,txt_QuenMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Connect MongoDB Realm
        Realm.init(this); // context, usually an Activity or Application
        App app = new App(new AppConfiguration.Builder(Appid).build());

        btnDangNhap= findViewById(R.id.btnDangNhap);
        txt_dangki = findViewById(R.id.txt_dangki);
        txt_QuenMatKhau = findViewById(R.id.txt_QuenMatKhau);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

        txt_dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        txt_QuenMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ResetPasswordActivity.class));
            }
        });
    }
}