package com.example.viewpagerdemo202;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class LearningFragment_202 extends Fragment {

    private RecyclerView recyclerView_202;
    private GridAdapter_202 adapter_202;
    private List<TipModel_202> tipList_202;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view_202 = inflater.inflate(R.layout.fragment_tips_202, container, false);

        recyclerView_202 = view_202.findViewById(R.id.recyclerView_202);
        recyclerView_202.setLayoutManager(new GridLayoutManager(getContext(), 2));

        // Tạo dữ liệu
        tipList_202 = new ArrayList<>();
        tipList_202.add(new TipModel_202("Đặt mục tiêu", "Xác định mục tiêu rõ ràng", "🎯"));
        tipList_202.add(new TipModel_202("Pomodoro", "25 phút học - 5 phút nghỉ", "⏰"));
        tipList_202.add(new TipModel_202("Ghi chú", "Sử dụng sơ đồ tư duy", "📝"));
        tipList_202.add(new TipModel_202("Ôn tập", "Ôn lại kiến thức thường xuyên", "🔄"));
        tipList_202.add(new TipModel_202("Học nhóm", "Trao đổi và thảo luận", "👥"));
        tipList_202.add(new TipModel_202("Thực hành", "Áp dụng vào thực tế", "✍️"));

        adapter_202 = new GridAdapter_202(tipList_202);
        recyclerView_202.setAdapter(adapter_202);

        return view_202;
    }
}