package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class displayScreen extends AppCompatActivity {
    private Button seeAllBtn;
    private Button backToMain;
    private ImageView top;
    private ImageView bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);

        // seeAll button
        seeAllBtn = findViewById(R.id.seeAllBtn);
        // backToMain button
        backToMain = findViewById(R.id.backToMain);
        // top clothing img
        top = findViewById(R.id.topItemImg);
        // bottom clothing img
        top = findViewById(R.id.btmItemImg);

        Picasso.get()
                .load("https://d1jyxxz9imt9yb.cloudfront.net/medialib/3078/image/s1300x1300/IP202207_GlassFrogs_009_365211_reduced.jpg")
                .into(top);

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