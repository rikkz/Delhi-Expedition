package com.example.rohit.delhiexpedition;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rohit on 19-12-2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private String fragmentNames[] = {"Restaurants","Hospitals","Tourist Places","Police Station"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new Restaurant();
        else if( position == 1 )
            return new Hospital();
        else if( position == 2 )
            return new Tourist();
        else
            return new Police();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentNames[position];
    }
}
