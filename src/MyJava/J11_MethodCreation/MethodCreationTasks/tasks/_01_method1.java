package MyJava.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Random;
import java.util.Scanner;



public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */
    static Random rand = new Random();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Rastgele bir sayı seçilecek üst limit tamsayınızı giriniz");
        int max = scan.nextInt();
        System.out.println(randomNum(max));
    }

    public static int randomNum(int max) {

       return rand.nextInt(max);

    }


}
