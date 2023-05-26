package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class filterScreen extends AppCompatActivity {

    private Button submitBtn;

    private EditText colorInput;
    private EditText formalityInput;
    private EditText weatherInput;

    // stores actual values of inputs
    public static String colorVal;
    public static String formalVal;
    public static String weatherVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_screen);

        colorInput = findViewById(R.id.colorInput);
        formalityInput = findViewById(R.id.formalityInput);
        weatherInput = findViewById(R.id.weatherInput);

        colorVal = colorInput.getText().toString();
        formalVal = formalityInput.getText().toString();
        weatherVal= weatherInput.getText().toString();

        // submit button
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureSubmitButton();
            }
        }); // next activity method
    } // end onCreate

    // getters
    public static String getColorFilter()
    {
        return colorVal;
    }
    public static String getFormalityFilter()
    {
        return formalVal;
    }
    public static String getWeatherFilter()
    {
        return weatherVal;
    }

    public void configureSubmitButton ()
    {
        Intent intent = new Intent(this, displayScreen.class);
        startActivity(intent);
    } // end submit button handler

} // end filter class
