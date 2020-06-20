package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MobileReg extends AppCompatActivity {
    public Button button0, button1;
    public CheckBox frgtpassclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*go to next activity*/

        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MobileReg.this,OTPver.class);
                startActivity(i);

            }
        });

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MobileReg.this,Homepage.class);
                startActivity(i);

            }
        });

        frgtpassclick = findViewById(R.id.frgtpassclick);
        frgtpassclick.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MobileReg.this,ForgotPassword.class);
                startActivity(i);

            }
        });


    }
}





