package org.example;

public class Kamyon extends Arac implements Kanun, DernekUyeSartlari{
    @Override
    public String aracKontrolu() {
        return "Kasım ayında kontroller yapılır.";
    }

    @Override
    public short hizSiniriTest() {
        return 100;
    }

    @Override
    public byte ehliyetYenilemeZamani() {
        return 10;
    }


    @Override
    public byte ehliyetYili() {
        return 5;
    }

    @Override
    public String dernekUyeOnayDurumu() {
        return null;
    }
}
