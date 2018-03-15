package com.example.android.musicx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admin on 04-08-2017.
 */

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        // Find the View that shows the music library category
        TextView payment = (TextView) findViewById(R.id.online_payment);

        // Set a click listener on that View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Buy Music Online}
                Intent paymentIntent = new Intent(MusicLibrary.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });

        // Find the Button that shows the Current music being played screen
        Button current_music = (Button) findViewById(R.id.now_playing);

        // Set a click listener on that Button
        current_music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying}
                Intent musicIntent = new Intent(MusicLibrary.this, NowPlaying.class);

                // Start the new activity
                startActivity(musicIntent);
            }
        });

    }

}
