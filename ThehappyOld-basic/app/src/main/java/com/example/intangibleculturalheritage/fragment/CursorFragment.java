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
import com.example.intangibleculturalheritage.adapter.CursorAdapter;
import com.example.intangibleculturalheritage.model.CategoryBean;

import java.util.ArrayList;
import java.util.List;

public class CursorFragment extends Fragment {

    private final List<CategoryBean> data = new ArrayList<>();

    {
        data.add(new CategoryBean(R.mipmap.ct0,"粤菜"));
        data.add(new CategoryBean(R.mipmap.ct1,"粤绣"));
        data.add(new CategoryBean(R.mipmap.ct2,"粤剧"));
        data.add(new CategoryBean(R.mipmap.ct3,"蔡李佛拳"));
        data.add(new CategoryBean(R.mipmap.ct4,"咏春拳"));
        data.add(new CategoryBean(R.mipmap.ct5,"剪纸"));
        data.add(new CategoryBean(R.mipmap.ct6,"香云纱"));
        data.add(new CategoryBean(R.mipmap.ct7,"木板年画"));
        data.add(new CategoryBean(R.mipmap.ct8,"更多"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cursor, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rvContent = view.findViewById(R.id.rv_content);
        CursorAdapter cursorAdapter = new CursorAdapter();
        rvContent.setAdapter(cursorAdapter);
        cursorAdapter.setData(data);
        try {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.mClSaySearch.setVisibility(View.VISIBLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}