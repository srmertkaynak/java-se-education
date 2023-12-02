package com.mertkaynak;

import java.util.*;

public class AppMain {
    public static void main(String[] args) {
        List<String> ogrenciListe = new ArrayList();
        ogrenciListe.add("Şadiye");
        ogrenciListe.add("Mert");
        ogrenciListe.add("Mustafa");
        ogrenciListe.add("Fatih");
        ogrenciListe.add("Ebru");
        ogrenciListe.add("Kenan");
        ogrenciListe.add("Mahir");
        ogrenciListe.add("Kenan");
        ogrenciListe.add("Mert");
        ogrenciListe.add(null);
        System.out.println("ArrayList Öğrenciler: " + ogrenciListe);

        System.out.println("------------");

        Set<String> ogrenciListe2 = new HashSet();
        ogrenciListe2.add("Şadiye");
        ogrenciListe2.add("Mert");
        ogrenciListe2.add("Mustafa");
        ogrenciListe2.add("Fatih");
        ogrenciListe2.add("Ebru");
        ogrenciListe2.add(null);
        ogrenciListe2.add("Kenan");
        ogrenciListe2.add("Mahir");
        ogrenciListe2.add("Kenan");
        ogrenciListe2.add("Mert");
        System.out.println("HashSet Öğrenciler 2: " + ogrenciListe2);

        System.out.println("------------");

        Set<String> ogrenciListe3 = new TreeSet<>();
        ogrenciListe3.add("Şadiye");
        ogrenciListe3.add("Mert");
        ogrenciListe3.add("Mustafa");
        ogrenciListe3.add("Fatih");
        ogrenciListe3.add("Ebru");
        ogrenciListe3.add("Kenan");
        ogrenciListe3.add("Mahir");
        ogrenciListe3.add("Kenan");
        ogrenciListe3.add("Mert");
//        ogrenciListe3.add(null);
        System.out.println("TreeSet Öğrenciler 3: " + ogrenciListe3);

        System.out.println("------------");

        Set<String> ogrenciListe4 = new LinkedHashSet<>();
        ogrenciListe4.add("Şadiye");
        ogrenciListe4.add("Mert");
        ogrenciListe4.add("Mustafa");
        ogrenciListe4.add("Fatih");
        ogrenciListe4.add("Ebru");
        ogrenciListe4.add("Kenan");
        ogrenciListe4.add("Mahir");
        ogrenciListe4.add("Kenan");
        ogrenciListe4.add("Mert");
        ogrenciListe4.add(null);
        System.out.println("LinkedHashSet Öğrenciler 4: " + ogrenciListe4);

        ogrenciListe4.remove("Şadiye");
        System.out.println("LinkedHashSet Öğrenciler 4: " + ogrenciListe4);

        ogrenciListe4.remove("Ogün");
        System.out.println("LinkedHashSet Öğrenciler 4: " + ogrenciListe4);

        if(ogrenciListe4.isEmpty()){
            System.out.println("Bu liste boştur.");
        } else{
            System.out.println("Liste dolu");
        }

        ogrenciListe4.clear();
        System.out.println("LinkedHashSet Öğrenciler 4: " + ogrenciListe4);

        if(ogrenciListe4.isEmpty()){
            System.out.println("Bu liste boştur.");
        } else{
            System.out.println("Liste dolu");
        }


    }
}