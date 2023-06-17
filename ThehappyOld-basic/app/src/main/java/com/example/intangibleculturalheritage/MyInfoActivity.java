package com.example.intangibleculturalheritage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MyInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);
        findViewById(R.id.iv_back).setOnClickListener(V -> finish());
    }
}