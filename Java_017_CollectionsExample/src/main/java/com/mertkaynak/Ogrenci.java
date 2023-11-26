package com.mertkaynak;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {
    private String adi;
    private String soyadi;
    private String ogrenciNo;
    private List<Ders> ders;
}
