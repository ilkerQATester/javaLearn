package IT2_OOP_Projects.Proje3;

import java.io.*;
import java.util.*;

public class PropsClass {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
			FileInputStream okuma = new FileInputStream("veri_tabani.properties"); //dosya okuma için obje oluşturuluyor.
			Properties prop = new Properties();//veri karşılaştırma yapmamızı sağlayan obje oluşturuluyor.
			prop.load(okuma);//okuma objesindeki verileri java datası olarak prop a yüklüyor.
			String uAd =prop.getProperty("kulAdi").toString();  //dosyadaki kulAdi karşısındaki "ali" yi uAd olarak atıyor.
			String uSifre =prop.getProperty("kulSifre").toString();//dosyadaki kulsifre karşısındaki "123" yi usifre olarak atıyor.
			System.out.println("Kullanıcı Adı: ");
			String kAd = s.next();
			System.out.println("Kullanıcı Şifre: ");
			String kSifre = s.next();
			if(kAd == uAd || kSifre == uSifre) {
				System.out.println("K adi doğru");
			}else {
				System.out.println("girilen: "+kAd+" veri tabanındaki: "+uAd + " Girilen Şifre: "+kSifre+" veri tabanındaki: "+uSifre);
			}
		
		}
		catch (Exception e){
			System.out.println("Hata: "+e);
		}
	}

}
