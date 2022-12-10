package TeacherHalukJava.src.j11_MethodCreation.tasks;

public class Task10 {

    public static void main(String[] args) {

    /*32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */

        int num1=25;
        int num2=23;
        System.out.println(kontrol(num1, num2));
    }

    public static boolean kontrol(int num1, int num2) {
        boolean sonuc=false;
        if (num1==num2) {
            sonuc=true;
        }

        return sonuc;
    }
}
