package OOP_inharitance.sekil;

public class mainClass {

    public static void main(String[] args) {

        ucgen ucgn= new ucgen();
        kare kre= new kare();
        besgen bes= new besgen();

        System.out.println("ucgn.renk = " + ucgn.renk);
        ucgn.sekilMethod();
        kre.sekilMethod();
        bes.sekilMethod();
        ucgn.ucgnboyut(5,5);
        kre.kreboyut(7,7);
        System.out.println("bu bir ana classdır");
    }
}
