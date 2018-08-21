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
    private OnItemClick mOnItemClick;

    public GenreAdapter(Context context, List<Genre> genreList) {
        this.mContext = context;
        this.mGenreList = genreList;
    }

    public Context getContext() {
        return mContext;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        mOnItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.item_genre, null);
        return new ViewHolders(view, mOnItemClick);
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
        private TextView mGenreName;
        private ImageView mGenreImage;
        private OnItemClick mOnItemClick;

        public ViewHolders(@NonNull View itemView, OnItemClick onItemClick) {
            super(itemView);
            itemView.setOnClickListener(this);
            mGenreImage = itemView.findViewById(R.id.image_genre);
            mGenreName = itemView.findViewById(R.id.text_genre_name);
            mOnItemClick = onItemClick;
        }


        @Override
        public void onClick(View view) {
            mOnItemClick.clickItem(getAdapterPosition());
        }
    }

    interface OnItemClick {
        void clickItem(int position);
    }
}
