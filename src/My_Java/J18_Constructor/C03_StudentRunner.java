package My_Java.J18_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {
        C03_Student ogrc1 = new C03_Student();//ogrc1 obj create edildi
        ogrc1.ad = "fatih";
        ogrc1.soyad = "Ataş";
        ogrc1.sınıf = 1;
        ogrc1.okulNo = 1001;
        ogrc1.ortalama = 77;
        ogrc1.takdir = false;

        C03_Student ogrc2 = new C03_Student("ugur","AY",1,3,0,true);
        System.out.println("ogrc1 = " + ogrc1);//ogrc1 = j18_Constructor.C03_Student@2f7a2457
        //ogrc1 = C03_Student{ad='fatih', soyad='Ataş', sınıf=1, ortalama=77.0, okulNo=1001, takdir=false}
        //ogrc1 = {ad='fatih', soyad='Ataş', sınıf=1, ortalama=77.0, okulNo=1001}
        ogrc1.mezuniyet();//agam diploman hayırlı nolsun :)
        // task-> diğer bir ogrc obj ile tum field'ları atayıp print ediniz...
        //C03_Student.sosyalFaailyet();

    }
}