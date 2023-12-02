package com.mertkaynak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {

        int s1 = 0;
        int s2 = 0;
        int toplam = 0;
        int bolme = 0;

        Scanner scanner = new Scanner(System.in);

        boolean hataDurumuKontrol = true;

        do {
            try {

                System.out.println("1. Sayıyı gir: ");
                s1 = scanner.nextInt();

                System.out.println("2. Sayıyı gir: ");
                s2 = scanner.nextInt();

                toplam = s1 + s2;
                System.out.println("Toplam: "+toplam);

                bolme = s1 / s2;
                System.out.println("Bölme: "+bolme);

                hataDurumuKontrol = true;

            }catch (InputMismatchException e){
                System.out.println("Hata: "+e);
                hataDurumuKontrol = false;
            }catch (ArithmeticException e){
                System.out.println("Hata: "+e);
                hataDurumuKontrol = false;
            }catch (NoSuchFieldError e){
                System.out.println("Hata: "+e);
                hataDurumuKontrol = false;
            }catch (Exception e){
                System.out.println("Hata: "+e);
                hataDurumuKontrol = false;
            }finally {
                System.out.println("---------------------");
            }

        }while (hataDurumuKontrol);

    }
}
