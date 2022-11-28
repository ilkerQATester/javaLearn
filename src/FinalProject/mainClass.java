package FinalProject;
import java.util.*;

public class mainClass {
	
	public static String kulAdi = "Ali";
	public static String kulSifre = "123";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner obje = new Scanner(System.in);
		Scanner deneme = new Scanner(System.in);			
		String dvm = "E";
		int aa;			
		do {
			System.out.println("Eski kullanci [1] / Yeni kullanci [2] " );
			aa = obje.nextInt();	
			
			if (aa == 1 ) {
				System.out.println("Kullanci giris islem...");
				KulGiris();
			} else if (aa == 2 ){
				System.out.println("Kullanci yeni kayit islem...");
				kulKayit();
			} else{
				System.out.println("hatali giris...");
			}			
			System.out.println("Devam etmek istiyormusun? [E / H]");		
			dvm = deneme.nextLine();			
		} while ("E".equals(dvm));
		System.out.println("Cikis yapilmistir...");								
	}
	
	public static void KulGiris() {
		Scanner kulObje = new Scanner(System.in);
		System.out.print("Kullanci Adi: ");
		String gKulAdi = kulObje.nextLine();
		
		System.out.print("Kullanci Sifre: ");
		String gKulSifre = kulObje.nextLine();
		
		if (!gKulAdi.equals(kulAdi)) 
		{
			System.out.println("Kullanci Adi yanlis");
		}
		if (!gKulSifre.equals(kulSifre)) 
		{
			System.out.println("Kullanci Sifre yanlis");		
		}				
	}
	
	public static void kulKayit() {
		Scanner kyt = new Scanner(System.in);
		System.out.print("Yeni kullanci adi giriniz..: ");
		String yKul = kyt.nextLine();
		
		System.out.print("Yeni kullanci sifre giriniz..: ");
		String ySifre = kyt.nextLine();
		
		kulAdi = yKul;
		kulSifre = ySifre;
	}
}
