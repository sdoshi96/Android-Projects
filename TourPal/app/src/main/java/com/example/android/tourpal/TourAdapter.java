package com.example.android.tourpal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Activity context, ArrayList<Tour> adapter) {

        super(context, 0, adapter);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link currentTour} object located at this position in the list
        Tour currentTour = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image_heading_view
        TextView imageView = (TextView) listItemView.findViewById(R.id.text_heading_view);
        //display the provided image based on the resource ID
        imageView.setBackgroundResource(currentTour.getImageHeadingResourceId());

        // Find the TextView in the list_item.xml layout with the ID text_heading_view
        TextView heading = (TextView) listItemView.findViewById(R.id.text_heading_view);
        // Get the text heading from the current currentTour object and
        // set this text on the name TextView
        heading.setText(currentTour.getHeading());

        return listItemView;
    }
}

