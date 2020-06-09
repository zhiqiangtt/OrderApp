package com.example.orderapp;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class ActionActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView mORNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        initView();
    }

    private void initView() {
        // 初始化控件对象
        ImageView mORNow = findViewById(R.id.order_now);
        // 绑定点击监听器
        mORNow.setOnClickListener(this);
    }


    public void onClick(View view) {
        Toast.makeText(this, "开始点餐", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, index.class);
        startActivity(intent);
    }
}
