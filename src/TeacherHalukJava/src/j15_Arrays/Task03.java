package TeacherHalukJava.src.j15_Arrays;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim
        int arr1[] = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += i;
        }

        System.out.println(Arrays.toString(arr1)); // [0, 1, 2, 3, 4, 5]


        int arr[] = {1, 2, 3, 4, 5, 6};


        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));


    }

}
