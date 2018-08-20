package com.example.admin.scloud.data.source.fakedata;

import com.example.admin.scloud.data.model.Track;

import java.util.List;

public interface OnGetDataListener {

    void onGetDataSuccess(List<Track> tracks);

    void onGetDataFail();
}
