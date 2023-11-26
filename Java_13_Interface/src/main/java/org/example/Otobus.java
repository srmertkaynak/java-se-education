package org.example;

public class Otobus extends Arac implements Kanun{
    @Override
    public String aracKontrolu() {
        return "Yıl sonunda yapılacak.";
    }

    @Override
    public short hizSiniriTest() {
        return 150;
    }

    @Override
    public byte ehliyetYenilemeZamani() {
        return 10;
    }
}
