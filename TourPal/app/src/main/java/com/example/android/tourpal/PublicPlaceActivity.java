package com.example.android.tourpal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by admin on 10-08-2017.
 */

public class PublicPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_list);

        // Create a list of public places
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.trambak_falls, R.string.trambak_falls));
        tours.add(new Tour(R.drawable.bortalav, R.string.bortalav));
        tours.add(new Tour(R.drawable.kuda_beach, R.string.kuda_beach));
        tours.add(new Tour(R.drawable.victoria_park, R.string.victoria_park));

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
