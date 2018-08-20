package com.example.admin.scloud.screen.stream;

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

public class StreamFragment extends Fragment implements StreamContract.View {

    private ArrayList<Track> mTracks = new ArrayList<>();
    private StreamPresenter mPresenter = new StreamPresenter(this);
    private StreamRecyclerAdapter mStreamRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stream, container, false);

        RecyclerView mRecyclerView;
        RecyclerView.LayoutManager mLayoutManager;

        mRecyclerView = view.findViewById(R.id.recycler_stream);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(container.getContext(),
                LinearLayout.VERTICAL, false);
        mStreamRecyclerAdapter =
                new StreamRecyclerAdapter(mTracks, container.getContext());

        mPresenter.getStream();

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mStreamRecyclerAdapter);
        return view;
    }

    @Override
    public void addData(List<Track> tracks) {
        mStreamRecyclerAdapter.addData(tracks);
    }
}
