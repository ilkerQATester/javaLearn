package My_Java.J33_Interface;

public class Runner {

    public static void main(String[] args) {
        Sahin dgshn=new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.motor();
        System.out.println("dgshn.sisLamp() = " + dgshn.sisLamp());//default conc. meth-> obj ile call
        dgshn.sunroof();
        dgshn.yakıt();

        System.out.println("dısDonanım.RENK = " + disDonanim.RENK);
        System.out.println("icDonanım.RENK = " + icDonanim.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        //System.out.println("Lastik.RENK = " + RENK);-> aynı isimli variable interface name ile call edilir
        // icDonanım.KUMAS="deri";-> CTE final variable atama ya-pıl-mazzz.
        System.out.println("icDonanım.KUMAS = " + icDonanim.KUMAS);
        System.out.println("icDonanım.MUSIC = " + icDonanim.MUSIC);
        disDonanim.anten();//static conc meth Interface name .call

    }
}
