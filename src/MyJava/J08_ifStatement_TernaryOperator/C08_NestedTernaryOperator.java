package MyJava.J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("agam urun miktarı gir bakam : ");
        int urunMiktari = sc.nextInt();

        System.out.println("agam urun fiyatı gir bakam : ");
        int urunFiyati = sc.nextInt();

        double fatura=  urunMiktari>100 ? (urunMiktari*urunFiyati*0.67):urunMiktari*urunFiyati;
        System.out.println("fatura = " + fatura);




    }

}
