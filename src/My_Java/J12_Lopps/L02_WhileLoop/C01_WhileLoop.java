package My_Java.J12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while lopp kullanılmalı
         */
        // Task1-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...

        System.out.println("For Çözüm");
        for (int i = 11; i < 21; i++) {
            System.out.println("i= " + i);
        }

        System.out.println("While Çözüm");
        int i = 11;
        while (i < 21) {
            System.out.println("i= " + i);
            i++;
        }

        // Task2->7 kere javaCAN print eden code create ediniz...
        int j = 1;
        while (j < 8) {
            System.out.println("JavaCAN");
            j++;
        }

        // Task3; 2 basamaklı tek sayıları yan yana print eden code create ediniz.
        int k = 11;
        while (k < 100) {
            System.out.print(k + " ");
            k+=2;
        }

        // Task4; girilen metni while loop ile tersten print eden code create ediniz.
        System.out.println("   *** task04 ***   ");

        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin= sc.nextLine();
        int metinUzunluk=metin.length();

        while (metinUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }

        // task05-> girilen tamsayıya kadar tamsayıların toplamını print eden code create ediniz...
         System.out.println("   *** task05 ***   ");
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int toplam = 0;//döngü actiondan oluşacak toplam için bpş int oluşturuldu
        while (sayi > 0) {// sayı 1 olana dek

           toplam += sayi;// her döngüde sayıyı toplama ekle

            sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!

        }
         System.out.println("agam girdigin sayılar toplamı : " + toplam);

        // task06-> girilen tamsayın faktoriyelini print eden code create ediniz...
        System.out.println("   *** task06 ***   ");

        int faktoriyel = 1;

        while (sayi > 0) {// sayı 1 olana dek body de ne varsa yap
            faktoriyel *= sayi;// her döngüde sayıyı toplama ekle
            sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);

    }
}
