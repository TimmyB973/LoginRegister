package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity {

    // create password validation class
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[0-9])" +        //at least 1 number
                    "(?=.*[a-z])" +        //at least 1 lower case letter
                    "(?=.*[A-Z])" +        //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no spaces
                    ".{4,}" +               //minimum 4 characters
                    "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // declare variables for user entered fields. Final therefore they cannot be changed
        final EditText First;
        final EditText Last;
        final EditText BirthD;
        final EditText PassW;
        final EditText Email;

        //reference id's

        First = (EditText) findViewById(R.id.Fname);
        Last = (EditText) findViewById(R.id.Lname);
        BirthD = (EditText) findViewById(R.id.DOB);
        Email = (EditText) findViewById(R.id.email);
        PassW = (EditText) findViewById(R.id.password);




        //declare button variable and create on click listener
        Button submitButton;
        submitButton= (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // create strings from user entered fields from email and password
                String Einput = Email.getText().toString();
                String Pinput = PassW.getText().toString();


            // conditions to not accept empty fields
                if(First.length()==0){
                    First.setError("Enter First name");
                }
                else if (Last.length()==0){
                    Last.setError("Enter Last Name");
                }
                else if(BirthD.length()==0){
                    BirthD.setError("Enter Date of Birth");
                }
                if(Email.length()==0){
                    Email.setError("Enter an email"); }

                //additional condition for entering a valid email address
                else if(!Patterns.EMAIL_ADDRESS.matcher(Einput).matches()){
                    Email.setError("Enter a valid email");
                }
                if(PassW.length()==0){
                    //additional condition for valid password
                    //must comply with pattern specified earlier
                    PassW.setError("Enter a Password");}
                else if(!PASSWORD_PATTERN.matcher(Pinput).matches()){
                    PassW.setError("Password does not meet minimum requirements");
                }

                else {
                    //if all data entered correctly then show toast and return to "Choose Scrn" activity
                    startActivity(new Intent(Register.this, ChooseScrn.class));
                    Toast.makeText(Register.this, "Thank you for Registering", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}