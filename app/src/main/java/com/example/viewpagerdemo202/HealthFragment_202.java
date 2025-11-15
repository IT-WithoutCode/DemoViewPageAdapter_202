package com.example.viewpagerdemo202;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HealthFragment_202 extends Fragment {

    private RecyclerView recyclerView_202;
    private LinearAdapter_202 adapter_202;
    private List<TipModel_202> tipList_202;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view_202 = inflater.inflate(R.layout.fragment_tips_202, container, false);

        recyclerView_202 = view_202.findViewById(R.id.recyclerView_202);
        recyclerView_202.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo dữ liệu
        tipList_202 = new ArrayList<>();
        tipList_202.add(new TipModel_202("Ngủ đủ giấc", "Ngủ 7-8 tiếng mỗi ngày giúp cơ thể phục hồi và tái tạo năng lượng", "💤"));
        tipList_202.add(new TipModel_202("Uống đủ nước", "Uống ít nhất 2 lít nước mỗi ngày để cơ thể luôn được cung cấp đủ nước", "💧"));
        tipList_202.add(new TipModel_202("Tập thể dục", "Vận động 30 phút mỗi ngày giúp tăng cường sức khỏe tim mạch", "🏃"));
        tipList_202.add(new TipModel_202("Ăn rau xanh", "Rau xanh cung cấp vitamin và khoáng chất thiết yếu cho cơ thể", "🥗"));
        tipList_202.add(new TipModel_202("Thư giãn", "Dành thời gian thư giãn giúp giảm stress và cải thiện tâm trạng", "🧘"));
        tipList_202.add(new TipModel_202("Khám định kỳ", "Khám sức khỏe định kỳ giúp phát hiện sớm các vấn đề sức khỏe", "🏥"));

        adapter_202 = new LinearAdapter_202(tipList_202);
        recyclerView_202.setAdapter(adapter_202);

        return view_202;
    }
}