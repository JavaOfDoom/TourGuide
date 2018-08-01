package com.example.joe.tourguide;

public class Tour {

    private String mExhibitInfo;

    private int mImageResourceId;

    public Tour(String exhibitInfo, int imageResourceId) {
        mExhibitInfo = exhibitInfo;
        mImageResourceId = imageResourceId;
    }

    public String getExhibitInfo() {
        return mExhibitInfo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
