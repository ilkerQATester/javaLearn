package IT2_OOP_Projects.ogrcOgrtYonetimiFinal.OgrenciVeOgretmen;

import IT2_OOP_Projects.ogrcOgrtYonetimiFinal.KisiVeOkulYönetimi.Kisi;

public class Ogretmen extends Kisi { //inheritance
    private String brans; //access modifiers
    private String sicilNo;

    public Ogretmen(){
    }
    public Ogretmen(String brans, String sicilNo) { // polymorphism
        this.brans = brans;
        this.sicilNo = sicilNo;

    }

    @Override
    public String toString() { //Override
        return "Ogretmen{" +super.toString()+
                "brans='" + brans + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " ;
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String brans, String sicilNo) { // polymorphism
        super(adSoyad, kimlikNo, yas);
        this.brans = brans;
        this.sicilNo=sicilNo;


    }

    public String getBrans() {
        return brans;
    } //encapsulations

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }


}
