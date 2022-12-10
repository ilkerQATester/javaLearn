package TeacherHalukJava.src.j100_javaProjects.P01_okulYönetimi.ogrcOgrtYonetimi03;

public class Teacher extends Personal {

    private String bolum;
    private String sicilNo;

    public Teacher() {

    }

    public Teacher(String adSoyad, long kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        setSicilNo(sicilNo);
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return  "| Ogretmenin; "+ super.toString() +
                "| bolum= " + bolum +
                "| sicilNo= " + sicilNo +
                "| " ;
    }

}


































