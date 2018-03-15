package com.example.android.tourpal;


public class Tour {

    //Image Resource ID for heading
    private int mImageHeadingResourceId;

    //String value for heading
    private int mHeading;


    /**
     * Create a new Tour object.
     *
     * @param imageHeadingResourceId is to get id of image heading resource
     *
     * @param heading is the heading of the restaurants, events, monuments and public places
     */
    public Tour(int imageHeadingResourceId, int heading){
        mImageHeadingResourceId = imageHeadingResourceId;
        mHeading = heading;
    }

    public int getImageHeadingResourceId(){
        return mImageHeadingResourceId;
    }

    public int getHeading(){
        return mHeading;
    }
}
