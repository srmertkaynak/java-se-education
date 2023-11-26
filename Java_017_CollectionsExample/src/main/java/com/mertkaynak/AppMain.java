package com.mertkaynak;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAdi("Ecem");
        ogretmen.setSoyadi("Ecem");
        ogretmen.setAdres("Ecem");
        ogretmen.setTelefon("Ecem");
        ogretmen.setBrans(Brans.Matematik);

        List<Ders> dersList = new ArrayList<>();
        dersList.add(new Ders(Dersler.Geometri, "100", ogretmen));

        System.out.println(dersList);
    }
}