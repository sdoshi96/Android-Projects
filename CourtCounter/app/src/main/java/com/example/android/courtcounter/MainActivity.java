package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;
    int redTeamA = 0;
    int yellowTeamA = 0;
    int foulTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;
    int redTeamB = 0;
    int yellowTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String jamesbond = "hi";
        String jamesBond = "hello";
        String s = jamesBond + jamesbond;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the red card for Team A by 1.
     */
    public void addRedForTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }

    /**
     * Increase the yellow card for Team A by 1.
     */
    public void addYellowForTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }

    /**
     * Increase foul for Team A by 1.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the red card for Team B by 1.
     */
    public void addRedForTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }

    /**
     * Increase the yellow card for Team B by 3.
     */
    public void addYellowForTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }

    /**
     * Increase foul for Team B by 1.
     */
    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        redTeamA = 0;
        yellowTeamA = 0;
        foulTeamA = 0;
        scoreTeamB = 0;
        redTeamB = 0;
        yellowTeamB = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayRedForTeamA(redTeamA);
        displayYellowForTeamA(yellowTeamA);
        displayFoulForTeamA(foulTeamA);
        displayForTeamB(scoreTeamB);
        displayRedForTeamB(redTeamB);
        displayYellowForTeamB(yellowTeamB);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red Card for Team A.
     */
    public void displayRedForTeamA(int red) {
        TextView redCardView = (TextView) findViewById(R.id.team_a_red_card);
        redCardView.setText(String.valueOf(red));
    }

    /**
     * Displays the given yellow Card for Team A.
     */
    public void displayYellowForTeamA(int yellow) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_a_yellow_card);
        yellowCardView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the Total Fouls for Team A.
     */
    public void displayFoulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red Card for Team B.
     */
    public void displayRedForTeamB(int red) {
        TextView redCardView = (TextView) findViewById(R.id.team_b_red_card);
        redCardView.setText(String.valueOf(red));
    }

    /**
     * Displays the given yellow Card for Team B.
     */
    public void displayYellowForTeamB(int yellow) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_b_yellow_card);
        yellowCardView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the Total Fouls for Team B.
     */
    public void displayFoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }
}