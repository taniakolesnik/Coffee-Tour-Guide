package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SlideFragmentPagerAdapter extends FragmentPagerAdapter {

    public SlideFragmentPagerAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
        super(supportFragmentManager);
    }

    private String fragmentsTabsName [] = {"West", "South", "North", "East"} ;

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WestFragment();
            case 1:
                return new SouthFragment();
            case 2:
                return new NorthFragment();
            case 3:
                return new EastFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return fragmentsTabsName.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsTabsName[position];
    }




}