package com.example.viewpagerdemo202;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager_202;
    private ViewPagerAdapter_202 adapter_202;
    private int[] layouts_202;
    private Button btnPrevious_202, btnNext_202;
    private TextView tvPageIndicator_202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo các view
        viewPager_202 = findViewById(R.id.viewPager_202);
        btnPrevious_202 = findViewById(R.id.btnPrevious_202);
        btnNext_202 = findViewById(R.id.btnNext_202);
        tvPageIndicator_202 = findViewById(R.id.tvPageIndicator_202);

        // Mảng chứa các layout
        layouts_202 = new int[]{
                R.layout.page_one_202,
                R.layout.page_two_202,
                R.layout.page_three_202
        };

        // Khởi tạo adapter
        adapter_202 = new ViewPagerAdapter_202(this, layouts_202);

        // Set adapter cho ViewPager
        viewPager_202.setAdapter(adapter_202);

        // Tắt chức năng vuốt trái/phải
        viewPager_202.setOnTouchListener((v, event) -> true);

        // Cập nhật trạng thái nút ban đầu
        updateButtonState_202();

        // Xử lý sự kiện khi ViewPager thay đổi trang
        viewPager_202.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                updateButtonState_202();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        // Xử lý sự kiện click nút Previous
        btnPrevious_202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPage_202 = viewPager_202.getCurrentItem();
                if (currentPage_202 > 0) {
                    viewPager_202.setCurrentItem(currentPage_202 - 1);
                }
            }
        });

        // Xử lý sự kiện click nút Next
        btnNext_202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPage_202 = viewPager_202.getCurrentItem();
                if (currentPage_202 < layouts_202.length - 1) {
                    viewPager_202.setCurrentItem(currentPage_202 + 1);
                }
            }
        });
    }

    // Cập nhật trạng thái của các nút và indicator
    private void updateButtonState_202() {
        int currentPage_202 = viewPager_202.getCurrentItem();

        // Cập nhật text indicator
        tvPageIndicator_202.setText((currentPage_202 + 1) + "/" + layouts_202.length);

        // Disable nút Previous nếu đang ở trang đầu
        if (currentPage_202 == 0) {
            btnPrevious_202.setEnabled(false);
            btnPrevious_202.setAlpha(0.5f);
        } else {
            btnPrevious_202.setEnabled(true);
            btnPrevious_202.setAlpha(1.0f);
        }

        // Disable nút Next nếu đang ở trang cuối
        if (currentPage_202 == layouts_202.length - 1) {
            btnNext_202.setEnabled(false);
            btnNext_202.setAlpha(0.5f);
        } else {
            btnNext_202.setEnabled(true);
            btnNext_202.setAlpha(1.0f);
        }
    }
}