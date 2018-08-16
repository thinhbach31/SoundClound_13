package com.example.admin.scloud.screen.home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.scloud.screen.genre.GenreFragment;
import com.example.admin.scloud.screen.library.LibraryFragment;
import com.example.admin.scloud.screen.stream.StreamFragment;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    public static final int TAB_SIZE = 3;

    @interface TabType {
        int STREAM_FRAGMENT = 0;
        int GENRE_FRAGMENT = 1;
        int LIBRARY_FRAGMENT = 2;

        String STREAM = "STREAM";
        String GENRE = "GENRE";
        String LIBRARY = "LIBRARY";
    }

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
            case TabType.STREAM_FRAGMENT:
                return TabType.STREAM;
            case TabType.GENRE_FRAGMENT:
                return TabType.GENRE;
            case TabType.LIBRARY_FRAGMENT:
                return TabType.LIBRARY;
        }
        return getPageTitle(position);
    }
}
