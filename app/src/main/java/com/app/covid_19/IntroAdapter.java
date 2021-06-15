package com.app.covid_19;

import android.graphics.Color;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroFragment.newInstance( Color.parseColor("#03A9F4"), position); // blue
            case 1:
                return IntroFragment.newInstance( Color.parseColor("#FDD835"), position); // yellow
            case 2:
                return IntroFragment.newInstance( Color.parseColor("#E53935"), position); // red
            default:
                return IntroFragment.newInstance(Color.parseColor("#4CAF50"), position); // green
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    
}