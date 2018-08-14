package com.example.admin.s_cloud.screen.main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.s_cloud.screen.genre.GenreFragment;
import com.example.admin.s_cloud.screen.library.LibraryFragment;
import com.example.admin.s_cloud.screen.stream.StreamFragment;
import com.example.admin.s_cloud.util.TabType;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    public static final int TAB_SIZE = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case TabType.STREAM_FRAGMENT:
                return new StreamFragment();
            case TabType.GENRE_FRAGMENT:
                return new GenreFragment();
            case TabType.LIBRARY_FRAGMENT:
                return new LibraryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_SIZE;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return TabType.STREAM;
            case 1:
                return TabType.GENRE;
            case 2:
                return TabType.LIBRARY;
        }
        return getPageTitle(position);
    }
}
