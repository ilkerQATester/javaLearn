package My_Java.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    kullanıcının
          Doğum gününü print eden code create ediniz */

        Scanner s = new Scanner(System.in);
        System.out.println("Doğum gününüzü giriniz");
        String line = s.nextLine();
        System.out.println("Doğum gününüz : " + line);



    }
}
