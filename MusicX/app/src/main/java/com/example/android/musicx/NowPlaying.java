package com.example.android.musicx;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        String activity_description="This activity shows the current playing song in the app. It has buttons such as play, pause, previous, shuffle, addTofavourite through which user can interact with the app and manipulate things as per the requirement";

        //Alert Dialog For Explanation of the activity
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(activity_description).create().show();
    }
}
