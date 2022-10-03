package Training.day06;

import java.util.Scanner;

public class Q05_StringManipulation {

    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

    Scanner input=new Scanner(System.in);
        System.out.print("Please enter a four letter word :");
    String word=input.nextLine();

        if(word.length()==4){
        System.out.print(word.substring(3));
        System.out.print(word.substring(2,3));
        System.out.print(word.substring(1,2));
        System.out.print(word.substring(0,1));
    }else System.out.println("You have entered incorrectly. Please enter a four letters word.");

/*
        Scanner scan = new Scanner(System.in);
		System.out.println(" 4 harfli String giriniz : ");
		String str = scan.next();
		System.out.println(""+ str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0));

 */

    }
}
