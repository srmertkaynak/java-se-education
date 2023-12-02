package com.mertkaynak;

import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        System.out.println("id: " +ogrenci.getId());
        System.out.println("adi: " +ogrenci.getAdi());
        System.out.println("soyadi: " +ogrenci.getSoyadi());

        System.out.println("-------------");
        ogrenci = new Ogrenci("Salih");
        System.out.println("id: " +ogrenci.getId());
        System.out.println("adi: " +ogrenci.getAdi());
        System.out.println("soyadi: " +ogrenci.getSoyadi());

        System.out.println("-------------");
        ogrenci = null;

        Optional<Double> ortalama = ortalamaHesapla(50, 77, 33, 55, 66, 8.8, 55.2, 12.2, 10);
        if (ortalama.isPresent()){
            System.out.println("Sınav ortalaması: "+ortalama.get());
        }else{
            System.out.println("Henüz sınav yapılmadı");
        }
    }

    private static Optional<Double> ortalamaHesapla(double... notlar){
        if (notlar.length == 0){
            return Optional.empty(); // Hiç parametre gönderilmediyse geriye boş(empty) gönder.
        }
        double toplamDeger = 0.0;
        for (double not : notlar) {
            toplamDeger += not;
        }
        return Optional.of(toplamDeger / notlar.length);
    }
}