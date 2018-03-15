package com.example.android.news24;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 14-08-2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> adapter) {

        super(context, 0, adapter);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link currentNews} object located at this position in the list
        News currentNews = getItem(position);


        // Find the TextView with view ID title_news
        TextView titleView = (TextView) listItemView.findViewById(R.id.title_news);
        // Display the current news in that TextView
        titleView.setText(currentNews.getTitle());


        // Find the TextView in the list_item.xml layout with the ID category_news
        TextView categoryView = (TextView) listItemView.findViewById(R.id.category_news);
        // Get the category to which news article belongs
        // set this text on the name TextView
        categoryView.setText(currentNews.getCategory());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
