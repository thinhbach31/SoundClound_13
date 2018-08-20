package com.example.admin.scloud.data.source.fakedata;

import com.example.admin.scloud.data.model.Artist;
import com.example.admin.scloud.data.model.Track;

import java.util.ArrayList;
import java.util.List;

public class FakeDataLocal {

    private OnGetDataListener mListener;

    public FakeDataLocal(OnGetDataListener listener) {
        mListener = listener;
    }

    private static final int ID = 0;
    private static final String ARTIST_NAME = "The Beatles";
    private static final String SONG_TITLE = "Hey Jude";
    private static final String ARTWORK_URL = "abc";
    private static final String SONG_URL = "abc";
    private static final int DURATION = 5;

    public void getStream() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(ID,
                new Artist(ARTIST_NAME),
                SONG_TITLE,
                ARTWORK_URL,
                SONG_URL,
                DURATION));

        tracks.add(new Track(ID,
                new Artist(ARTIST_NAME),
                SONG_TITLE,
                ARTWORK_URL,
                SONG_URL,
                DURATION));
        mListener.onGetDataSuccess(tracks);
    }
}
