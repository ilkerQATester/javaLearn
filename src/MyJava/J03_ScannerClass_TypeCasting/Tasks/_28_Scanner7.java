package MyJava.J03_ScannerClass_TypeCasting.Tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner scanner = new Scanner(System.in);
        boolean bankaHesabı;
        System.out.print("Banka hesabınız var mı : evet ise \"E\" / hayır ise \"H\" giriniz     ");
        String cevap = scanner.next();
        bankaHesabı = cevap.equals("E");
        System.out.println(bankaHesabı);


    }
}
