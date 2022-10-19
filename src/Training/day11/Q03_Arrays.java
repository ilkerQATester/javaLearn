package Training.day11;

import java.util.Scanner;

public class Q03_Arrays {
    //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        System.out.println(arr.length);
    }
}
