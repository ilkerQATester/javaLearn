package MyJava.J11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {

    /*
    Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
    çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
    Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
    Peki özyinelemeyi neden kullanıyoruz?
    Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
    */

    public static void main(String[] args) {
        /*
         Faktoriyel girilen sayıdan 1e kadar olan tamsayıların çarpımına denir.
         Task-> girilen sayının faktoriyelini hesaplayan method creat ediniz
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriyel hesaplanması istenen sayınızı giriniz :");
        int sayi= sc.nextInt();
        System.out.println(faktoriyel(sayi));


    }//main sonu

    public static  int faktoriyel(int a){
        if (a>=1){
            return a*faktoriyel(a-1);        }
        else return 1;
    }
}
