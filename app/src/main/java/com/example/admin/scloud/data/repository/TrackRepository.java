package com.example.admin.scloud.data.repository;

import com.example.admin.scloud.data.model.Track;
import com.example.admin.scloud.data.source.TrackDataSource;
import com.example.admin.scloud.data.source.remote.TrackRemoteDataSource;

public class TrackRepository implements TrackDataSource.RemoteDataSource,
        TrackDataSource.LocalDataSource {
    private static TrackRepository sTrackRepository;
    private TrackDataSource.LocalDataSource mLocalDataSource;
    private TrackDataSource.RemoteDataSource mRemoteDataSource;

    private TrackRepository(RemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    public static TrackRepository getInstance(TrackRemoteDataSource trackRemoteDataSource) {
        if (sTrackRepository == null) {
            sTrackRepository = new TrackRepository(
                    trackRemoteDataSource);
        }
        return sTrackRepository;
    }

    @Override
    public void getTracksRemote(String genre, int limit, int offSet, OnFetchDataListener<Track> listener) {
        if (mRemoteDataSource == null) return;
        mRemoteDataSource.getTracksRemote(genre, limit, offSet, listener);
    }

    @Override
    public void searchTracksRemote(String trackName, int offSet, OnFetchDataListener<Track> listener) {
        if (mRemoteDataSource != null) {
            mRemoteDataSource.searchTracksRemote(trackName, offSet, listener);
        }
    }
}
