package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dressCodesScreen extends AppCompatActivity {

    // https://emilypost.com/advice/attire-guide-dress-codes-from-casual-to-white-tie
    String[] dressCodesList = {
            "Casual: informal and comfortable (Plain T-shirts, shorts)\n",
            "Semi-formal: office-wear (dress shirts, less formal dresses)\n",
            "Business Formal: formal wear for business events (matching pairs of suit jackets and pants/skirts)\n",
            "Business casual: slacks, khakis, dress shirts/blouses\n",
            "Black tie: weddings, proms, and formal dinners (floor length evening gowns, black tuxedos)\n",
            "White Tie: the most formal attire - implies that guests are socially distinguished (royals, celebrities)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_codes_screen);
        fillScrollView();
    }

    public void fillScrollView ()
    {
        String output = "";
        TextView dressCodes = (TextView) findViewById(R.id.scrollViewText);
        for (String a : dressCodesList)
        {
            output += "\n" + a;
        }
        dressCodes.setText(output);
    } // end fill method
} // end dressCodes class