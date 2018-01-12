package com.example.android.tourguide;

/**
 * Created by tetianakolesnik on 11/01/2018.
 */

public class Organisation {

    private String mName;
    private String mAddress;
    private String mOpenHours;

    public Organisation(String name, String address, String openHours) {
        mName = name;
        mAddress = address;
        mOpenHours = openHours;
    }

    public String getOrganisationName(){
        return mName;
    }

    public String getOrganisationAddress(){
        return mAddress;
    }

    public String getOrganisationOpenHours(){
        return mOpenHours;
    }

}
