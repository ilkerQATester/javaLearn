package My_Java.J11_MethodCreation;

public class notOrtalama {//class
    static String ogrenci;//field variables
    private int vize;//field variables
    private int finl;//field variables
    private static double ortalama;//field variables


    public static void main(String[] args) {//main method

        System.out.println(ogrenci + "isimli öğrencinin not ortalaması:" +
                ntOrtalama(80,90)) /* method call*/;    }

    public static double ntOrtalama(int vize,int finl) {//method
            ortalama=(vize*0.3)+(finl*0.7);
            return ortalama;
    }
}
