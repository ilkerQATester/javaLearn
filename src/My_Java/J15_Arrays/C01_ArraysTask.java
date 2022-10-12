package My_Java.J15_Arrays;

public class C01_ArraysTask {

    public static void main(String[] args) {

        String  isimArr[] ={"muharrem","enise","cebrail","nazım","özge"};

        int sayıArr[]=new int[5];
        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;
        sayıArr[0]=34;


        // task-> sayıArr elemanlarından değeri tek olanları print eden code create ediniz

        for (int i = 0; i < sayıArr.length; i++) {
            if (sayıArr[i] % 2 == 1) {
                System.out.println(sayıArr[i] + " ");
            }
        }
        // task-> sayıArr cift index  elemanları  print eden code create ediniz.
        for (int i = 0; i < sayıArr.length; i+=2) {
            System.out.print(sayıArr[i] + " ");//34 34
        }
        // task-> isimArr 5 harfli elemanlarında oluşan arrayın  elemanlarını  print eden code create ediniz.
        String yeniArr[]= new String[isimArr.length];//isimArr elemanı kadar boş yeni arr
        int koltukSayısı=0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()==5){
                koltukSayısı++;//yeniArr[i]=isimArr[i];
            }
        }
        System.out.println(koltukSayısı);//2
        //  System.out.println(Arrays.toString(yeniArr));//
    }
}
