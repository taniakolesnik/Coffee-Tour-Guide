package com.example.android.tourguide;

/**
 * Created by tetianakolesnik on 11/01/2018.
 */

public class Place {

    private String mName;
    private String mAddress;
    private String mOpenHours;
    private int mImage;

    public Place(String name, String address, String openHours, int image) {
        mName = name;
        mAddress = address;
        mOpenHours = openHours;
        mImage = image;
    }

    public Place(String name, String address, String openHours) {
        mName = name;
        mAddress = address;
        mOpenHours = openHours;
    }

    public String getPlaceName(){
        return mName;
    }

    public String getPlaceAddress(){
        return mAddress;
    }

    public String getPlaceOpenHours(){
        return mOpenHours;
    }

    public int getPlaceImage(){
        return mImage;
    }
}
