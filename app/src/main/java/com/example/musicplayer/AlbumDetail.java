package com.example.musicplayer;


public class AlbumDetail {

    private String mArtistName;
    private String mMusicName;
    private int mImageId = IMAGE_PRESENT;
    private int mAudioId;

    private static final int IMAGE_PRESENT = -1;

    public AlbumDetail(String artistName, String musicName, int imageId,int audioId) {
        mArtistName = artistName;
        mMusicName = musicName;
        mImageId = imageId;
        mAudioId=audioId;

    }

    public AlbumDetail(String artistName, String musicName,int audioId) {
        mArtistName = artistName;
        mMusicName = musicName;
        mAudioId=audioId;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getMusicName() {
        return mMusicName;
    }

    public int getImageId() { return mImageId; }

    public boolean hasImage() { return (mImageId != IMAGE_PRESENT);}

    public int getAudioId(){return mAudioId;}

    @Override
    public String toString() {
        return "AlbumDetail{" +
                "mArtistName='" + mArtistName + '\'' +
                ", mMusicName='" + mMusicName + '\'' +
                ", mImageId=" + mImageId +
                ", mAudioId=" + mAudioId +
                '}';
    }
}





