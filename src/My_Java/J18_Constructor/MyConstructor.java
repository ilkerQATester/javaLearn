package My_Java.J18_Constructor;

public class MyConstructor {

    int x = 3;
    int y = 5;

    public MyConstructor() {
        x += 1;// instance variable +1 update edildi.
        System.out.println("-x" + x);
    }

    public MyConstructor(int i) {
        this();//parametresiz constructor call edildi.
        this.y = i;//constructor parametresi i değeri instance değeri y ye atandı
        x += y; // ins y değeri yine ins. x değerine atandı.
        System.out.println("-x" + x);

    }

    public MyConstructor(int i, int i2) {
        this(3); // int p'li cons call edilip parametre 3 atanarak call edildi
        this.x -= 4;//instance x variable -4 olarak update edildi
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4, 3);// 2 int parametre 4 ve 3 atanarak constructor call edildi
    }
}