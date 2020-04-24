package com.testing.martialarts;

import android.os.Parcel;
import android.os.Parcelable;

public class MartialArts implements Parcelable{
    private String namaBelaDiri;
    private String detailBelaDiri;
    private int logoBelaDiri;
    private int fotoBelaDiri;

    public String getNamaBelaDiri() {
        return namaBelaDiri;
    }

    public void setNamaBelaDiri(String namaBelaDiri) {
        this.namaBelaDiri = namaBelaDiri;
    }

    public String getDetailBelaDiri() {
        return detailBelaDiri;
    }

    public void setDetailBelaDiri(String detailBelaDiri) {
        this.detailBelaDiri = detailBelaDiri;
    }

    public int getLogoBelaDiri() {
        return logoBelaDiri;
    }

    public void setLogoBelaDiri(int logoBelaDiri) {
        this.logoBelaDiri = logoBelaDiri;
    }

    public int getFotoBelaDiri() {
        return fotoBelaDiri;
    }

    public void setFotoBelaDiri(int fotoBelaDiri) {
        this.fotoBelaDiri = fotoBelaDiri;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(this.namaBelaDiri);
        dest.writeString(this.detailBelaDiri);
        dest.writeInt(this.logoBelaDiri);
        dest.writeInt(this.fotoBelaDiri);
    }

    public MartialArts(){}

    protected MartialArts(Parcel in){
        this.namaBelaDiri = in.readString();
        this.detailBelaDiri = in.readString();
        this.logoBelaDiri = in.readInt();
        this.fotoBelaDiri = in.readInt();
    }

    public static final Parcelable.Creator<MartialArts> CREATOR = new Parcelable.Creator<MartialArts>(){
        @Override
        public MartialArts createFromParcel(Parcel source){
            return new MartialArts(source);
        }

        @Override
        public MartialArts[] newArray(int size){
            return new MartialArts[size];
        }
    };
}
