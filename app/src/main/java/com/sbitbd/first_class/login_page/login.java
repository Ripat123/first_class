package com.sbitbd.first_class.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.sbitbd.first_class.R;

public class login extends AppCompatActivity {

    int data1;
    String data2;
    double data3;
    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        data1 = intent.getIntExtra("integer",0);
        data2 = intent.getStringExtra("String");
        data3 = intent.getDoubleExtra("double",0.0);

        user = findViewById(R.id.user);
        user.setText(data2);

        Toast.makeText(this, data2, Toast.LENGTH_LONG).show();
        Log.d("integer",String.valueOf(data1));
        Log.d("string",data2);
        Log.d("double",String.valueOf(data3));
    }
}