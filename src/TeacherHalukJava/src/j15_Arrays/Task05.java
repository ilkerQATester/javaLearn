package TeacherHalukJava.src.j15_Arrays;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        int sayi = 12345;

        String strsayi = String.valueOf(12345);

        String tersi = "";

        String[] dizisayi = strsayi.split("");

        for (int i = dizisayi.length - 1; i >= 0; i--) {
            tersi += "" + dizisayi[i];
        }
        System.out.println(tersi);
    }

}
