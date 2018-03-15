package com.example.android.tourpal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_list);

        //Create a list of events
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.blood_donation, R.string.blood_donation));
        tours.add(new Tour(R.drawable.k_lal_circus, R.string.k_lal_circus));
        tours.add(new Tour(R.drawable.happy_street, R.string.happy_street));
        tours.add(new Tour(R.drawable.bhavnagar_marathon, R.string.bhavnagar_marathon));

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
