package com.example.admin.scloud.screen.library;

import com.example.admin.scloud.data.model.Track;
import com.example.admin.scloud.data.source.fakedata.FakeDataLocal;
import com.example.admin.scloud.data.source.fakedata.OnGetDataListener;

import java.util.List;

public class LibraryPresenter implements LibraryContract.Presenter, OnGetDataListener {
    private LibraryContract.View mView;
    private FakeDataLocal mDataLocal;

    public LibraryPresenter(LibraryContract.View view) {
        mView = view;
        mDataLocal = new FakeDataLocal(this);
    }

    @Override
    public void onGetDataSuccess(List<Track> tracks) {
        mView.addData(tracks);
    }

    @Override
    public void onGetDataFail() {

    }

    @Override
    public void getStream() {
        mDataLocal.getStream();
    }
}
