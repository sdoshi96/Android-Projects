package com.example.android.musicx;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String activity_description="This activity is the home page preview of the MusicX app, which has three buttons to navigate the user to different activities on screen like music library, now playing and search screen";

        //Alert Dialog For Explanation of the activity
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(activity_description).create().show();

        // Find the View that shows the music library category
        Button music_lib = (Button) findViewById(R.id.library_music);

        // Set a click listener on that View
        music_lib.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying}
                Intent musicLibIntent = new Intent(MainActivity.this, MusicLibrary.class);

                // Start the new activity
                startActivity(musicLibIntent);
            }
        });

        // Find the View that shows the search screen
        Button search_music = (Button) findViewById(R.id.search_screen);

        // Set a click listener on that View
        search_music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
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
                Intent musicIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(musicIntent);
            }
        });
    }
}
