package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inputScreen extends AppCompatActivity {
    private Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_screen);

        // start button
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureSubmitButton();
            }
        }); // next activity method
    } // end onCreate

    public void configureSubmitButton ()
    {
        Intent intent = new Intent(this, filterScreen.class);
        startActivity(intent);
    } // end submit button handler

} // end input class