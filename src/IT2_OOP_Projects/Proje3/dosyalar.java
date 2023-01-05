package IT2_OOP_Projects.Proje3;

import java.io.*;
import java.util.Scanner;

public class dosyalar {
	static Scanner scan= new Scanner(System.in);
public static void main(String[] args) throws IOException {
	BufferedWriter yazma;
	try {
			yazma = new BufferedWriter(new FileWriter("C:\\Users\\İLKER\\IdeaProjects\\javaLearn\\src\\IT2_OOP_Projects\\Proje3\\deneDosya.txt"));
		System.out.println("****** "+" ekleme sayfasina hosgeldiniz" + "*********");

		System.out.println("projeyle ilgili görüşlerinizi kısaca yazınız");
		String adSoyad = scan.nextLine();
			yazma.write(adSoyad);
			yazma.close();
	} catch (IOException e) {
		e.printStackTrace();
	}

	BufferedReader okuma;
	try {
			okuma = new BufferedReader(new FileReader("C:\\Users\\İLKER\\IdeaProjects\\javaLearn\\src\\IT2_OOP_Projects\\Proje3\\deneDosya.txt"));
			String satir;
			while((satir=okuma.readLine()) != null)
			{
				System.out.println(satir + "\n görüşünüz başarıyla eklendi");
			}
	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}