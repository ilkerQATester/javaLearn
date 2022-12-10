package Training.day12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dnm {

    public static void main(String[] args) {
        //Verilen 2 katli bir array'de bulunan tum sayilarin carpinini bize donduren bir method olusturun.

        int arr [][]={{1,2,3},{4,5,6}};
        int carpım=1;
        for (int[] parca:arr) {
            for (int hane:parca) {
                carpım*=hane;
            }
        }
        System.out.println("CArpım "+carpım);
        System.out.println("CArpım "+ Arrays.toString(arr));
    }
}
