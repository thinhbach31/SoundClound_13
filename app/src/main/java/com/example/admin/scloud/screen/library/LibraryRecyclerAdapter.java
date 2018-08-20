package com.example.admin.scloud.screen.library;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.s_cloud.R;
import com.example.admin.scloud.data.model.Track;

import java.util.ArrayList;
import java.util.List;

public class LibraryRecyclerAdapter extends RecyclerView.Adapter<LibraryRecyclerAdapter.ViewHolder> {

    private ArrayList<Track> mTracks;
    private Context mContext;

    public LibraryRecyclerAdapter(ArrayList<Track> tracksArray, Context context) {
        mTracks = tracksArray;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_track_local, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bindData(mTracks.get(i));
    }

    @Override
    public int getItemCount() {
        return mTracks != null ? mTracks.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextSongName, mText_Artist;
        ImageView mImageSong;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextSongName = itemView.findViewById(R.id.text_local_song_name);
            mText_Artist = itemView.findViewById(R.id.text_local_artist);
            mImageSong = itemView.findViewById(R.id.image_local_song);
        }

        private void bindData(Track track) {
            mTextSongName.setText(track.getTitle());
            mText_Artist.setText(track.getArtist().getName());
            mImageSong.setImageURI(Uri.parse(track.getArtworkURL()));
        }
    }

    public void addData(List<Track> tracks) {
        if (tracks == null) return;
        mTracks.addAll(tracks);
        notifyDataSetChanged();
    }
}
