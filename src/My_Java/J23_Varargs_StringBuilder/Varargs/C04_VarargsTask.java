package My_Java.J23_Varargs_StringBuilder.Varargs;

public class C04_VarargsTask {
        /*
       Task ->
       Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
        */
    public static void main(String[] args) {

        System.out.println("toplaCarp(2,24,23,38,33,21,59,26,10) = " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));
        int arrTop[] = {24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println("toplaCarp(3,arrTop) = " + toplaCarp(2, arrTop));

    }//main sonu
    public static int toplaCarp(int carpilacakSayi, int... toplanacakSayılar) {
        int toplam = 0;
        for (int a : toplanacakSayılar) {
            toplam += a;
        }
        return carpilacakSayi * toplam;
    }
}
