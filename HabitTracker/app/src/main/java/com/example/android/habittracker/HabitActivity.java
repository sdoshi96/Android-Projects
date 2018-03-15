package com.example.android.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.habittracker.data.HabitContract.HabitEntry;
import com.example.android.habittracker.data.HabitTrackerDbHelper;


public class HabitActivity extends AppCompatActivity {

    private HabitTrackerDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habits);

        mDbHelper = new HabitTrackerDbHelper(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        insertHabit();
        displayDatabaseInfo();
    }

    private Cursor readFromDatabase() {

        HabitTrackerDbHelper mDbHelper = new HabitTrackerDbHelper(this);

        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                HabitEntry._ID,
                HabitEntry.COLUMN_PERSON_NAME,
                HabitEntry.COLUMN_PERSON_GENDER,
                HabitEntry.COLUMN_LISTENING_MUSIC_HABIT,
                HabitEntry.COLUMN_DANCING_HABIT,
        };

        // To get a Cursor that contains all rows from the habits table.
        Cursor cursor = db.query(
                HabitEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null);




        return cursor;
    }

    /**
     * Temporary helper method to display information in the onscreen TextView about the state of
     * the pets database.
     */
    private void displayDatabaseInfo() {
        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.

        Cursor cursor = readFromDatabase();

        TextView displayView = (TextView) findViewById(R.id.text_view_habit);


        try {

            // Display the number of rows in the Cursor (which reflects the number of rows in the
            // pets table in the database).
            displayView.setText("The habits table contains " + cursor.getCount() + " habits.\n\n");

            // Figure out the index of each column
            int idColumnIndex = cursor.getColumnIndex(HabitEntry._ID);
            int nameColumnIndex = cursor.getColumnIndex(HabitEntry.COLUMN_PERSON_NAME);
            int genderColumnIndex = cursor.getColumnIndex(HabitEntry.COLUMN_PERSON_GENDER);
            int musicColumnIndex = cursor.getColumnIndex(HabitEntry.COLUMN_LISTENING_MUSIC_HABIT);
            int dancingColumnIndex = cursor.getColumnIndex(HabitEntry.COLUMN_DANCING_HABIT);

            // Iterate through all the returned rows in the cursor
            while (cursor.moveToNext()) {
                // Use that index to extract the String or Int value of the word
                // at the current row the cursor is on.
                int currentID = cursor.getInt(idColumnIndex);
                String currentName = cursor.getString(nameColumnIndex);
                int currentGender = cursor.getInt(genderColumnIndex);
                String currentMusic = cursor.getString(musicColumnIndex);
                String currentDancing = cursor.getString(dancingColumnIndex);
                // Display the values from each column of the current row in the cursor in the TextView
                displayView.append(("\n" + currentID + " - " +
                        currentName + " - " +
                        currentGender + " - " +
                        currentMusic + " - " +
                        currentDancing));
            }

        } finally {
            // Always close the cursor when you're done reading from it. This releases all its
            // resources and makes it invalid.
            cursor.close();
        }
    }

    private void insertHabit() {

        // Gets the data repository in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();


        ContentValues values = new ContentValues();
        values.put(HabitEntry.COLUMN_PERSON_NAME, "Joy");
        values.put(HabitEntry.COLUMN_PERSON_GENDER, HabitEntry.GENDER_FEMALE);
        values.put(HabitEntry.COLUMN_LISTENING_MUSIC_HABIT, "Yes");
        values.put(HabitEntry.COLUMN_DANCING_HABIT, "Yes");

        // Insert the new row, returning the primary key value of the new row
        db.insert(HabitEntry.TABLE_NAME, null, values);
    }
}
