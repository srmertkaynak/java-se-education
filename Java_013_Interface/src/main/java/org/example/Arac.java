package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Arac {

    private String plakaNumarasi;
    private byte modelYili;
    private String modelSeri;
    private short koltukSayisi;
    private boolean surucuDurumu;

    public void hareketEt(){
        System.out.println("Hareket ediyor.");
    }

    @Override
    public String toString() {
        return "Arac{" +
                "plakaNumarasi='" + plakaNumarasi + '\'' +
                ", modelYili=" + modelYili +
                ", modelSeri='" + modelSeri + '\'' +
                ", koltukSayisi=" + koltukSayisi +
                ", surucuDurumu=" + surucuDurumu +
                '}';
    }

    public void hareketEt(String kamyon) {
        System.out.println("Harekete geçildi: "+kamyon);
    }
}
