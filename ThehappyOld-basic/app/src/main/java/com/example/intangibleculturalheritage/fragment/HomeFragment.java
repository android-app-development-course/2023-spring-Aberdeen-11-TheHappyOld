package com.example.intangibleculturalheritage.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intangibleculturalheritage.MainActivity;
import com.example.intangibleculturalheritage.R;
import com.example.intangibleculturalheritage.adapter.HomeAdapter;
import com.example.intangibleculturalheritage.model.HomeBean;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private final HomeAdapter mHomeAdapter = new HomeAdapter();
    private final List<HomeBean> data = new ArrayList<>();

    {
        data.add(new HomeBean("“中国名片” --北京城市中轴线体验路线",R.mipmap.c3,"2022/7/29-","2022/7/31" ,"￥50/人"));
        data.add(new HomeBean("千里草原风景大道非遗体验路线",R.mipmap.c2,"2022/7/29-","2022/7/31" ,"￥50/人"));
        data.add(new HomeBean("浙西南畲乡非遗技艺体验路线",R.mipmap.c1,"2022/7/29-","2022/7/31" ,"￥50/人"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rvContent = view.findViewById(R.id.rv_content);
        rvContent.setAdapter(mHomeAdapter);
        mHomeAdapter.setData(data);
        try {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.mClSaySearch.setVisibility(View.VISIBLE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}