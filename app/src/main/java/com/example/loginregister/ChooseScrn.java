package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseScrn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_scrn);

        //declare button variable and create on click listener
        Button Reg;
        Reg= (Button) findViewById(R.id.Reg);
        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click on Register button take user to Register Activity
                startActivity(new Intent(ChooseScrn.this, Register.class));
            }
        });

        //declare second button variable and create second on click listener
        Button Login;
        Login =(Button)findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click on Register button take user to Login Activity
                startActivity(new Intent(ChooseScrn.this, Login.class));
            }

        });
    }
}