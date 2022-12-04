package OOP_inharitance.Proje2;
import java.io.*;

public class dosyalar {

public static void main(String[] args) throws IOException {
	BufferedWriter yazma;
	try {
			yazma = new BufferedWriter(new FileWriter("yeniDosya.txt"));

			yazma.write("bu bizim ilk dosyamız\n");
			yazma.write("deneme");
			yazma.close();
	} catch (IOException e) {
		e.printStackTrace();
	}

	BufferedReader okuma;
	try {
			okuma = new BufferedReader(new FileReader("yeniDosya.txt"));
			String satir;
			while((satir=okuma.readLine()) != null)
			{
				System.out.println(satir);
			}
	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}