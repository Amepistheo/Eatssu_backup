package com.example.eatssu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tabLayout = findViewById(R.id.tab_main);
        //viewPager2 = findViewById(R.id.vp_main);

//        adapter.addFragment(new Frag1());
//        adapter.addFragment(new Frag2());
//        adapter.addFragment(new Frag3());

//        val tabTitleArray = arrayOf(
//                "아침",
//                "점심",
//                "저녁",
//        )
    }
}