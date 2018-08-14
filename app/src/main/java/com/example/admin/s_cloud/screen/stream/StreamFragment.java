package com.example.admin.s_cloud.screen.stream;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.admin.s_cloud.R;
import com.example.admin.s_cloud.screen.main.MainActivity;

public class StreamFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stream,container, false);


        return view;
    }
}
