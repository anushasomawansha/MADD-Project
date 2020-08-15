package com.example.tuteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.etNum1);
        et2=findViewById(R.id.etNum2);
        btns=findViewById(R.id.btnSend);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //take the number
                String n1=et1.getText().toString();
                String n2=et2.getText().toString();

              /*  //create intent  //load the number
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("EXTRA1",n1);
                i.putExtra("EXTRA2",n2);
                //toast
                Toast toast= Toast.makeText(getApplicationContext(),"You clicled on ok",Toast.LENGTH_LONG);
                 toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
                 toast.show();
                 */
                LayoutInflater layoutInflater = getLayoutInflater();
                View layout = layoutInflater.inflate(R.layout.customtoast, (ViewGroup)findViewById(R.id.customtoast_layout));

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("eNum1",n1);
                intent.putExtra("eNum2",n2);
                startActivity(intent);



                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();
            }
        });
        }
    }
