package com.example.relativecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText m1, m2;
    Button btntambah, btnkurang, btnkali, btnbagi;
    EditText result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = findViewById(R.id.input1);
        m2 = findViewById(R.id.input2);
        btntambah = findViewById(R.id.tambah);
        btnkurang = findViewById(R.id.kurang);
        btnkali = findViewById(R.id.kali);
        btnbagi = findViewById(R.id.bagi);
        result = findViewById(R.id.result);

        //OPERASI TAMBAH
        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operasi1 = Double.parseDouble(m1.getText().toString());
                double operasi2 = Double.parseDouble(m2.getText().toString());
                double hasil = operasi1 + operasi2;
                result.setText(Double.toString(hasil));
            }
        });

        //OPERASI KURANG
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operasi1 = Double.parseDouble(m1.getText().toString());
                double operasi2 = Double.parseDouble(m2.getText().toString());
                double hasil = operasi1 - operasi2;
                result.setText(Double.toString(hasil));
            }
        });

        //OPERASI KALI
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operasi1 = Double.parseDouble(m1.getText().toString());
                double operasi2 = Double.parseDouble(m2.getText().toString());
                double hasil = operasi1 * operasi2;
                result.setText(Double.toString(hasil));
            }
        });

        //OPERASI BAGI
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operasi1 = Double.parseDouble(m1.getText().toString());
                double operasi2 = Double.parseDouble(m2.getText().toString());
                double hasil = operasi1 / operasi2;
                result.setText(Double.toString(hasil));
            }
        });

    }
}
