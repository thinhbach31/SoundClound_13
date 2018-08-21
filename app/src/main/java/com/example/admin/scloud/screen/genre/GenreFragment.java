package com.example.admin.scloud.screen.genre;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.s_cloud.R;
import com.example.admin.scloud.data.model.Genre;
import com.example.admin.scloud.utils.ConstantString;

import java.util.ArrayList;
import java.util.List;

public class GenreFragment extends Fragment implements GenreAdapter.OnItemClick {
    private static final int AUDIO_POSITION = 0;
    private static final int CLASSIC_POSITION = 1;
    private static final int COUNTRY_POSITION = 2;
    private static final int AMBIENT_POSITION = 3;
    private static final int ALTERNATIVE_POSITION = 4;
    private static final int LARGER = 2;
    private static final int SMALLER = 1;
    private RecyclerView mRecyclerGenres;
    private OnGenreSelectedListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_genres, container, false);
        mRecyclerGenres = view.findViewById(R.id.recycler_genres);
        setupUI(container);
        return view;
    }

    private void setupUI(ViewGroup container) {
        GridLayoutManager mGridLayoutManager;
        mRecyclerGenres.setHasFixedSize(true);
        mGridLayoutManager = new GridLayoutManager(getContext(), 2,
                GridLayoutManager.VERTICAL, false);
        mGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == AUDIO_POSITION ? LARGER : SMALLER;
            }
        });
        mRecyclerGenres.setLayoutManager(mGridLayoutManager);

        List<Genre> genreList = getGenreList();
        GenreAdapter genreAdapter = new GenreAdapter(container.getContext(), genreList);
        genreAdapter.setOnItemClick(this);
        mRecyclerGenres.setAdapter(genreAdapter);
    }

    private List<Genre> getGenreList() {
        List<Genre> mGenreList = new ArrayList<Genre>();
        mGenreList.add(new Genre(ConstantString.AUDIO, R.drawable.audio_genre));
        mGenreList.add(new Genre(ConstantString.CLASSIC, R.drawable.classic_genre));
        mGenreList.add(new Genre(ConstantString.COUNTRY, R.drawable.country_genre));
        mGenreList.add(new Genre(ConstantString.AMBIENT, R.drawable.ambient_genre));
        mGenreList.add(new Genre(ConstantString.ALTERNATIVE, R.drawable.alternative_genre));
        return mGenreList;
    }

    public interface OnGenreSelectedListener {
        void onGenreSelected(Fragment fragment);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnGenreSelectedListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement OnGenreSelectedListener");
        }
    }

    @Override
    public void clickItem(int position) {
        switch (position) {
            case AUDIO_POSITION:
                mListener.onGenreSelected(new GenreDetailFragment());
                break;

        }

    }
}
