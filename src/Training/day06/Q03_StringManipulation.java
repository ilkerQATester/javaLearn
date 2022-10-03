package Training.day06;

import java.util.Scanner;

public class Q03_StringManipulation {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String name = scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String surName = scan.nextLine();

        if (surName.length()>name.length()) {

            System.out.println("Soyisminizin karakter sayısı isminizin karakter sayısından fazla");

        } else if (surName.length()<name.length()) {

            System.out.println("İsminizin karakter sayısı soyisminizin karakter sayısından fazla");

        }
        else {

            System.out.println("Soyisminizin ve isminizin karakter sayısı eşit");
        }
    }
}
