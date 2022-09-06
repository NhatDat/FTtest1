package com.example.fttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button btnDangKy;
    TextView txt_dangnhap;
    RadioButton rdNam, rdNu, rdKhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnDangKy= findViewById(R.id.btnDangKi);
        txt_dangnhap = findViewById(R.id.txt_dangnhap);
        rdNam = findViewById(R.id.rd_nam);
        rdNu = findViewById(R.id.rd_nu);
        rdKhac = findViewById(R.id.rd_khac);


        rdNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdNam.setChecked(true);
                rdNu.setChecked(false);
                rdKhac.setChecked(false);
            }
        });

        rdNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdNam.setChecked(false);
                rdNu.setChecked(true);
                rdKhac.setChecked(false);
            }
        });

        rdKhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdNam.setChecked(false);
                rdNu.setChecked(false);
                rdKhac.setChecked(true);
            }
        });

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        txt_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }
}