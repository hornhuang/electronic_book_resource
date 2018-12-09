package com.example.a30797.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (ImageButton) findViewById(R.id.text_World_Forst);
        iniOnClick();
        Toast.makeText(MainActivity.this,"CSTI 神风测试已经开始！",Toast.LENGTH_SHORT).show();

    }

    private void iniOnClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"超级牛逼大老宋",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"!23",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
