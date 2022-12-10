package TeacherHalukJava.src.j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
         /*
    Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
    edip mainde kontrol ediniz.

    Trick->
    sicaklikKontrol(int sıcaklık){
     throw new IOException("Hava Gerçekten soğuk dışarı çıkma");

    }

    main(){
    Scanner ...
    try{
     sicaklikKontrol(int sıcaklık);
    }
    catch (IOException e) {
    }

    }
     */


        Scanner sc = new Scanner(System.in);
        System.out.print("Hava sıcaklığı = ");
        int sicaklik = sc.nextInt();

        try {
            SicaklikKontrol(sicaklik);
        } catch (IOException ex) {
            System.out.println("ex = " + ex);
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }//main sonu...


    public static void SicaklikKontrol(int sicaklik) throws IOException {


        if (sicaklik < 10) {
            throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
        }
        System.out.println("Dışarıda basketbol oynayabilirsin");
    }


}
