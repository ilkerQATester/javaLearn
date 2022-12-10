package TeacherHalukJava.src.j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int yeniArr[] = new int[sayi.length];

        for (int kat = 0; kat < sayi.length; kat++) {

            for (int dire = 0; dire < sayi[kat].length; dire++) {
                yeniArr[kat] += sayi[kat][dire];
            }
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
