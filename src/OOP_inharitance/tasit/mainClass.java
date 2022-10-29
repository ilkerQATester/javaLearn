package OOP_inharitance.tasit;

public class mainClass {



    public static void main(String[] args) {

        araba arac1 = new araba();
        arac1.hiz();
        System.out.println("arac1.tekerlek = " + arac1.tekerlek);

        kamyonet kmynt1= new kamyonet();
        System.out.println("kmynt1.tekerlek = " + kmynt1.tekerlek);

        motosiklet moto1= new motosiklet();
        System.out.println("moto1.tekerlek = " + moto1.tekerlek);


    }
}
