package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signupform extends AppCompatActivity {
    public Button button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupform);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_vehiclereg);
                Intent i = new Intent(Signupform.this,Vehiclereg.class);
                startActivity(i);

            }
        });

    }
}
