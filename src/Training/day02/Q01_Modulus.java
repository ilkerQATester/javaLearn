package Training.day02;

public class Q01_Modulus {

    public static void main(String[] args) {

        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
        // Hint: use / and %
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int sayi=12345;
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000);
        System.out.println(onbinler + "\n" + binler + "\n" +yuzler + "\n" + onlar + "\n" + birler );

    }
}
