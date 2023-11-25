package org.example;

public class AppMain {
    public static void main(String[] args) {
        byte yasi1 = 10;
        short yasi2 = 20;
        int sonuc = yasi1 + yasi2;

        System.out.println(sonuc);

//        byte + byte sonucu int tipindedir
//        short + short sonucu int tipindedir
//        byte + short sonucu int tipindedir


        int deneme1 = 2147483647;
        int deneme2 = 10;
        long sonuc2 = deneme1 + deneme2;
        System.out.println(sonuc2);

        float piSayisi = 3.14F; // 3.14f;
        double bankaHesapBilgisi = 13.3456789;
        long hesapBilgisi = 100_000_000; // _ literallerin burada bir gücü yok. Sadece sayıları ayırt etmek için kullanılabilir.


    }
}