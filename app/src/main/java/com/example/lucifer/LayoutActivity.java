package com.example.lucifer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        initViews();
    }

    private void initViews() {
        // setting toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // setting view pager
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        // setting tabLayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        FragmentPagerAdapter mainFragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.addFragment(new BioFragment(), getString(R.string.bio));
        mainFragmentPagerAdapter.addFragment(new ContactFragment(), getString(R.string.contact));
        viewPager.setAdapter(mainFragmentPagerAdapter);
    }

}
