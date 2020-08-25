package com.example.mymate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    EditText et_email,et_password;
    Button buttonLogin;
    MyDatabaseHelper myDatabaseHelper;
    String email,password;
    TextView tv_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);
        buttonLogin=findViewById(R.id.button_login);
        tv_register=findViewById(R.id.tv_register);

        myDatabaseHelper= new MyDatabaseHelper(this);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=et_email.getText().toString();
                password=et_password.getText().toString();
                if (email.equals("") && password.equals("")) {
                    Toast.makeText(getApplicationContext(),"Please Insert Email and password",Toast.LENGTH_LONG).show();
                } else {
                    int status =Integer.parseInt( myDatabaseHelper.getLoginData(email, password));
                    if (status>0) {
                        Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), Dashboard.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplicationContext(), "You are not Registerd!", Toast.LENGTH_LONG).show();

                    }
                }

            }
        });
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);

            }
        });
    }
}