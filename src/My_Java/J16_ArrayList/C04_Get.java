package My_Java.J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {

        //get();-> listte istenen elemanı return eder "get"irir--array de ki arr[3] 3.idexdeki elemanı ver
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));

        System.out.println("listSehir.get(1) = " + listSehir.get(1));//losAngeles
        //System.out.println("listSehir.get(1) = " + listSehir.get(11));//losAngeles olmayan index elemanı RTE verir

    }
}
