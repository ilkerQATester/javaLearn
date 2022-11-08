package My_Java.J26_Inheritance.Inheritance02;

public class Kedi1 extends Mammal1 {// parent classı Mammaldır : Mammal1 ve Hayvancık1 classlarının özelliklerini alır.
    /*
    Child class obj olmadan parent class variable ve method'lara ulaşabilir
     */
    public Kedi1() {//parametresiz constructor.
        super();
        System.out.println("kedi1 parametresiz constructor...");
    }
    public Kedi1(String  str) {//parametreli constructor.
        this();
        System.out.println(super.c);
        System.out.println("kedi1 parametreli constructor..."); }

    int c=2;
    int d=5;
    @Override  // polimorfizim Mammal1 deki mC() metodunu ezer.
    public void mC() {//Mammal parent Den ezen method
        System.out.println(" mC - > Kedi  class meth call.");
    }
}// Class sonu
