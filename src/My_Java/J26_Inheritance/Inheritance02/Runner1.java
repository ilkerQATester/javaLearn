package My_Java.J26_Inheritance.Inheritance02;

public class Runner1 { // Runner1 classı

    public static void main(String[] args) {
        Kedi1 k1 = new Kedi1();//k1 objesi Kedi1 classından üretilmiştir.
        System.out.println("k1.a = " + k1.a);//k1 objesi ile instance variable call edildi.
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

        k1.mA();//k1 objesi ile mA metodu call edildi.
        k1.mC();
        k1.mM();

        Mammal1 k2 = new Kedi1("a");//k2 objesi Kedi1 classından üretilmiştir.
        k2.mA();//k2 objesi ile mA metodu call edildi.
        k2.mC();
        k2.mM();

        Mammal1 k3 = new Kedi1();// değişik classlardan farklı objeler creat edildi.
        Hayvancık1 k4 = new Kedi1();
        Mammal1 m1=new Mammal1();
    }
}

