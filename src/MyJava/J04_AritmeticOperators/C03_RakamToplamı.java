package MyJava.J04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {

    public static void main(String[] args) {

        // kullanıcıdan alınan 3 basamaklı bşr sayını rakamları toplamını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı sayi giriniz : ");
        int sayi= scan.nextInt();

        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=sayi/100;

        System.out.println("Sayınızın rakamları topları:" + (onlar+yuzler+birler));






    }

}
