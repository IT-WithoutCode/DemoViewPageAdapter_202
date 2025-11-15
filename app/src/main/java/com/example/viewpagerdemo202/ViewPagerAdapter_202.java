package com.example.viewpagerdemo202;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter_202 extends FragmentPagerAdapter {

    private String[] tabTitles_202 = {"Sức khỏe", "Học tập", "Thành công"};

    public ViewPagerAdapter_202(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HealthFragment_202();
            case 1:
                return new LearningFragment_202();
            case 2:
                return new SuccessFragment_202();
            default:
                return new HealthFragment_202();
        }
    }

    @Override
    public int getCount() {
        return tabTitles_202.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles_202[position];
    }
}