package org.example;

public class Musteri {

    private String adi;
    private String soyadi;
    private String iban;
    private int hesapNo;
    private double hesapCuzdani;

    public Musteri() {
        System.out.println("Boş parametreli");
    }

    public Musteri(String adi, String soyadi, String iban, int hesapNo, double hesapCuzdani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.iban = iban;
        this.hesapNo = hesapNo;
        this.hesapCuzdani = hesapCuzdani;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getHesapCuzdani() {
        return hesapCuzdani;
    }

    public void setHesapCuzdani(double hesapCuzdani) {
        this.hesapCuzdani = hesapCuzdani;
    }
}
