package com.example.android.tourguide;

/**
 * Created by tetianakolesnik on 11/01/2018.
 */

public class Organisation {

    private String mName;
    private String mAddress;
    private String mPhone;

    public Organisation(String name, String address, String phone) {
        mName = name;
        mAddress = address;
        mPhone = phone;
    }

    public String getOrganisationName(){
        return mName;
    }

    public String getOrganisationAddress(){
        return mAddress;
    }

    public String getOrganisationPhone(){
        return mPhone;
    }
}
