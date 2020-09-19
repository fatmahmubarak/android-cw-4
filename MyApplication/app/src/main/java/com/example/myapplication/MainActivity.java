package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText n1;
EditText n2;
TextView tv;
Button ad, mul,sub, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView);
        ad = (Button) findViewById(R.id.button);
        mul = (Button) findViewById(R.id.button1);
        sub = (Button) findViewById(R.id.button2);
        div = (Button) findViewById(R.id.button3);

      ad.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Integer no1 = Integer.parseInt(n1.getText().toString());
              Integer no2 = Integer.parseInt(n2.getText().toString());

              Integer add = no1+no2;
              tv.setText(add.toString());
          }
      });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1-no2;
                tv.setText(add.toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1*no2;
                tv.setText(add.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1/no2;
                tv.setText(add.toString());
            }
        });
    }
}