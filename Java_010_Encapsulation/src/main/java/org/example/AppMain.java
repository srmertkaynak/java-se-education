package org.example;

public class AppMain {
    public static void main(String[] args) {

        Musteri musteri = new Musteri(
                "Ali",
                "Yağız",
                "TR123123213",
                1241241414,
                30000.15);
        System.out.println(musteri);

        System.out.println(musteri.getAdi());
        System.out.println(musteri.getSoyadi());
        System.out.println(musteri.getIban());
        System.out.println(musteri.getHesapCuzdani());
        System.out.println(musteri.getHesapNo());
    }
}