package com.example.android.quakereport;


public class Earthquake {

    //int value for magnitude
    private double mMagnitude;

    //String value for location;
    private String mLocation;

    //String value for date
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Create a new Earthquake object.
     *
     * @param magnitude gets the value of magnitude where eathquake occured
     *
     * @param location gets the location where earthquake occured
     *
     * @param timeInMilliseconds gets the date when earthquake occured
     *
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //Gets the value of magnitude
    public double getMagnitude(){
        return mMagnitude;
    }

    //Gets the value of location
    public String getLocation(){
        return mLocation;
    }

    //Gets the value pf date
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
