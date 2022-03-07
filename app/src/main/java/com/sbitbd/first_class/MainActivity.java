package com.sbitbd.first_class;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.sbitbd.first_class.login_page.login;

public class MainActivity extends AppCompatActivity {

    EditText first_n,last_n;
    MaterialCardView cardView;
    Button click;
    String data1,data2;
    Switch s1;
    SwitchMaterial switchMaterial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    private void initview(){
        try {
            first_n = findViewById(R.id.first);
            last_n = findViewById(R.id.last);
            cardView = findViewById(R.id.materialCardView);
            click = findViewById(R.id.btn);
            s1 = findViewById(R.id.switch1);
            switchMaterial = findViewById(R.id.s2);
            switchMaterial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (switchMaterial.isChecked())
                        Toast.makeText(MainActivity.this,"on",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"off",Toast.LENGTH_SHORT).show();
                }
            });
            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, login.class);
                    intent.putExtra("integer",500);
                    intent.putExtra("String","Hello");
                    intent.putExtra("double",5.30);
                    startActivity(intent);
                }
            });
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    data1 = first_n.getText().toString();
                    data2 = last_n.getText().toString();
                    Toast.makeText(MainActivity.this,data1+" "+data2,Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception e){
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}