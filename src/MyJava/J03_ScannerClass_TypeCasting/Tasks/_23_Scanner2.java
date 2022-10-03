package MyJava.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*   kullanıcının yasını print eden code create ediniz  */

        Scanner yas = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = yas.nextInt();
        System.out.println( "Your age  is  " + age );



    }
}
