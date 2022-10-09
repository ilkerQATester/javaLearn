package My_Java.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Saniyeye çevrilmesini istediğiniz saati giriniz :");
        int saat = scan.nextInt();
        System.out.println(saat + " saat " + saniye(saat) + " saniyedir");


    }

    private static int saniye(int saat) {


        return saat*60*60;
    }
}
