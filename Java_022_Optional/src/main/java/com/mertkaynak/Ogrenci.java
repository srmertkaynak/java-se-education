package com.mertkaynak;

public class Ogrenci {

    private int id;
    private String adi;
    private String soyadi;

    public Ogrenci() {
    }

    public Ogrenci(String adi) {
        this.adi = adi;
    }

    public Ogrenci(int id, String adi, String soyadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public int getId() {
        return id;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }
}
