package com.example.android.bookhub;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 13-08-2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, ArrayList<Book> adapter) {

        super(context, 0, adapter);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link currentBook} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView with view ID book_ratings
        TextView ratings_book = (TextView) listItemView.findViewById(R.id.book_ratings);
        // Display the ratings of the current book in that TextView
        ratings_book.setText(currentBook.getRating());

        // Find the TextView with view ID book_author
        TextView author_book = (TextView) listItemView.findViewById(R.id.book_author);
        // Display the author of the current book in that TextView
        author_book.setText(currentBook.getAuthor());

        // Find the TextView with view ID book_title
        TextView title_book = (TextView) listItemView.findViewById(R.id.book_title);
        // Display the title of the current book in that TextView
        title_book.setText(currentBook.getTitle());

        return listItemView;
    }
}
