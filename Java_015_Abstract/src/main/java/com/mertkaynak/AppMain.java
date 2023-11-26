package com.mertkaynak;

public class AppMain {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.sesVer();
        kedi.hareketEt();

        Hayvan hayvan = new Hayvan() {
            @Override
            public void sesVer() {

            }

            @Override
            public void hareketEt() {

            }
        }
    }
}