package com.example.admin.scloud.screen.stream;

import com.example.admin.scloud.data.model.Track;
import com.example.admin.scloud.data.source.fakedata.FakeDataRemote;
import com.example.admin.scloud.data.source.fakedata.OnGetDataListener;

import java.util.List;

public class StreamPresenter implements StreamContract.Presenter, OnGetDataListener {
    private StreamContract.View mView;
    private FakeDataRemote mDataRemote;

    public StreamPresenter(StreamContract.View view) {
        mView = view;
        mDataRemote = new FakeDataRemote(this);
    }

    @Override
    public void getStream() {
        mDataRemote.getStream();
    }

    @Override
    public void onGetDataSuccess(List<Track> tracks) {
        mView.addData(tracks);
    }

    @Override
    public void onGetDataFail() {

    }
}
