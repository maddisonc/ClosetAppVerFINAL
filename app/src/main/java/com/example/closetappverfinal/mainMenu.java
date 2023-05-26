package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainMenu extends AppCompatActivity {
    private Button startBtn;
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
    } // end onCreate

    public void configureStartButton ()
    {
        Intent intent = new Intent(this, inputScreen.class);
        startActivity(intent);
    } // end start button handler

} // end mainMenu class