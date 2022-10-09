package My_Java.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

import static java.lang.System.in;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create ediniz */

    Scanner giris = new Scanner(in);
    System.out.println("Adınızı giriniz :");
    String ad=giris.next();
    System.out.println(ad);


    }
}
