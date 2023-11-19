package com.mertkaynak;

public class KareAl {

    public static int kareAl(int sayi){
        return sayi * 2;
    }
    private static int ucSayiTopla(int i, int j, int z) {
        return i + j + z;
    }

    public static void main(String[] args) {

        System.out.println("Kare Al");
        System.out.println(kareAl(5));
        System.out.println(ucSayiTopla(5, 2, 6));


    }

}
