package My_Java.J23_Varargs_StringBuilder.Varargs;

public class C05_VarargsTask {
    /*
    Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
    */
    public static void main(String[] args) {

        int sayi = 5;
        String str1 = "muharrem";
        String str2 = "ugur";
        String str3 = "ebikGabık";

        carpStringEnUzun(sayi, str1, "JavaCan", str2, str3);//45

    }//main sonu

    public static void carpStringEnUzun(int carpacakSayi, String ... str) {
        String enUzun = "";
        for (String a : str) {
            if (a.length() > enUzun.length()) {
                enUzun = a;
            }
        }
        System.out.println("agam istedigin deger : " + (carpacakSayi * enUzun.length())+" "+enUzun);
    }

}
