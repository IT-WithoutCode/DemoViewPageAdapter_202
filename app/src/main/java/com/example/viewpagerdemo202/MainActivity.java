package com.example.viewpagerdemo202;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout_202;
    private ViewPager viewPager_202;
    private ViewPagerAdapter_202 adapter_202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo các view
        tabLayout_202 = findViewById(R.id.tabLayout_202);
        viewPager_202 = findViewById(R.id.viewPager_202);

        // Khởi tạo adapter với FragmentManager
        adapter_202 = new ViewPagerAdapter_202(getSupportFragmentManager());

        // Set adapter cho ViewPager
        viewPager_202.setAdapter(adapter_202);

        // Kết nối TabLayout với ViewPager
        tabLayout_202.setupWithViewPager(viewPager_202);
    }
}