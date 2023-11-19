package com.mertkaynak;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        int yas = 18;
        if (yas >= 18){
            System.out.println("Oy kullanabilirsiniz.");
        }else{
            System.out.println("Oy kullanamazsınız.");
        }

        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in); // Kullanıcıdan veri almak için gereken kütüphane
        System.out.print("Lütfen yaşınızı giriniz: "); // Kullanıcıdan veri alma inputunu çıkar

        int age = sc.nextInt(); // Girilen değeri inputtan al değişkene at (Integer için)
        // nextDouble -
        int secmenYasi = 16;

        if (age > secmenYasi){
            System.out.println("Evet oy kullanabilirsiniz.");
        }else{
            System.out.println("Hayır oy kullanamazsınız.");
        }


    }
}