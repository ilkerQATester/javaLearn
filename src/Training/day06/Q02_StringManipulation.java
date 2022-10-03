package Training.day06;

import java.util.Scanner;

public class Q02_StringManipulation {

    public static void main(String[] args) {

         /*

     Kullanicidan bir kelime girmesini isteyin.
    * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
    * kelimenin ortasindaki karakteri yazdirin.
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelimenizi giriniz");
        String word= scanner.nextLine();  //char ortanca=word.charAt((word.length()-1)/2)
        if (word.length()%2!=0 && word.length()>=3) {

            System.out.println(word.charAt((word.length()-1)/2));

        }
        else {
            System.out.println("Kelimenizde orta harf bulunmamaktadır");
        }

    }
}
