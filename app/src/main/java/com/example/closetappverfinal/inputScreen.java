package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputScreen extends AppCompatActivity {
    private Button submitBtn;

    // stores clothing attributes
    public static String link;
    public static String name;
    public static String color;
    public static String formality;
    public static String weather;

    // stores user's input
    private EditText linkInput;
    private EditText nameInput;
    private EditText colorInput;
    private EditText formalityInput;
    private EditText weatherInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_screen);

        // submit button
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureSubmitButton();
            }
        }); // next activity method

        linkInput = findViewById(R.id.picLinkInput);
        nameInput = findViewById(R.id.nameInput);
        colorInput = findViewById(R.id.colorInput);
        formalityInput = findViewById(R.id.formalityInput);
        weatherInput = findViewById(R.id.weatherInput);

    } // end onCreate

    // getters
    public static String getLink()
    {
        return link;
    }
    public static String getName()
    {
        return name;
    }
    public static String getColor()
    {
        return color;
    }
    public static String getFormality()
    {
        return formality;
    }
    public static String getWeather()
    {
        return weather;
    }

    public void configureSubmitButton ()
    {
        Intent intent = new Intent(this, filterScreen.class);
        startActivity(intent);
    } // end submit button handler

} // end input class