package com.example.admin.scloud.screen.genre;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.s_cloud.R;
import com.example.admin.scloud.data.model.Genre;

import java.util.List;

public class GenreAdapter extends RecyclerView.Adapter<GenreAdapter.ViewHolders> {
    private List<Genre> mGenreList;
    private Context mContext;

    public GenreAdapter(Context context, List<Genre> genreList) {
        this.mContext = context;
        this.mGenreList = genreList;
    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.item_genre, null);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders sampleViewHolders, int i) {
        sampleViewHolders.mGenreName.setText(mGenreList.get(i).getGenreName());
        sampleViewHolders.mGenreImage.setImageResource(mGenreList.get(i).getImage());
    }

    @Override
    public int getItemCount() {
        return mGenreList != null ? mGenreList.size() : 0;
    }


    static class ViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView mGenreName;
        public ImageView mGenreImage;

        public ViewHolders(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mGenreImage = itemView.findViewById(R.id.image_genre);
            mGenreName = itemView.findViewById(R.id.text_genre_name);
        }
        @Override
        public void onClick(View view) {
        }
    }
}
