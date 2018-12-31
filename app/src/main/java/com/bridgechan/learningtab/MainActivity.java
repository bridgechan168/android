package com.bridgechan.learningtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bridgechan.learningtab.adapter.CustomPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private CustomPagerAdapter customAdap;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customAdap = new CustomPagerAdapter(this);
        viewPager = findViewById(R.id.layout_viewpager);
        tabLayout = findViewById(R.id.layout_tabs);

        viewPager.setAdapter(customAdap);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

    }
}
