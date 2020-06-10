package com.example.orderapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.orderapp.Adapter.MydatabaseHelper;
import com.example.orderapp.Login.login;
import com.example.orderapp.Login.regist;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    private Button btntest;
    private Button btn2;
    private MydatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntest = findViewById(R.id.btn1);
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, login.class);
                startActivity(intent);

            }
        });
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, regist.class);
                startActivity(intent);
            }
        });

    }
}