package com.example.intangibleculturalheritage.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.intangibleculturalheritage.MainActivity;
import com.example.intangibleculturalheritage.MyInfoActivity;
import com.example.intangibleculturalheritage.R;

public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        try {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.mClSaySearch.setVisibility(View.GONE);
        } catch (Exception e) {
            e.printStackTrace();
        }

        view.findViewById(R.id._ll_my_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MyInfoActivity.class));
            }
        });

    }
}