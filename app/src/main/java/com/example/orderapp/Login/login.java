package com.example.orderapp.Login;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderapp.Adapter.MydatabaseHelper;
import com.example.orderapp.AddFood;
import com.example.orderapp.EditFood;
import com.example.orderapp.EditUser;
import com.example.orderapp.IndexOp.daincai;
import com.example.orderapp.R;
import com.example.orderapp.diancan;
import com.example.orderapp.index;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class login extends AppCompatActivity {

    private String TAG="login";
    private MydatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dbHelper=new MydatabaseHelper(this,"User.db",null,2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final TextView tx1=findViewById(R.id.idtext);
        final TextView tx2=findViewById(R.id.pwdtext);

        Button btnlogin=findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=tx1.getText().toString();
                String pwd=tx2.getText().toString();
                SQLiteDatabase db=dbHelper.getWritableDatabase();
                String[] selectionArgs = { id,pwd };

                Cursor cursor=db.query("User",null,"name=? and password=?",selectionArgs,null,null,null);
                Log.d(TAG, "onClick: -----------------------"+id);
                Log.d(TAG, "onClick: -----------------------"+pwd);
                Log.d(TAG, "onClick: -----------------------"+cursor);
                Log.d(TAG, "onClick: -----------------------"+cursor.getCount());
                if (cursor.getCount()!=0){
                    Intent intent=new Intent(login.this, index.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(login.this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}