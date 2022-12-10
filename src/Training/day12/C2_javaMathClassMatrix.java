package Training.day12;

import java.util.Random;
import java.util.Scanner;

public class C2_javaMathClassMatrix {
/*
Ask user to enter a number and print on console number by number matrix.

Example:
Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Matrist boyutu giriniz");
        int sayi =sc.nextInt();

        for (int i=0;i<sayi;i++){//outer for - satır
            for (int j=0;j<sayi;j++){//inner for -sutun
               // System.out.println((int)Math.random()*2+" ");// alternatif math metodu ile int cast yaptık
                System.out.print(new Random().nextInt(2)+" ");//randon classı ile
            }
            System.out.println();
        }



    }

}
