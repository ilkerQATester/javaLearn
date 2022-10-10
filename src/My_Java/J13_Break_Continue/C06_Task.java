package My_Java.J13_Break_Continue;

import java.util.Scanner;

public class C06_Task {

    public static void main(String[] args) {

        // task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bişeyler cızıkdırasan  :");

        String biseyler = sc.nextLine();// egik Gabık @ cimey ıl. k om
        int aSayisi = 0;
        for (int i = 0; i < biseyler.length(); i++) {
            if (biseyler.charAt(i)=='a'){
                aSayisi++;
            }else if (biseyler.charAt(i)=='c'){
                break;
            }
            System.out.println("döngüde işleme giren karakterler :"+biseyler.charAt(i));
        }
        System.out.println("agam cızıktırdıgın bişeylerde a sayısı : "+aSayisi+" tane");

    }
}
