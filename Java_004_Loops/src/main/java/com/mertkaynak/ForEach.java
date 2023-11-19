package com.mertkaynak;

public class ForEach {

    public static void main(String[] args) {

        String[] ogrenciler = {"Mert", "Ali", "Ebru", "Elçin"};

        for ( String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

        System.out.println("--------------------");

        // KDV'li Fiyatlar

        int[] numaralar = {15, 250, 120, 85};

        for (int numara:numaralar) {
            System.out.println((numara * 20 / 100) + numara);
        }
    }
}
