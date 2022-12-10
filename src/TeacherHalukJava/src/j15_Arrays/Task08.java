package TeacherHalukJava.src.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        int[] dizi = new int[7];
        Scanner oku = new Scanner(System.in);
        int tekMiktari = 0;

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı girini = ");
            dizi[i] = oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi)); // [1, 2, 3, 4, 5, 6, 7]

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) // tek ise
                tekMiktari++;
        }

        System.out.println("tekMiktari = " + tekMiktari);
    }
}
