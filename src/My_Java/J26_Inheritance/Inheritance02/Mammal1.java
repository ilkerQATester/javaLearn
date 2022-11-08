package My_Java.J26_Inheritance.Inheritance02;

public class Mammal1 extends Hayvancık1 {//parent classı Hayvancık1dir.Hayvancık1in özelliklerni inheritance olarak alır
    // child classı Kedi1 dir.
    public Mammal1() {//parametresiz constructor
        this('Y');
        System.out.println("Mammal parametresiz constructor...");
    }
    public Mammal1(char c) {//parametreli constructor
        super(17);
        System.out.println("Mammal parametreli constructor...");
    }
    public void mC(){//ezilen method
        System.out.println(" mC - > Mammal  class method call edildi.");
    }// polimorfizim Kedi1 deki mC() metoduna ezilir.
    int m=1;
    int c=4;

    @Override // polimorfizim Hayvancık1 deki mM() metodunu ezer.
    public void mM() {//parentten  ezen method
        System.out.println(" mM - > Mammal  class method call edildi.");
    }
}// Class sonu
