package com.mertkaynak;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    private String adi;
    private String soyadi;
    private String telefon;
    private String adres;
    private Brans brans;



    public void setAdi(String ecem) {
    }

    public void setSoyadi(String ecem) {
    }

    public void setAdres(String ecem) {
    }

    public void setTelefon(String ecem) {
    }

    public void setBrans(Brans brans) {
    }
}
