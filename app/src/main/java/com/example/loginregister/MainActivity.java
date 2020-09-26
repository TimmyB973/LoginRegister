package com.example.loginregister;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare button variable and reference xml button
        Button enter;
        enter= (Button) findViewById(R.id.enter);
        //create on click listener for button
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //declare intent that will take user to "ChooseScren" activity for login/registration
                startActivity(new Intent(MainActivity.this, ChooseScrn.class));
            }
        });
    }
}