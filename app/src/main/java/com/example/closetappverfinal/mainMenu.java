package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainMenu extends AppCompatActivity {
    private Button startBtn;
    private Button colorTheoryBtn;
    private Button dressCodesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // start button
        startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureStartButton();
            }
        }); // next activity method

        colorTheoryBtn = findViewById(R.id.toColorTheoryBtn);
        colorTheoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureColorTheoryButton();
            }
        }); // next activity method

        dressCodesBtn = findViewById(R.id.dressCodesBtn);
        dressCodesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureDressCodesButton();
            }
        });
    } // end onCreate

    public void configureStartButton ()
    {
        Intent intent = new Intent(this, inputScreen.class);
        startActivity(intent);
    } // end start button handler

    public void configureColorTheoryButton ()
    {
        Intent intent = new Intent(this, colorTheoryScreenFIX.class);
        startActivity(intent);
    } // end start button handler

    public void configureDressCodesButton ()
    {
        Intent intent = new Intent(this, dressCodesScreen.class);
        startActivity(intent);
    } // end start button handler

} // end mainMenu class