package com.example.intangibleculturalheritage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.intangibleculturalheritage.fragment.CursorFragment;
import com.example.intangibleculturalheritage.fragment.HomeFragment;
import com.example.intangibleculturalheritage.fragment.MyFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private final HomeFragment mHomeFragment = new HomeFragment();
    private final MyFragment mMyFragment = new MyFragment();
    private final CursorFragment mCursorFragment = new CursorFragment();
    public ConstraintLayout mClSaySearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_continue, mHomeFragment).commitNow();
        BottomNavigationView navigation = this.findViewById(R.id.navigation);
        mClSaySearch = this.findViewById(R.id.cl_say_search);
//        navigation.setItemIconTintList(null);
        navigation.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_continue, mHomeFragment).commitNow();
            } else if (item.getItemId() == R.id.course) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_continue, mCursorFragment).commitNow();
            } else if (item.getItemId() == R.id.my) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_continue, mMyFragment).commitNow();
            }
            return true;
        });

    }
}