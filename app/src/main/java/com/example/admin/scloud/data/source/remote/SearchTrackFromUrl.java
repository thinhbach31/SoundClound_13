package com.example.admin.scloud.data.source.remote;

import com.example.admin.scloud.data.model.Track;
import com.example.admin.scloud.data.source.TrackDataSource;

class SearchTrackFromUrl extends BaseFetchTrackFromUrl {
    public SearchTrackFromUrl(TrackDataSource.OnFetchDataListener<Track> listener) {
        super(listener);
    }
}
