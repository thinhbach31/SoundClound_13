package com.example.admin.scloud.screen.data.source.remote;

import com.example.admin.scloud.screen.data.model.Track;
import com.example.admin.scloud.screen.data.source.TrackDataSource;

import org.json.JSONException;
import org.json.JSONObject;

public class FetchGenresFromUrl extends BaseFetchTrackFromUrl {
    protected FetchGenresFromUrl(TrackDataSource.OnFetchDataListener<Track> listener) {
        super(listener);
    }

    @Override
    protected JSONObject getJsonTrack(JSONObject jsonObject) throws JSONException {
        return jsonObject.getJSONObject(Track.TrackEntity.TRACK);
    }
}
