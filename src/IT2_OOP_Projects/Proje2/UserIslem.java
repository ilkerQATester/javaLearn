package IT2_OOP_Projects.Proje2;
import java.io.*;
import java.util.*;
public class UserIslem {
	public String uAdi;
	public String uSifre;
	public String gKodu;
	
	public void UserGiris() {
		try {
			FileInputStream okuma = new FileInputStream("veri_tabani.properties");
			Properties prop = new Properties();
			prop.load(okuma);
			uAdi =prop.getProperty("kulAdi").toString();
			uSifre =prop.getProperty("kulSifre").toString();
			gKodu =prop.getProperty("kulGkodu").toString();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		Scanner uGiris = new Scanner(System.in);

		System.out.println("Kullanci giris islem..");
		System.out.print("Kullanci Adi: ");
		String kAdi = uGiris.nextLine();
		System.out.print("Kullanci Sifre: ");
		String kSifre = uGiris.nextLine();		
		
		if((!uAdi.equals(kAdi))){
			System.out.println("Kullanci adi hatali..");
		}		
		if((!uSifre.equals(kSifre))){
			System.out.println("Kullanci Sifre hatali..");
		}		 
	}	
	public void changeSifre() {
		try {
			FileInputStream okuma = new FileInputStream("veri_tabani.properties");
			Properties prop = new Properties();
			prop.load(okuma);
			uAdi =prop.getProperty("kulAdi").toString();
			uSifre =prop.getProperty("kulSifre").toString();
			gKodu =prop.getProperty("kulGkodu").toString();
			okuma.close();
			Scanner uPC = new Scanner(System.in);
			System.out.println("Kullanci sifre degisterme islem..");
			System.out.print("Guvenilk  Kodu: ");
			String gCode = uPC.nextLine();
			if((gKodu.equals(gCode))){
				System.out.println("Yeni Sifre giriniz..");
				String ySif = uPC.nextLine();
				Properties prop1 = new Properties();
				FileOutputStream yazma = new FileOutputStream("veri_tabani.properties");
				prop1.setProperty("kulAdi",uAdi);
				prop1.setProperty("kulGkodu",gKodu);
				prop1.setProperty("kulSifre",ySif);
				prop1.store(yazma, null);
				yazma.close();
				System.out.println("Sifre degistrme islem basarli..");
			}else
			{
				System.out.println("guvenlik kodu yanlis..");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void yeniKayit() {
		System.out.println("Yeni Kullanci islem..");
	}
}
