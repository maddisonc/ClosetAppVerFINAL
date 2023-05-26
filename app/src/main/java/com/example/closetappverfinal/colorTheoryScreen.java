package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class colorTheoryScreen extends AppCompatActivity {

    private Button redBtn;
    private Button orangeBtn;
    private Button yellowBtn;
    private Button greenBtn;
    private Button blueBtn;
    private Button purpleBtn;
    private Button mainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_theory_screen);

        // red button
        redBtn = findViewById(R.id.redBtn);
        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureRedButton();
            }
        });

        // orange button
        orangeBtn = findViewById(R.id.orangeBtn);
        orangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureOrangeButton();
            }
        });

        // yellow button
        yellowBtn = findViewById(R.id.yellowBtn);
        yellowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureYellowButton();
            }
        });

        // green button
        greenBtn = findViewById(R.id.greenBtn);
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureGreenButton();
            }
        });

        // blue button
        blueBtn = findViewById(R.id.blueBtn);
        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureBlueButton();
            }
        });

        // purple button
        purpleBtn = findViewById(R.id.purpleBtn);
        purpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configurePurpleButton();
            }
        });

        mainBtn = findViewById(R.id.mainBtn);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureMainButton();
            }
        });

    }

    public void configureRedButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionTextView);
        userDisplay.setText("The complimentary color of red is green.");
    }
    public void configureOrangeButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionTextView);
        userDisplay.setText("The complimentary color of orange is blue.");
    }
    public void configureYellowButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionTextView);
        userDisplay.setText("The complimentary color of yellow is purple.");
    }
    public void configureGreenButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionTextView);
        userDisplay.setText("The complimentary color of green is magenta.");
    }
    public void configureBlueButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionTextView);
        userDisplay.setText("The complimentary color of blue is orange.");
    }
    public void configurePurpleButton ()
    {
        TextView userDisplay = (TextView)findViewById(R.id.descriptionTextView);
        userDisplay.setText("The complimentary color of purple is yellow.");
    }
    public void configureMainButton ()
    {
        Intent intent = new Intent(this, mainMenu.class);
        startActivity(intent);
    }

} // end colorTheory class