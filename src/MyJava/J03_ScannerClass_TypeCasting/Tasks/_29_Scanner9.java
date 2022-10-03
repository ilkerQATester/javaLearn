package MyJava.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

public class _29_Scanner9 {

    public static void main(String[] args) {

    /*   kullanıcının boyunu
          Float print eden code create ediniz   */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu m cinsinden yazınız : ");
        String boy=scanner.nextLine();
        float m=Float.valueOf(boy);
        System.out.println( "Boyunuzu : " + m +" m");




    }


}
