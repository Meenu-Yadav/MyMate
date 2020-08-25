package com.example.mymate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Dashboard extends AppCompatActivity {
    private ImageView btna,btnb,btnc;
    final Intent[] intent = new Intent[1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
        btna=(ImageView)findViewById(R.id.btna);
        btnb=(ImageView)findViewById(R.id.btnb);
        btnc=(ImageView)findViewById(R.id.btnc);




        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Dashboard.this, MyNotes.class);
                startActivity(intent);


            }
        });


        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });


        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Friends.class);
                startActivity(intent);

            }
        });











    }
}


