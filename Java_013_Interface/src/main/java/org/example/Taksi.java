package org.example;

public class Taksi extends Arac implements Kanun, BelediyeIstekleri{

    @Override
    public String aracKontrolu() {
        return "2 ayda bir";
    }

    @Override
    public short hizSiniriTest() {
        return 105;
    }

    @Override
    public byte ehliyetYenilemeZamani() {
        return 8;
    }

    @Override
    public String calismaSaatleri() {
        return "Sabah 8 - Akşam 17";
    }

    @Override
    public boolean akilSagligiRaporu() {
        return true;
    }
}
