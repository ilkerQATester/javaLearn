package İnterviewQuestions_Java.LambdaCodeChallenge;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
        //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
        IntStream.iterate(21,t->t+7).limit(10).forEach(Methods::yazInteger);

    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)


    //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)


    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim**rangeClosed(a,b)


    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim**avarage()


    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?**rangeClosed(a,b) filter() count()-(countun type:long)


    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim


    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim


    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim


    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim





    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim


}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz