package My_Java.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        Scanner kapi= new Scanner(System.in);
        System.out.println("arabanızdaki kapı sayısını giriniz:");
        int count=kapi.nextInt();
        System.out.println("arabanızdaki kapı sayısı : " + (count));



    }
}


