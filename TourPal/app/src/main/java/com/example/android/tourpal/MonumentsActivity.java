package com.example.android.tourpal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_list);

        // Create a list of monuments
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.nilambaug_palace, R.string.nilambaug_palace));
        tours.add(new Tour(R.drawable.takhteshwar_temple, R.string.takhteshwar_temple));
        tours.add(new Tour(R.drawable.gandhi_smriti_memorial, R.string.gandhi_smriti_memorial));
        tours.add(new Tour(R.drawable.barton, R.string.barton_museum));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(this, tours);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_tour_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);
    }
}
