package My_Java.J18_Constructor;

public class C03_Student {

    //main olmayan sadece student obj cretae etmek için pojo class-> plan old java object : obj için standart class kalıphane
    //fields->
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){//method
        if (ortalama >=50) {
            System.out.println(" diploman hayırlı olsun :)");
        }else System.out.println("seneye de bekleriz :(");
    }
    public static void sosyalFaailyet(){

        System.out.println(" fiziksel zindelik= zihisel zindelik . koş babam koş");
    }

    public C03_Student() {
    }

    public C03_Student(String ad, String soyad, int sınıf, double ortalama, int okulNo, boolean takdir) {
        this.ad = ad;
        this.soyad = soyad;
        this.sınıf = sınıf;
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        this.takdir = takdir;
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
/*
    @Override
    public String toString() {//obj referans değeri print etmemesi için obj datalarını  stringe ceviren method
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                '}';
    }

*/




























}