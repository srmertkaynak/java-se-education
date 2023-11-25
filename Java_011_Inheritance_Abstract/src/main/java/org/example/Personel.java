package org.example;

public class Personel {

    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private String personelNo;
    private String departman;

    public Personel(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo, String personelNo, String departman) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNo = telefonNo;
        this.kimlikNo = kimlikNo;
        this.hesapNo = hesapNo;
        this.personelNo = personelNo;
        this.departman = departman;
    }

    public Personel() {

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

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }
}
