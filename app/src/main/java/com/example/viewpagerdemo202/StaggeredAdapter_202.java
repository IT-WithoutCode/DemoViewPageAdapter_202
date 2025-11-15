package com.example.viewpagerdemo202;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StaggeredAdapter_202 extends RecyclerView.Adapter<StaggeredAdapter_202.ViewHolder_202> {

    private List<TipModel_202> tipList_202;

    public StaggeredAdapter_202(List<TipModel_202> tipList_202) {
        this.tipList_202 = tipList_202;
    }

    @NonNull
    @Override
    public ViewHolder_202 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_202 = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tip_staggered_202, parent, false);
        return new ViewHolder_202(view_202);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_202 holder, int position) {
        TipModel_202 tip_202 = tipList_202.get(position);
        holder.tvIcon_202.setText(tip_202.getIcon_202());
        holder.tvTitle_202.setText(tip_202.getTitle_202());
        holder.tvDescription_202.setText(tip_202.getDescription_202());
    }

    @Override
    public int getItemCount() {
        return tipList_202.size();
    }

    public static class ViewHolder_202 extends RecyclerView.ViewHolder {
        TextView tvIcon_202, tvTitle_202, tvDescription_202;

        public ViewHolder_202(@NonNull View itemView) {
            super(itemView);
            tvIcon_202 = itemView.findViewById(R.id.tvIcon_202);
            tvTitle_202 = itemView.findViewById(R.id.tvTitle_202);
            tvDescription_202 = itemView.findViewById(R.id.tvDescription_202);
        }
    }
}