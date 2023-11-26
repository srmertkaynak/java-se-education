package com.mertkaynak;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ders {
    private Dersler adi;
    private String dersKodu;
    private Ogretmen ogretmen;
    private byte sinav1;
    private byte sinav2;

    public Ders(Dersler dersler, String number, Ogretmen ogretmen) {
    }

    public float ortalamaAl(byte sinav1, byte sinav2){
        return ((float) sinav1 + sinav2) / 2;
    }
}
