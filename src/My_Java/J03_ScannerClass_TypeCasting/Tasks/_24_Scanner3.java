package My_Java.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner meyve = new Scanner(System.in);
        System.out.print("Enter your favoured fruit: ");
        String fruit = meyve.nextLine();
        System.out.println("Your favoured fruit is: " + fruit);


    }
}
