package com.example.newsapp1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageradpater extends FragmentPagerAdapter {
    int tabcount;
    public pageradpater(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                return new homefrag();
            case 1:
                return new sportsfrag();
            case 2:
                return new healthfrag();
            case 3:
                return new sciencefrag();
            case 4:
                return new politcsfrag();
            case 5:
                return new technologyfrag();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
