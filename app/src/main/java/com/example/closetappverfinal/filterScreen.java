package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class filterScreen extends AppCompatActivity {

    private Button submitBtn;

    // stores filters
    public static String color;
    public static String formality;
    public static String weather;

    private EditText colorInput;
    private EditText formalityInput;
    private EditText weatherInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_screen);

        colorInput = findViewById(R.id.colorInput);
        formalityInput = findViewById(R.id.formalityInput);
        weatherInput = findViewById(R.id.weatherInput);
    } // end onCreate

    // getters
    public static String getColorFilter()
    {
        return color;
    }
    public static String getFormalityFilter()
    {
        return formality;
    }
    public static String getWeatherFilter()
    {
        return weather;
    }

} // end filter class