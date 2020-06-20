package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


import static com.example.myapplication.R.*;


public class Vehiclereg extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp1,sp2;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_vehiclereg);

        sp1= findViewById(id.Spinner1);
        sp2= findViewById(R.id.Spinner2);
        sp1.setOnItemSelectedListener(this);


        /*go to home page on click of save button*/

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Vehiclereg.this,Homepage.class);
                startActivity(i);

            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        Toast.makeText(this, adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        String text= String.valueOf(sp1.getSelectedItem());
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        if(text.contentEquals("Maruti Suzuki"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, array.Maruti_Suzuki, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter.notifyDataSetChanged();
            sp2.setAdapter(adapter);
        }
        if(text.contentEquals("Hyundai"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, array.Hyundai, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter.notifyDataSetChanged();
            sp2.setAdapter(adapter);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }





}
