package com.example.glouz.shypkoapp.welcome;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class WelcomePageAdapter extends FragmentStatePagerAdapter {

    private static final int COUNT_PAGE = 4;

    WelcomePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return WelcomePageFragments.newInstance(position);
    }

    @Override
    public int getCount() {
        return COUNT_PAGE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position + 1);
    }
}
