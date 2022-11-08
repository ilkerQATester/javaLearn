package My_Java.J26_Inheritance.Inheritance02;

public class Hayvancık1 {//G parent-super-dede class
    public Hayvancık1() {//p'siz cons.
        System.out.println("Hayvancık1 parametresiz constructor...");
    }
    public Hayvancık1(int i) {//p'li cons.
        System.out.println("Hayvancık1 parametreli constructor...");
    }
    public void mA() {
        System.out.println(" mA - > Hayvancık1  class method call.");
    }
    public void mM() {// polimorfizim Mammal1 deki mM() metoduna ezilir.
        System.out.println(" mM - > Hayvancık1  class method call.");}
    int a; int m = 3; }//Hayvancık1 class kapsam sonu.
