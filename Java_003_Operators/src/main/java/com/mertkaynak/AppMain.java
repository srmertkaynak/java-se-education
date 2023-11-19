package com.mertkaynak;

public class AppMain {
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 20;
        int sonuc = s1 + s2;

        System.out.println(sonuc);

        System.out.println("Mod Alma: " + 2 % 4);

        // Ternary Operator
        System.out.println((s1 > s2) ? "Evet" : "Hayır");

        int i = 0;
        int result;

        System.out.println(result = i+1); // 1
        System.out.println(result = i+1); // 2
        System.out.println(result = i+1); // 3
        System.out.println(result = i+1); // 4
    }
}