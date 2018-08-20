package com.example.admin.scloud.screen.library;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.admin.s_cloud.R;
import com.example.admin.scloud.data.model.Track;

import java.util.ArrayList;
import java.util.List;

public class LibraryFragment extends Fragment implements LibraryContract.View {

    private ArrayList<Track> mTracks = new ArrayList<>();
    private LibraryPresenter mPresenter = new LibraryPresenter(this);
    private LibraryRecyclerAdapter mLibraryRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_library, container, false);

        RecyclerView mRecyclerView;
        RecyclerView.LayoutManager mLayoutManager;

        mRecyclerView = view.findViewById(R.id.recycler_library);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(container.getContext(),
                LinearLayout.VERTICAL, false);
        mLibraryRecyclerAdapter = new LibraryRecyclerAdapter(mTracks, container.getContext());

        mPresenter.getStream();

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mLibraryRecyclerAdapter);
        return view;
    }

    @Override
    public void addData(List<Track> tracks) {
        mLibraryRecyclerAdapter.addData(tracks);
    }
}
