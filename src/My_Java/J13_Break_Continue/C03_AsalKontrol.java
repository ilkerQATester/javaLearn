package My_Java.J13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bi dene tamsayı  giresen :");
        int sayi=sc.nextInt();// 23->2,3,4,5,6,7...23 24
        //     v x x          x -> false


        boolean asalMi=true;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){//eğer sayi kendisine kadar olan sayılara tam bölunuyorsa
                asalMi=false;
                break;
            }

        }
        if (asalMi && sayi!=1){
            System.out.println("girilen sayı ASAL");
        }else System.out.println("girlen sayı asal DEGİL ");

    }
}
