package TeacherHalukJava.src.j13_Break_Continue;

import java.util.Scanner;

public class C05_Task02 {
    public static void main(String[] args) {
        // Task-> girilen 7 tamsyının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        int toplam = 0;
        for (int i = 1; i <= 7; i++) {

            System.out.print(i+".  sayıyi giriniz = ");
            int sayi = sc.nextInt();

            if (sayi > 10 && sayi < 20) {
                System.out.println("Girdiğiniz sayı 10 ile 20 arasında olduğundan toplanmayacak");
                continue;
            }
            toplam += sayi;  // toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
