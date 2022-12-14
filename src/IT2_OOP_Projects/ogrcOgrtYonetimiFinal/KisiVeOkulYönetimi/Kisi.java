package IT2_OOP_Projects.ogrcOgrtYonetimiFinal.KisiVeOkulY√∂netimi;

public abstract class Kisi implements OkulYonetimi { // abstraction and implementation

    private  String adSoyad; //access modifiers
    private String kimlikNo;
    private int yas;
    public Kisi(){

    }
    public Kisi(String adSoyad, String kimlikNo, int yas) { // constructer
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    } //encapsulations

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() { //Override
        return "" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas= " + yas ;
    }

    @Override
    public void ekleme() { //Override

    }

    @Override
    public void altMenu() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void cikis() {

    }

    @Override
    public void silme() {

    }
}
