package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SlideFragmentPagerAdapter extends FragmentPagerAdapter {


    private Context context;
    private String[] fragmentsTabsName;
    private static final int POSITION_ZERO = 0;
    private static final int POSITION_ONE = 1;
    private static final int POSITION_TWO = 2;
    private static final int POSITION_THREE = 3;
    private static final int TABS_NUMBER = 4;

    public SlideFragmentPagerAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
        super(supportFragmentManager);
        context = applicationContext;
        fragmentsTabsName = new String[] {context.getResources().getString(R.string.west_name),
                context.getResources().getString(R.string.south_name),
                context.getResources().getString(R.string.north_name),
                context.getResources().getString(R.string.east_name)} ;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case POSITION_ZERO:
                return new WestFragment();
            case POSITION_ONE:
                return new SouthFragment();
            case POSITION_TWO:
                return new NorthFragment();
            case POSITION_THREE:
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