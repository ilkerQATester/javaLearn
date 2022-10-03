package MyJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*
        Task01
        girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayınızı giriniz :");
        int sayi= scan.nextInt();
        if (sayi>0) {
            System.out.println("Sayınız pozitif");
        }
        else if (sayi==0) {
            System.out.println("Sayınız : 0");
        }

        else {
            System.out.println("Sayınız negatif");
        }



    }

}
