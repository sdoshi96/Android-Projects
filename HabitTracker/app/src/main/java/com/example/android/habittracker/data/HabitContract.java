package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by admin on 15-08-2017.
 */

public class HabitContract {

    private HabitContract() {};

    public static abstract class HabitEntry implements BaseColumns {

        public static final String TABLE_NAME = "habits";

        public static final String _ID= BaseColumns._ID;
        public static final String COLUMN_PERSON_NAME = "name";
        public static final String COLUMN_PERSON_GENDER = "gender";
        public static final String COLUMN_LISTENING_MUSIC_HABIT= "music";
        public static final String COLUMN_DANCING_HABIT = "dancing";

        /**
         * Possible values for the gender of person.
         */
        public static final int GENDER_MALE = 0;
        public static final int GENDER_FEMALE = 1;

    }
}
