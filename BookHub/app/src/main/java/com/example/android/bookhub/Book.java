package com.example.android.bookhub;


public class Book {

    //int value for ratings of the book
    private String mRating;

    //String value for title of the book
    private String mTitle;

    //String value for author of the book
    private StringBuilder mAuthor;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    public Book(String rating, String title, StringBuilder author, String url) {
        mRating = rating;
        mTitle = title;
        mAuthor = author;
        mUrl = url;
    }

    //Gets the ratings of the book
    public String getRating() {
        return mRating;

    }

    //Gets the title of the book
    public String getTitle() {
        return mTitle;
    }

    //Gets the author of the book
    public StringBuilder getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the website URL to find more information about the Books.
     */
    public String getUrl() {
        return mUrl;
    }
}
