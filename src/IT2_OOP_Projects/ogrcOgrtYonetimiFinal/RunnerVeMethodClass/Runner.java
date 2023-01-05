package IT2_OOP_Projects.ogrcOgrtYonetimiFinal.RunnerVeMethodClass;

import java.io.*;
import java.util.Scanner;

public class Runner extends MethodClass { //inheritance
    public static void main(String[] args) {
        String aciklamaDosya = "C:\\Users\\İLKER\\IdeaProjects\\javaLearn\\src\\IT2_OOP_Projects\\ogrcOgrtYonetimiFinal\\Aciklama.txt";
        try {
            FileInputStream fileinStrm=new FileInputStream(aciklamaDosya);
            int k =0;
            while((k=fileinStrm.read())!=-1){
                System.out.print((char)k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Runner obj = new Runner();

    }
    //secimler de next al nextline degil


    public  Runner() {
        System.out.println("\n    ====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();

        //boolean flag = true;
        if (secim.equals("1")) {
            kisi = "OGRENCI";
            altMenu();
        } else if (secim.equals("2")) {
            kisi = "OGRETMEN";
            altMenu();
        } else if (secim.equalsIgnoreCase("Q")) {
            cikis();
        } else {
            System.out.println("Hatali giris yaptiniz");
            Runner obj = new Runner();
        }
    }

    public  void altMenu() {
        System.out.println("====================" +
                "============= " + kisi + "=============\n" +
                "\t 1-EKLEME\n" +
                "\t 2-ARAMA\n" +
                "\t 3-LİSTELEME\n" +
                "\t 4-SİLME\n" +
                "\t 5-ANA MENÜ\n");
        //scan.nextLine();//dummy
        String secim2 = scan.next().toUpperCase();//nextline alirsan dongudekli dummy ler calisir extrdadan
        switch (secim2) {
            case "1":
                ekleme();
                altMenu();
                break;
            case "2":
                arama();
                altMenu();
                break;
            case "3":
                listeleme();
                altMenu();
                break;
            case "4":
                silme();
                altMenu();
                break;
            case "5":
                Runner obj = new Runner();
                break;
            default:
                System.out.println("geçerli giriş yapılmadı tekrar deneyin");
                altMenu();
        }


    }


    public void cikis() {
        Scanner scan= new Scanner(System.in);
        BufferedWriter yazma;
        try {
            yazma = new BufferedWriter(new FileWriter("C:\\Users\\İLKER\\IdeaProjects\\javaLearn\\src\\IT2_OOP_Projects\\ogrcOgrtYonetimiFinal\\gorusDosyası.txt"));
            System.out.println("****** "+" Görüşleriniz Bizim için Değerli" + "*********");

            System.out.println("Lütfen projeyle ilgili görüşlerinizi kısaca yazınız");
            String gorus = scan.nextLine();
            yazma.write(gorus);
            yazma.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader okuma;
        try {
            okuma = new BufferedReader(new FileReader("C:\\Users\\İLKER\\IdeaProjects\\javaLearn\\src\\IT2_OOP_Projects\\ogrcOgrtYonetimiFinal\\gorusDosyası.txt"));
            String satir;
            while((satir=okuma.readLine()) != null)
            {
                System.out.println(satir + "\n görüşünüz başarıyla eklendi");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hoscakalin yine bekleriz");
    }
}
