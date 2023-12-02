package com.mertkaynak;

import java.util.Map;
import java.util.TreeMap;

public class AppMain {
    public static void main(String[] args) {
        Map<String, Integer> plakaListe = new TreeMap();
        plakaListe.put("Konya", 42);
        plakaListe.put("Adana", 01);
        plakaListe.put("Eskişehir", 26);
        plakaListe.put("Kars", null);
        plakaListe.put("Gaziantep", 27);
        plakaListe.put("İzmir", 35);
        plakaListe.put("Ağrı", 04);
        plakaListe.put("Yalova", 77);
        plakaListe.put("İstanbul", 34);

        System.out.println(plakaListe);

        for (String key : plakaListe.keySet()){
            System.out.println("Plaka bilgisi: " + key + " " + plakaListe.get(key));
        }
    }
}