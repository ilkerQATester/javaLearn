package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="ilker";
        String soyad="Dönmez";

        int a=7;
        int b=11;
        // birden çok string variable ile farklı data type variablelar ( + ) ile
        // işleme alınırsa java birleştirme yaparak yeni bir string oluşturur.

        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.

        System.out.println(ad+soyad+a+b);//

        System.out.println(a+ad+soyad+b);//

        System.out.println(a+b+ad+soyad);//

        System.out.println(" "+a+b);//

        System.out.println(ad+soyad+(a+b));//

        System.out.println((a+b)+ad+soyad);//

        System.out.println(ad+(a-b)+(a-b));//

        System.out.println(ad+((a-b)+(a-b)));//

        char ch='1';//
        System.out.println(ad+ch);//ilker1

        System.out.println(a+ch);//56

        System.out.println(ad+(ch+b));//ilker60

        System.out.println(a+ad+ch);//7ilker1

        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işlem yapar ->

        */


    }
}
