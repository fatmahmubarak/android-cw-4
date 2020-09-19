package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
//EditText n1;
//EditText n2;
//TextView tv;
//Button ad, mul,sub, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText num = findViewById(R.id.editText);
        final EditText num2 = findViewById(R.id.editText2);
        Button ad = findViewById(R.id.button);
        Button mul = findViewById(R.id.button1);
        Button sub = findViewById(R.id.button2);
        Button div = findViewById(R.id.button3);

ad.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

     int n1 = Integer.parseInt(num.getText().toString());
     int n2 = Integer.parseInt(num2.getText().toString());
     int sum = n1+n2;


        Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();
    }
});


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(num.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1-n2;


                Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(num.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1*n2;


                Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(num.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1/n2;


                Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();
            }
        });











//        n1 = (EditText) findViewById(R.id.editText);
//        n2 = (EditText) findViewById(R.id.editText2);
//        tv = (TextView) findViewById(R.id.textView);
//        ad = (Button) findViewById(R.id.button);
//        mul = (Button) findViewById(R.id.button1);
//        sub = (Button) findViewById(R.id.button2);
//        div = (Button) findViewById(R.id.button3);
//
//      ad.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              Integer no1 = Integer.parseInt(n1.getText().toString());
//              Integer no2 = Integer.parseInt(n2.getText().toString());
//
//              Integer add = no1+no2;
//              tv.setText(add.toString());
//          }
//      });
//
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer no1 = Integer.parseInt(n1.getText().toString());
//                Integer no2 = Integer.parseInt(n2.getText().toString());
//
//                Integer add = no1-no2;
//                tv.setText(add.toString());
//            }
//        });
//
//        mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer no1 = Integer.parseInt(n1.getText().toString());
//                Integer no2 = Integer.parseInt(n2.getText().toString());
//
//                Integer add = no1*no2;
//                tv.setText(add.toString());
//            }
//        });
//
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer no1 = Integer.parseInt(n1.getText().toString());
//                Integer no2 = Integer.parseInt(n2.getText().toString());
//
//                Integer add = no1/no2;
//                tv.setText(add.toString());
//            }
//        });
    }
}