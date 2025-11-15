package com.example.viewpagerdemo202;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class SuccessFragment_202 extends Fragment {

    private RecyclerView recyclerView_202;
    private StaggeredAdapter_202 adapter_202;
    private List<TipModel_202> tipList_202;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view_202 = inflater.inflate(R.layout.fragment_tips_202, container, false);

        recyclerView_202 = view_202.findViewById(R.id.recyclerView_202);
        recyclerView_202.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        // Tạo dữ liệu với độ dài mô tả khác nhau
        tipList_202 = new ArrayList<>();
        tipList_202.add(new TipModel_202("Dậy sớm", "Tận dụng buổi sáng", "🌅"));
        tipList_202.add(new TipModel_202("Thói quen tốt", "Xây dựng thói quen tích cực mỗi ngày để đạt được mục tiêu", "✅"));
        tipList_202.add(new TipModel_202("Học hỏi", "Không ngừng học", "📖"));
        tipList_202.add(new TipModel_202("Kết nối", "Kết nối với người tích cực và thành công trong lĩnh vực của bạn", "🤝"));
        tipList_202.add(new TipModel_202("Kiên trì", "Không bỏ cuộc", "💪"));
        tipList_202.add(new TipModel_202("Tư duy tích cực", "Luôn giữ tư duy tích cực và lạc quan trong mọi hoàn cảnh", "😊"));
        tipList_202.add(new TipModel_202("Hành động", "Thực hiện ngay", "🚀"));
        tipList_202.add(new TipModel_202("Quản lý thời gian", "Sử dụng thời gian hiệu quả", "⌚"));

        adapter_202 = new StaggeredAdapter_202(tipList_202);
        recyclerView_202.setAdapter(adapter_202);

        return view_202;
    }
}