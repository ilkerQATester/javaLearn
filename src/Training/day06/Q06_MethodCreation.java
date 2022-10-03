package Training.day06;

import java.util.Scanner;

public class Q06_MethodCreation {

    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String str = scan.nextLine().toLowerCase();
        System.out.println(xyzVarMi(str));
        xyzVarMiVoid(str);
    }
    private static void xyzVarMiVoid(String str) {
        System.out.println(str.contains("xyz") ? "true xyz var": "false yok");
    }
    private static boolean xyzVarMi(String str) {
        if(str.contains("xyz")) {
            return true;
        }else
            return false;
    }

}

