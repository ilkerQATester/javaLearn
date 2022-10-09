package MyJava.J12_Lopps.L01_ForLoop.Task;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

         /*
       Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
       sayi!= 1*2*3* ...*sayi
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi = sc.nextInt();

        System.out.println(faktoriyel(sayi));//int parametreli method call
    }//main dışı

    private static int faktoriyel(int sayi) {
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;

        }
        // System.out.println("faktoriyel : "+faktoriyel);
        return faktoriyel;

    }
}
