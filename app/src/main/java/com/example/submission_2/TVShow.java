package com.example.submission_2;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShow implements Parcelable {
    public static final Creator<TVShow> CREATOR = new Creator<TVShow>() {
        @Override
        public TVShow createFromParcel(Parcel source) {
            return new TVShow(source);
        }

        @Override
        public TVShow[] newArray(int size) {
            return new TVShow[size];
        }
    };
    private int image;
    private String title;
    private String dateStart;
    private String dateEnd;
    private String episode;
    private String description;

    public TVShow() {
    }

    protected TVShow(Parcel in) {
        this.image = in.readInt();
        this.title = in.readString();
        this.dateStart = in.readString();
        this.dateEnd = in.readString();
        this.episode = in.readString();
        this.description = in.readString();
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String date) {
        this.dateStart = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
        dest.writeString(this.title);
        dest.writeString(this.dateStart);
        dest.writeString(this.dateEnd);
        dest.writeString(this.episode);
        dest.writeString(this.description);
    }
}
