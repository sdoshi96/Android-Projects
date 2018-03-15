package com.example.android.news24;

/**
 * Created by admin on 14-08-2017.
 */

public class News {

    //String value for the article title
    private String mTitle;

    //String value for the category to which news belong
    private String mCategory;

    //Website URL of the news
    private String mUrl;

    /**
     * Create a new News object.
     *
     * @param title    gets the title of the news article
     * @param category gets the category of the news article
     * @param url      is the website URL to find more details about the news article
     */
    public News(String title, String category, String url) {
        mTitle = title;
        mCategory = category;
        mUrl = url;
    }

    //Gets the title of the news article
    public String getTitle() {
        return mTitle;
    }

    //Gets the category of the news article
    public String getCategory() {
        return mCategory;
    }

    //Returns the website URL to find more information about the earthquake.
    public String getUrl() {
        return mUrl;
    }
}
