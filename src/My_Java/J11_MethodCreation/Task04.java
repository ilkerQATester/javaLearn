package My_Java.J11_MethodCreation;

public class Task04 {

    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı
    ATM app. code create ediniz
        */
    /*
    static Scanner scanner = new Scanner(System.in);
    static int bakiye=1000;
    */
    public static void main(String[] args) {
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        Task04_AtmMethod.secim();

    }
    /*
    private static void secim() {

        System.out.println("İşleminizi seçiniz");
        int secim=scanner.nextInt();
        switch (secim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cikisYap();
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");

        }

    }

    private static void cikisYap() {

        System.out.println("İyi günler dileriz");


    }

    private static void paraCek() {
        System.out.println("Çekilecek miktarı giriniz");
        int cekilecekMiktar=scanner.nextInt();
        if(cekilecekMiktar<=bakiye){
            bakiye-=cekilecekMiktar;
            System.out.println("Bakiyeniz" + bakiye);
        }
        else
        {
            System.out.println("Bakiyenizden fazla tutar çekemezsiniz");
        }
        karar();

    }

    private static void paraYatir() {
        System.out.println("Yatırmak istediğiniz miktarı giriniz");
        int yatanMiktar=scanner.nextInt();
        bakiye+=yatanMiktar;
        System.out.println("Bakiyeniz: " + bakiye);
        //bakiyeVer();
        karar();

    }

    private static void bakiyeVer() {
        System.out.println("Bakiye..."+bakiye);
        karar();

    }

    public static void karar(){
        System.out.println("İşleminize devam içi 1'e baınız çıkış için 0'a basınız");
        int karar= scanner.nextInt();
        if (karar==0) {
            cikisYap();
        }
        else if (karar == 1) {secim(); }
        else
        {System.out.println("Yanlış seçim yaptınız");
        karar();
        }

    }


*/
}
