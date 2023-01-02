package IT2_OOP_Projects.ogrcOgrtYonetimiFinal.OgrenciVeOgretmen;

import IT2_OOP_Projects.ogrcOgrtYonetimiFinal.KisiVeOkulYönetimi.Kisi;

public class Ogrenci extends Kisi { //inheritance
    private int ogrenciNo; //access modifiers
    private String sinif;

    public Ogrenci(){

    }
    public Ogrenci(int ogrenciNo, String sinif) {// polymorphism
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    @Override
    public String toString() { //Override
        return "Ogrenci{" +super.toString()+
                " ogrenciNo= " + ogrenciNo +
                ", sinif='" + sinif + '\'' +"}";
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, int ogrenciNo, String sinif) { // polymorphism
        super(adSoyad,kimlikNo,yas);
        this.ogrenciNo=ogrenciNo;
        this.sinif=sinif;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    } //encapsulations

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


}
