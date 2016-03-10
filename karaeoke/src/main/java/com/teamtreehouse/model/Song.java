package com.teamtreehouse.model;

public class Song {

    private String mArtist;
    private String mTitle;
    private String mVideoUrl;

    public Song(String artist, String title, String videoUrl) {
        this.mArtist = artist;
        mTitle = title;
        mVideoUrl = videoUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getVideoUrl() {
        return mVideoUrl;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmVideoUrl(String mVideoUrl) {
        this.mVideoUrl = mVideoUrl;
    }

    @Override
    public String toString() {
        return String.format("Song: %s by %s", mTitle, mArtist);
    }
}
