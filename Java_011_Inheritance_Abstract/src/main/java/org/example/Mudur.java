package org.example;

public class Mudur extends Personel{

    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private String personelNo;
    */
    private String tahsilDurumu;
    private byte tecrubeYili;


    public Mudur(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo, String personelNo, String departman) {
        super(adi, soyadi, telefonNo, kimlikNo, hesapNo, personelNo, departman);
    }

    public Mudur() {
        super();
    }

    public String getTahsilDurumu() {
        return tahsilDurumu;
    }

    public void setTahsilDurumu(String tahsilDurumu) {
        this.tahsilDurumu = tahsilDurumu;
    }

    public byte getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(byte tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }
}
