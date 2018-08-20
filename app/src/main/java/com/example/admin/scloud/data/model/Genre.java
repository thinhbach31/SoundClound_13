package com.example.admin.scloud.data.model;

public class Genre {
    private String mGenreName;
    private int mImage;

    public Genre(String genreName, int image) {
        mGenreName = genreName;
        mImage = image;
    }

    public Genre() {
    }

    public void setGenreName(String genreName) {
        mGenreName = genreName;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getGenreName() {
        return mGenreName;
    }

    public int getImage() {
        return mImage;
    }
}
