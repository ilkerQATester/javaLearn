package Training.day08;

import java.util.Scanner;

public class Q08_ForLoop {

    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum sayıların toplamını print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam = 0;
        if(sayi1<sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;
            }
            System.out.println(sayi1 +  " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
        }else if(sayi1>sayi2){
            for (int i = sayi2; i <=sayi1; i++) {
                toplam+=i;
            }
            System.out.println(sayi1 +  " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
        }else{
            System.out.println("sayilar esittir" );
        }
    }



}


