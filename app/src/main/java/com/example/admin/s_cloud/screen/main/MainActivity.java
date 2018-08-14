package com.example.admin.s_cloud.screen.main;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.example.admin.s_cloud.R;
import com.example.admin.s_cloud.screen.genre.GenreFragment;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ConstraintLayout mLayoutPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fvbid();
        tabLayoutSetUp();

        mLayoutPlaying.setOnClickListener(this);
    }

    public void tabLayoutSetUp() {
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(viewPagerAdapter);
        mViewPager.setOffscreenPageLimit(2);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    private void fvbid() {
        mTabLayout = findViewById(R.id.tab_tab);
        mViewPager = findViewById(R.id.viewPager_view);
        mLayoutPlaying = findViewById(R.id.constraintLayout_playing);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //click at playing layout
            case R.id.constraintLayout_playing:
                try {

                } catch (Exception e) {

                }
                break;

                //click at button play/pause
            case R.id.button_MainPlayPause:
                try {

                } catch (Exception e) {

                }
                break;
        }
    }
}
