package com.example.admin.scloud.screen.stream;

import com.example.admin.scloud.data.model.Track;

import java.util.List;

public interface StreamContract {
    interface View {
        void addData(List<Track> tracks);
    }

    interface Presenter {
        void getStream();
    }
}
