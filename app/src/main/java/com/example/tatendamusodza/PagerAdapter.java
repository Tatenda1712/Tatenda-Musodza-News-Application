package com.example.tatendamusodza;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new TechnologyFragment();
            case 3:
                return new HealthFragment();
            case 4:
                return new PoliticsFragment();
            case 5:
                return new EntertainmentFragment();
            case 6:
                return new About();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
