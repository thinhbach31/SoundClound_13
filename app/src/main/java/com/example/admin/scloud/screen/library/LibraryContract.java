package com.example.admin.scloud.screen.library;

import com.example.admin.scloud.data.model.Track;

import java.util.List;

public interface LibraryContract {
    interface View {
        void addData(List<Track> tracks);
    }

    interface Presenter {
        void getStream();
    }
}
