package com.example.android.quizup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     *This method is called when the submit button is clicked
     */
    public void submitScore(View view) {

        int score = 0;// Counts the score of the player

        /*
        * Checks the answer of 1st question
        */
        RadioButton dessert = (RadioButton) findViewById(R.id.sahara_radio_button);
        boolean hasSahara = dessert.isChecked();

        if (hasSahara) {
            score += 2;
        }

        /*
        * Checks the answer of 2nd question
        */
        CheckBox hasHaryana = (CheckBox) findViewById(R.id.haryana_checkbox);

        CheckBox hasPunjab = (CheckBox) findViewById(R.id.punjab_checkbox);

        CheckBox hasAssam = (CheckBox) findViewById(R.id.assam_checkbox);

        CheckBox hasRajasthan = (CheckBox) findViewById(R.id.rajasthan_checkbox);

        if (hasHaryana.isChecked() && hasPunjab.isChecked() && !hasAssam.isChecked() && !hasRajasthan.isChecked()) {
            score += 2;
        }

        /*
        *Checks the answer of 3rd question
        */
        EditText captain = (EditText) findViewById(R.id.dhoni_text);
        String cricketer = captain.getText().toString().trim();

        if (cricketer.equalsIgnoreCase("MS Dhoni")) {
            score += 2;
        }

        /*
        * Checks the answer of 4th question
        */
        RadioButton everest = (RadioButton) findViewById(R.id.nepal_radio_button);
        boolean hasNepal = everest.isChecked();

        if (hasNepal) {
            score += 2;
        }

        /*
        *Checks the answer of 5th question
        */
        EditText udacity = (EditText) findViewById(R.id.udacity_text);
        String ceo = udacity.getText().toString().trim();

        if (ceo.equalsIgnoreCase("Sebastian Thrun")) {
            score += 2;
        }

        /*
        *Displays scores
        */
        if (score == 10) {
            Toast.makeText(MainActivity.this, "Congratulations, You have score 10 out of 10", Toast.LENGTH_SHORT).show();
        } else if (score <= 5) {
            Toast.makeText(MainActivity.this, "Nice try! You have score " + score + " out of 10", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You have score " + score + " out of 10", Toast.LENGTH_SHORT).show();
        }
    }
}