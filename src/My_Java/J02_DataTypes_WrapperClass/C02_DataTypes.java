package My_Java.J02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {



     /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.

		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */
        String name="özgür";
        String yas="34";
        int age=13;
        boolean emekliMi=true;
        char ch='$';


        //TASK -> 1999 yılında doğan bir kişinin yaşını yazınız...

            int güncel=2022;
            int dogum=1999;
            int sonuc=güncel - dogum;
        System.out.println(sonuc);

        float f1=12.45f;
        float f2=12.56F;
        double boy=1.85;
        System.out.println(f1*f2);

        //TASK -> 2 farklı byte tanımlayıp toplam farkını print ediniz...
        byte s1=89;
        byte s2=98;
        int top=s1+s2;
        int fark=s1-s2;
        System.out.println(fark);
        System.out.println(top);

        //TASK -> 2 farklı tamsayı tanımlayıp toplam farkını print ediniz...

        byte b=127;
        short s=128;
        System.out.println(b+s);

        //TASK -> 2 farklı tamsayı ve ondalık tanımlayıp toplam farkını print ediniz...

        byte b1 =35;
        double m=14.53;
        System.out.println(b1+m);

        //TASK -> 2 farklı tamsayı ve char data tipinde iki variable tanımlayıp toplam farkını print ediniz...

        char c='$';
        int i=8;
        System.out.println(i+c); // $ ASCII değeri 36 olarak işleme aldı.

        //TASK -> ad soyad yas print ediniz...

        String ad="ilker";
        String soyad="Dönmez";
        byte yasi=37;
        System.out.println(ad+" "+soyad+" "+yasi);

        /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
        short shortMin =Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);
        short shortMax= Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        int intMin =Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);
        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);
        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);
        long longMax = Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);
        double doubleMin = Double.MIN_VALUE;
        System.out.println("doubleMin = " + doubleMin);
        double doubleMax = Double.MAX_VALUE;
        System.out.println("doubleMax = " + doubleMax);
        float floatMin = Float.MIN_VALUE;
        System.out.println("floatMin = " + floatMin);
        float floatMax = Float.MAX_VALUE;
        System.out.println("floatMax = " + floatMax);

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat = 9999.99F;
        double kilometre = 123.5;
        char cinsiyet = 'E';
        boolean dogruMu = true;
        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("dogruMu = " + dogruMu);



    }

}
