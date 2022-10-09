package My_Java.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.print("Saniye karşılığını istediğiniz saat değerini giriniz: ");
		int saat = scan.nextInt();
		System.out.print("Km karşılığını istediğiniz mil değerini giriniz: ");
		double mil = scan.nextDouble();
		System.out.print("Gram karşılığını istediğiniz Kilogram değerini giriniz: ");
		double kg = scan.nextDouble();
		System.out.println("       *******       ");
		System.out.println( saat + " saat = " + saniye(saat) + " saniye");
		System.out.println( mil + " kilometre = " + km(mil) + "km");
		System.out.println( kg + "kilogram = " + gr(kg) + "gram");
	}
	public static int saniye(int a) {
		return a * 60 * 60;
	}
	public static double km(double b) {
		return b * 1.6;
	}
	public static double gr(double c) {
		return c * 1000;
	}


}

