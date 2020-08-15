package com.example.tuteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText et3,et4;
    TextView tView;
    Button bAdd,bSub,bMul,bDivi;

    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et3=findViewById(R.id.etNum1);
        et4=findViewById(R.id.etNum2);
        tView=findViewById(R.id.cal);
        bAdd=findViewById(R.id.btnAdd);
        bSub=findViewById(R.id.btnSub);
        bMul=findViewById(R.id.btnMul);
        bDivi=findViewById(R.id.btnDivi);


        Intent intent = getIntent();
       final String num1=intent.getStringExtra("eNum1");
       final String num2=intent.getStringExtra("eNum2");

        et3.setText(num1);
        et4.setText(num2);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = add(Integer.parseInt(num1), Integer.parseInt(num2));
                tView.setText(num1 + " + " + num2 + " = " + res);
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = sub(Integer.parseInt(num1), Integer.parseInt(num2));
                tView.setText(num1 + " + " + num2 + " = " + res);
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = mul(Integer.parseInt(num1), Integer.parseInt(num2));
                tView.setText(num1 + " + " + num2 + " = " + res);
            }
        });
        bDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = div(Integer.parseInt(num1), Integer.parseInt(num2));
                tView.setText(num1 + " + " + num2 + " = " + res);
            }
        });



    }
}