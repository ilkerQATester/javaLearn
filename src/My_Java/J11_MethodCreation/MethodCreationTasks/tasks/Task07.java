package My_Java.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gireceğiniz 3 rakamın en küçük olanı bulunacaktır");
        System.out.println("Lutfen 1. sayiyi tanimlayiniz");
        int a = scan.nextInt();
        System.out.println("Lutfen 2. sayiyi tanimlayiniz");
        int b = scan.nextInt();
        System.out.println("Lutfen 3. sayiyi tanimlayiniz");
        int c = scan.nextInt();
        islem(a, b, c);
    }

    public static void islem(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("En kucuk sayi: " + a);
        } else if (b < a && b < c) {
            System.out.println("En kucuk sayi: " + b);
        } else
            System.out.println("En kucuk sayi: " + c);
    }


}




