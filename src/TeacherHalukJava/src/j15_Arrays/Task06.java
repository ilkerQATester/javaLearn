package TeacherHalukJava.src.j15_Arrays;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        arr = terstenSirala(arr);
        System.out.println(Arrays.toString(arr)); // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
        // en buyuk sayiyi yazdir
        System.out.println("En buyuk Element : " + arr[0]);//45

    }

    public static int[] terstenSirala(int[] arr) {

        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {

            tersArr[i]= arr[arr.length-1-i] ;//trick :)
        }
        return tersArr;

    }
}
