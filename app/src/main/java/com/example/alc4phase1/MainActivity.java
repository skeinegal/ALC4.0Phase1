package com.example.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, yourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        yourButton = findViewById(R.id.button2);
        button = findViewById(R.id.aboutButton);

        //Goes to AboutALC.
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent profileIntent =
                        new Intent(MainActivity.this, AboutAlc.class);
                startActivity(profileIntent);

            }

        });

        //Goes to Profile.
        yourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyProfile.class));
            }
        });


    }

}