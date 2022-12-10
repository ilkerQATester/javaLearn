package TeacherHalukJava.src.j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */


    static HashMap<String,Integer> kelimeListesi = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime analizi yapılmasını istediğiniz metni giriniz : ");
        String metin = scan.nextLine();
        String[] cumleler = metin.split("\\.");

        for(int i = 0 ; i < cumleler.length ; i++) {
            String[] kelimeler = cumleler[i].trim().split(" ");

            for(int j = 0 ; j < kelimeler.length; j++) {
                if(kelimeListesi.get(kelimeler[j]) == null) { 		///// .replace(",", "").replace("\"", "")
                    kelimeListesi.put(kelimeler[j], 1);		  		///// .replace(",", "").replace("\"", "")
                }else {
                    int sayi = kelimeListesi.get(kelimeler[j]);		///  .replace(",", "").replace("\"", "")
                    kelimeListesi.put(kelimeler[j], sayi + 1);		///// .replace(",", "").replace("\"", "")
                }
            }

        }

        for(String eleman : kelimeListesi.keySet()) {
            System.out.println(eleman + " : "+ kelimeListesi.get(eleman));
        }



    }

}
