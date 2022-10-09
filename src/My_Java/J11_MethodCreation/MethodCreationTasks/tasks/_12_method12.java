package My_Java.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class _12_method12 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("3'un kuvveti olup olmadığını öğrenmek istediğiniz bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println(ucKuvveti(sayi));
    }

    public static boolean ucKuvveti(int a) {
        boolean ucUssu = false;

        if (a % 3 == 0 && a>=3 ) {
            ucUssu = true;
            return ucUssu;
        }

        return ucUssu;
    }



}
