package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class displayScreen extends AppCompatActivity {
    private Button seeAllBtn;
    private Button backToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);

        // seeAll button
        seeAllBtn = findViewById(R.id.seeAllBtn);
        // backToMain button
        backToMain = findViewById(R.id.backToMain);

        seeAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureSeeAllBtnButton();
            }
        }); // to seeAllScreen method

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureBackMainBtnButton();
            }
        }); // to backToMain method

    } // end onCreate

    public void configureSeeAllBtnButton ()
    {
        Intent intent = new Intent(this, seeAllScreen.class);
        startActivity(intent);
    } // end seeAll button handler

    public void configureBackMainBtnButton ()
    {
        Intent intent = new Intent(this, mainMenu.class);
        startActivity(intent);
    } // end backToMain button handler

} // end display class