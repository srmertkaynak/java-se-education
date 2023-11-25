package org.example;

public class AppMain {
    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        System.out.println("-----------");
        Kopek kopek = new Kopek();
        System.out.println("-----------");
        Kus kus = new Kus();
        System.out.println("-----------");

        kedi.sesVer();
        kopek.sesVer();
        kus.sesVer();

        if (kedi instanceof Hayvan){
            System.out.println(kedi);
        }

        Hayvan hayvan = new Hayvan();
        hayvan.sesVer();
        System.out.println("------------");

        Kedi kedi2 = (Kedi) new Hayvan();
        kedi2.sesVer();

    }
}