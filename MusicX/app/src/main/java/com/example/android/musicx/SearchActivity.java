package com.example.android.musicx;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;


public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_music);

        String activity_description="This activity helps the user to search for desired song using queries related to either albums, artists or playlists";

        //Alert Dialog For Explanation of the activity
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(activity_description).create().show();
    }
}
