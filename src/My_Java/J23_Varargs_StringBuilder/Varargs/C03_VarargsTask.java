package My_Java.J23_Varargs_StringBuilder.Varargs;

public class C03_VarargsTask {
    /*
    Task ->
    verilen Stringleri birlestiren concat isimli METHOD create ediniz.
    input : "m", "e", "r", "v", "e";
    output : merve
    input : "a", "l", "i";
    output : ali
     */
    public static void main(String[] args) {

        String  arr1[]={"m", "e", "r", "v", "e"};
        String  arr2[]={"a", "l", "i"};
        strBirlestir("m", "e", "r", "v", "e");
        strBirlestir(arr1);// merve
        strBirlestir(arr2);// ali
        strBirlestir("javaCAN"," Enise"," hanım");// javaCAN Enise hanım
    }//main sonu
    public static  void strBirlestir(String...str){
        String birlesenStr="";
        for (String w:str){
            birlesenStr= birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);

    }
}
