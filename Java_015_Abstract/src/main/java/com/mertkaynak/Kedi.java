package com.mertkaynak;

public class Kedi extends Hayvan{
    @Override
    public void sesVer() {
        System.out.println("Kedi miyav.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kedi geziyor.");
    }
}
