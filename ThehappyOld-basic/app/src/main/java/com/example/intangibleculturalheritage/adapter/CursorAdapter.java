package com.example.intangibleculturalheritage.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intangibleculturalheritage.R;
import com.example.intangibleculturalheritage.model.CategoryBean;

import java.util.List;

public class CursorAdapter extends RecyclerView.Adapter<CursorAdapter.CursorHolder> {

    private List<CategoryBean> data;

    @NonNull
    @Override
    public CursorAdapter.CursorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CursorHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CursorAdapter.CursorHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public void setData(List<CategoryBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public class CursorHolder extends RecyclerView.ViewHolder {

        private final ImageView mIvContent;
        private final TextView mTvName;

        public CursorHolder(@NonNull View itemView) {
            super(itemView);
            mIvContent = itemView.findViewById(R.id.iv_content);
            mTvName = itemView.findViewById(R.id.tv_name);
        }

        public void bindData(CategoryBean categoryBean) {
            mTvName.setText(categoryBean.getTitle());
            mIvContent.setImageResource(categoryBean.getRes());
        }
    }
}
