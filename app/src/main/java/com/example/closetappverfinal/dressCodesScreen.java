package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dressCodesScreen extends AppCompatActivity {

    // https://emilypost.com/advice/attire-guide-dress-codes-from-casual-to-white-tie
    private Button menuBtn;
    private Button dressCodesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_codes_screen);
        menuBtn = findViewById(R.id.mainMenuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureMainMenuButton();
            }
        }); // next activity method

        dressCodesBtn = findViewById(R.id.outputBtn);
        dressCodesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureDressCodesButton();
            }
        }); // next activity method

    }

    public void configureMainMenuButton ()
    {
        Intent intent = new Intent(this, mainMenu.class);
        startActivity(intent);
    } // end start button handler

    public void configureDressCodesButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionHolderText);
        userDisplay.setText(
                "Casual: informal and comfortable (Plain T-shirts, shorts)\n" +
                "Semi-formal: office-wear (dress shirts, less formal dresses)\n" +
                "Business Formal: formal wear for business events (matching pairs of suit jackets and pants/skirts)\n" +
                "Business casual: slacks, khakis, dress shirts/blouses\n" +
                "Black tie: weddings, proms, and formal dinners (floor length evening gowns, black tuxedos)\n" +
                "White Tie: the most formal attire - implies that guests are socially distinguished (royals, celebrities)");
    } // end start button handler

} // end dressCodes class