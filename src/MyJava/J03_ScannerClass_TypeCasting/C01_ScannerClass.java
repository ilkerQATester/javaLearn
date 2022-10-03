package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {

        /*

        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

        // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        System.out.println("adınızı giriniz :");

        // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        System.out.println("isim = " + isim);

        */

        // TASK1 alan ve çevre hesaplama:

        Scanner scanner = new Scanner(System.in);
        System.out.println("kenar uzunluğunu giriniz :");
        int kenar = scanner.nextInt();
        System.out.println("alan = " + (kenar * kenar) + " " +"çevre = " + (kenar * 4));



        //Çay
        Scanner giris = new Scanner(System.in);
        System.out.println("İçilen Çay Miktarını Giriniz:");
        int cay = giris.nextInt();

        System.out.println("Atılan Şeker Sayısı Giriniz:");
        int seker = giris.nextInt();
        int total = (int) (cay * seker * 1.7 * 365 / 1000);

        System.out.println("Yıllık Şeker Tüketiminiz: " + total + "KG");

        if (total > 6){
            System.out.println("Şeker Kullanımını Azaltmalısın!");
        }

        else {
            System.out.println("Güzel Az Şeker Atmaya Devam :)");
        }



        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);
    }
}
