package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //declare button variable and create on click listener
        Button pushlogin;
        pushlogin=(Button) findViewById(R.id.loginButton);
        pushlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click create toast
                //on click on Register button take user to "choose scrn"
                Toast.makeText(Login.this, "Thank you for logging in", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Login.this, ChooseScrn.class));
            }
        });


    }
}