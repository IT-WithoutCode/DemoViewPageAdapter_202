package com.example.viewpagerdemo202;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter_202 extends PagerAdapter {

    private Context context_202;
    private int[] layouts_202;

    public ViewPagerAdapter_202(Context context_202, int[] layouts_202) {
        this.context_202 = context_202;
        this.layouts_202 = layouts_202;
    }

    @Override
    public int getCount() {
        return layouts_202.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater_202 = LayoutInflater.from(context_202);
        View view_202 = inflater_202.inflate(layouts_202[position], container, false);
        container.addView(view_202);
        return view_202;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View view_202 = (View) object;
        container.removeView(view_202);
    }
}