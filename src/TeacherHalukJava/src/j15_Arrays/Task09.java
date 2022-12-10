package TeacherHalukJava.src.j15_Arrays;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // 5 tane ama , oda numarası 0,1,2,3,4

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Agam Sayı giresen : ");
            arr[i] = sc.nextInt();
        }

        // tersten demek indexleri sondan başa doğru ilerletmek demek
        // 4,3,2,1,0
        for (int i = arr.length - 1; i >= 0; i--)  // 4 yerine dizi.length-1 yazılabilir.
        {
            System.out.println("Sayi = " + arr[i]);
        }
    }
}
