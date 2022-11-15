package My_Java.J32_Abstract.abstract02;

public class IdariPersonel extends Personel{
    @Override//mecbur implemen edilemli
    public void maasHesapla() {//Personel parent class'dan override abs meth.
        System.out.println("Agam frapan idarecimize saatine $120 gayme verilir :)");
    }

    @Override//mecbur implemen edilemli
    public void maasBilgisi() {//Personel parent class'dan override abs meth.
        System.out.println("Agam cıncık code yaan idari personele ekistiradan bir ikramiye :)");
    }

    @Override//tercihen override edildi
    public void sigorta() {//Personel parent class'dan override conc. meth.
        super.sigorta();
    }
}
