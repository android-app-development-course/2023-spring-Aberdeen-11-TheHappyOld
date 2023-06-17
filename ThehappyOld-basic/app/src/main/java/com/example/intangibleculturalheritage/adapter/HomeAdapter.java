package com.example.intangibleculturalheritage.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intangibleculturalheritage.HomeDetailActivity;
import com.example.intangibleculturalheritage.R;
import com.example.intangibleculturalheritage.model.HomeBean;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    private List<HomeBean> data;

    @NonNull
    @Override
    public HomeAdapter.HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.HomeHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public void setData(List<HomeBean> data) {
        this.data = data;
    }

    public static class HomeHolder extends RecyclerView.ViewHolder {

        private final TextView mTvTile;
        private final ImageView mIvContent;
        private final TextView mTvStartTime;
        private final TextView mTvEndTime;
        private final TextView mTvPriceNum;

        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            mTvTile = itemView.findViewById(R.id.tv_title);
            mIvContent = itemView.findViewById(R.id.iv_content);
            mTvStartTime = itemView.findViewById(R.id.tv_start_time);
            mTvEndTime = itemView.findViewById(R.id.tv_end_time);
            mTvPriceNum = itemView.findViewById(R.id.tv_price_num);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), HomeDetailActivity.class));
                }
            });
        }

        public void bindData(HomeBean homeBean) {
            mTvTile.setText(homeBean.getTitle());
            mIvContent.setImageResource(homeBean.getImgRes());
            mTvStartTime.setText(homeBean.getStartTime());
            mTvEndTime.setText(homeBean.getEndTime());
            mTvPriceNum.setText(homeBean.getPrice());
        }
    }
}
