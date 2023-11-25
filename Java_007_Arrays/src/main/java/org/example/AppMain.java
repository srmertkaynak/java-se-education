package org.example;

public class AppMain {
    public static void main(String[] args) {

        int [] sayi = new int [5]; // dizideki eleman sayısı kadar eleman eklenebilir. fazlası eklenmez.

        sayi[0] = 100;
        sayi[1] = 200;
        sayi[2] = 300;
        sayi[3] = 400;
        sayi[4] = 500;
        System.out.println(sayi[0] + " " + sayi[1] + " " + sayi[2] + " " + sayi[3] + " " + sayi[4] );

        System.out.println("------------------");

        short myArray[] = new short[4];
        myArray[0] = 1000;

        System.out.println(myArray[0]);

        System.out.println("------------------");

        byte myArrayByte[] = {14, 53, 19, 23};

        for (int i = 0; i < myArrayByte.length; i++) {
            System.out.println(myArrayByte[i]);
        }

    }
}