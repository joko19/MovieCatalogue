package com.jackshaw.moviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int poster, pemeran1, pemeran2, pemeran3;
    private String name, deskripsi, sutradara, produksi, tahun, pemain1, pemain2, pemain3, konten;

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getPemeran1() {
        return pemeran1;
    }

    public void setPemeran1(int pemeran1) {
        this.pemeran1 = pemeran1;
    }

    public int getPemeran2() {
        return pemeran2;
    }

    public void setPemeran2(int pemeran2) {
        this.pemeran2 = pemeran2;
    }

    public int getPemeran3() {
        return pemeran3;
    }

    public void setPemeran3(int pemeran3) {
        this.pemeran3 = pemeran3;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getProduksi() {
        return produksi;
    }

    public void setProduksi(String produksi) {
        this.produksi = produksi;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getPemain1() {
        return pemain1;
    }

    public void setPemain1(String pemain1) {
        this.pemain1 = pemain1;
    }

    public String getPemain2() {
        return pemain2;
    }

    public void setPemain2(String pemain2) {
        this.pemain2 = pemain2;
    }

    public String getPemain3() {
        return pemain3;
    }

    public void setPemain3(String pemain3) {
        this.pemain3 = pemain3;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public Movie() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.poster);
        dest.writeInt(this.pemeran1);
        dest.writeInt(this.pemeran2);
        dest.writeInt(this.pemeran3);
        dest.writeString(this.name);
        dest.writeString(this.deskripsi);
        dest.writeString(this.sutradara);
        dest.writeString(this.produksi);
        dest.writeString(this.tahun);
        dest.writeString(this.pemain1);
        dest.writeString(this.pemain2);
        dest.writeString(this.pemain3);
        dest.writeString(this.konten);
    }

    protected Movie(Parcel in) {
        this.poster = in.readInt();
        this.pemeran1 = in.readInt();
        this.pemeran2 = in.readInt();
        this.pemeran3 = in.readInt();
        this.name = in.readString();
        this.deskripsi = in.readString();
        this.sutradara = in.readString();
        this.produksi = in.readString();
        this.tahun = in.readString();
        this.pemain1 = in.readString();
        this.pemain2 = in.readString();
        this.pemain3 = in.readString();
        this.konten = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
