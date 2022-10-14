package My_Java.J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {

    public static void main(String[] args) {

        //contains(); -> list'te istenen elemanın varlığını kontrol eder, true/false return eder

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir.contains(\"Ankara\") = " + listSehir.contains("Ankara"));//false
        System.out.println("listSehir.contains(\"Munih\") = " + listSehir.contains("Munih"));//true

    }
}
