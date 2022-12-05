package IT2_OOP_Projects.Proje2;
import java.io.*;
import java.util.*;

public class PropsClass {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
			FileInputStream okuma = new FileInputStream("veri_tabani.properties");
			Properties prop = new Properties();
			prop.load(okuma);
			String uAd =prop.getProperty("kulAdi").toString();
			String uSifre =prop.getProperty("kulSifre").toString();
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
