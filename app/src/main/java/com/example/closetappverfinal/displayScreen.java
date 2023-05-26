package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class displayScreen extends AppCompatActivity {
    private Button seeAllBtn;
    private Button backToMain;

    private Button generateBtn;

    public static ImageView top;
    private ImageView bottom;

    // list of all clothing items
    public static clothingObj[] clothing = new clothingObj[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);

        // seeAll button
        seeAllBtn = findViewById(R.id.seeAllBtn);
        // backToMain button
        backToMain = findViewById(R.id.backToMain);

        // generate button
        generateBtn = findViewById(R.id.generateBtn);

        // top clothing img
        top = findViewById(R.id.topItemImg);
        // bottom clothing img
        bottom = findViewById(R.id.btmItemImg);

        // adds clothing items
        clothingObj blank = new clothingObj("https://assets.vogue.com/photos/6362de6fa544f299722694f7/3:4/w_1280%2Cc_limit/slide_6.jpg", "Blank", "blank", "blank", "blank");
        // default items
        clothingObj whiteTee = new clothingObj("https://assets.vogue.com/photos/6362de6fa544f299722694f7/3:4/w_1280%2Cc_limit/slide_6.jpg", "white shirt", "white", "casual", "hot");
        clothingObj blackTurtle = new clothingObj("https://agnesb-agnesb-com-storage.omn.proximis.com/Imagestorage/imagesSynchro/0/0/35def61b5a038ab8ea769dd4818311cf1d8dead0_0528J155_000_1.jpeg", "black turtleneck", "black", "formal", "cold");
        clothingObj blueJeans = new clothingObj("https://assets.vogue.com/photos/63038fd40924a50b0859dc21/3:4/w_1280%2Cc_limit/slide_4.jpg", "blue jeans", "blue", "casual", "any");
        clothingObj redSlacks = new clothingObj("https://fxposed.co.uk/Images/No%20Watermark/Trousers/TRS-VELVET/TRS-JESS-RED/IMG_3621.JPG", "red slacks", "red", "formal", "any");

        clothing[0] = blank;
        clothing[1] = whiteTee;
        clothing[2] = blackTurtle;
        clothing[3] = blueJeans;
        clothing[4] = redSlacks;

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView userDisplay = (TextView)findViewById(R.id.displayTitle);
                userDisplay.setText(" " + clothing[1].getColor() + " " + clothing[1].getWeather());
                int temp = 0;
                String color = filterScreen.getColorFilter();
                String formality = filterScreen.getFormalityFilter();
                String weather = filterScreen.getWeatherFilter();
                for(int i = 0; i < clothing.length; i++)
                {
                    if (color.equals(clothing[i].getColor()) && formality.equals(clothing[i].getFormality()) && weather.equals(clothing[i].getWeather()))
                    {
                        temp = i;
                    }
                }

                String link = "";
                link = (clothing[temp].getPicLink());

                Picasso.get()
                .load(link)
                .into(top);
            }
        }); // sets img

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

    public void configureSeeAllBtnButton() {
        Intent intent = new Intent(this, seeAllScreen.class);
        startActivity(intent);
    } // end seeAll button handler

    public void configureBackMainBtnButton() {
        Intent intent = new Intent(this, mainMenu.class);
        startActivity(intent);
    } // end backToMain button handler


    // choose outfit algor
//    public int chooseOutfitMethod ()
//    {
//        int temp = 1;
//        // goes through clothing array and finds item that matches all filters
//        for (int i = 1; i < clothing.length; i++)
//        {
//            String color = clothing[i].getColor();
//            String formality = clothing[i].getFormality();
//            String weather = clothing[i].getWeather();
//
//            String colorOfItem = filterScreen.getColorFilter();
//            String formalityOfItem = filterScreen.getFormalityFilter();
//            String weatherOfItem = filterScreen.getWeatherFilter();
//
//            if (color.equals(colorOfItem) && formality.equals(formalityOfItem) && weather.equals(weatherOfItem))
//            {
//                temp = i;
//            } // end if matches all filters
//
//        } // end for
//        return temp;
//    } // end choosing algor

//    public static void setPic (String link)
//    {
//        // sets images
//        Picasso.get()
//                .load(link)
//                .into(top);
//    }


} // end display class