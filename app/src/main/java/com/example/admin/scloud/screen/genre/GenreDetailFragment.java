package com.example.admin.scloud.screen.genre;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.s_cloud.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GenreDetailFragment extends android.support.v4.app.Fragment {


    public GenreDetailFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_genre_detail, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_genres_detail);
        recyclerView.setHasFixedSize(true);
        return rootView;
    }
}
