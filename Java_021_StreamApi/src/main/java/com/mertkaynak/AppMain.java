package com.mertkaynak;

import java.util.List;
import java.util.stream.Stream;

public class AppMain {
    public static void main(String[] args) {

        Stream<String> bosKayit = Stream.empty();
        System.out.println("Boş Kayıt: "+bosKayit);

        Stream<String> tekKayit = Stream.of("Yakup");
        System.out.println("Kayıt Bilgisi: "+tekKayit);

        Stream<String> cokluKayit = Stream.of("Ali", "Mahir", "Yalçın", "Yunus", "Senem");
        System.out.println("Kayıt Bilgileri: "+cokluKayit);

        List<String> ogrenciListesi = List.of("Ali", "Mahir", "Yalçın", "Yunus", "Senem");
        System.out.println("Öğrenci Bilgileri: "+ogrenciListesi);

        System.out.println("--------------------------------");

        Stream <String> ogrencilerStream = ogrenciListesi.stream();
        System.out.println("Toplam Öğrenci Sayısı: "+ogrencilerStream.count());
        ogrencilerStream.forEach(ogrenci -> System.out.println(ogrenci));
    }
}