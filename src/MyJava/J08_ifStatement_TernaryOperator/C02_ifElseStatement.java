package MyJava.J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {

    public static void main(String[] args) {

        /*
    TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınız giriniz :");
        byte yas= scan.nextByte();
        if (yas>=18) {
            System.out.println("Yasınız 18 veya 18'den büyük ehliyet alabilir siniz");
            }
        else {
            System.out.println("Yasınız 18'den küçük ehliyet alamazsınız");
        }




    }


}
