package My_Java.J11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hacker diline çevrilmesini istediğiniz metninizi giriniz: ");
        String metin = scan.nextLine().toLowerCase();
        System.out.println("Hacker dili karsiligi: " + hackerDili(metin));
    }

    public static String hackerDili(String a) {
        String b = a.replaceAll("s", "5");
        String c = b.replaceAll("a", "4");
        String d = c.replaceAll("e", "3");
        String e = d.replaceAll("i", "1");
        return e.replaceAll("o", "0");
    }
}




