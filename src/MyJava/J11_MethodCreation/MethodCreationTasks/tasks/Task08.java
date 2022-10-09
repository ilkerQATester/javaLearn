package MyJava.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Artık yıl olup olmadığını tespit edeceğimiz bir yil giriniz: ");
        int yil =scan.nextInt();
        artikYil(yil);
    }
    public static void artikYil(int yil){
        if (yil%4==0) {
            if (yil%100!=0){
                System.out.println("Girilen yil artık yıldır");
            }
            else if (yil%400==0) {
                System.out.println("Girilen yil artık yıldır");
            }
            else System.out.println("Girilen yil artık yıl değildir");

        }

        else
            System.out.println("Girilen yil, artik yil degildir");



        boolean artik = false;

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;

            }
            else
                artik = true;
        }

        if(artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");


    }
}

