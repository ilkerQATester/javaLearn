package My_Java.J21_ImmutableClass;

public class C01_ImmutableClass {

    public static void main(String[] args) {

        String str1="murat";//ilk değeri murat atanan str1 variable
        String str2="murat";//str1 ve str2 aynı ilk değere sahip oldg için String havuzunda ortak ref atanır

        String  str3= new String("murat");//değerleri aynı ref farklı obj
        String  str4= new String("murat");//değerleri aynı ref farklı obj

        String  str5=str1+""; // ilk atanan değer str1+"" (variable değer farklı algılanır) olduğu için str1==str2 sorgusu False olur
        //String  str5="murat"; // ilk atanan değer "murat olsaydı" str1==str2 sorgusu True olacaktı

        System.out.println( str1 == str2);//T
        System.out.println(str1 == str3);//F
        System.out.println(str1.equals(str2));//T
        System.out.println(str3 == str4);//F
        System.out.println(str1 == str5);//F
        System.out.println(str1.equals(str5));//T
    }
}
