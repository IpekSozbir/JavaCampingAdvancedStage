package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {

    public static void main(String[] args) {

        // Verilen bir metin kac kelimeden olusursa olussun
        // her kelimenin ilk harfini buyuk, kalan harflerini kucuk olarak duzenleyip
        // metnin son halini bize donduren bir method olusturun


        System.out.println(metniDuzenle("ali okula her gun yuruyerek gider"));
        // Ali Okula Her Gun Yuruyerek Gider

        // Kullanicidan ismini ve soyismini isteyin
        // girilen isim ve soyismi metniDuzenle methodu ile duzenleyip
        // isim ve soyismi bu haliyle kaydedin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        isim = metniDuzenle(isim);
        soyisim = metniDuzenle(soyisim);

        System.out.println("Duzenli hali: " + isim + " " + soyisim);

    }


    public static String metniDuzenle (String metin) {
        String[] kelimeler = metin.split(" ");
        String yeniMetin = "";
        for (int i = 0; i <kelimeler.length-1 ; i++) { //-1 cunku son kelime haric, sonuna bosluk bırakmasın diye
            yeniMetin += (kelimeler[i].substring(0,1).toUpperCase() +
                    kelimeler[i].substring(1).toLowerCase() +
                    " ");
        }

        yeniMetin += (kelimeler[kelimeler.length-1].substring(0,1).toUpperCase() +
                kelimeler[kelimeler.length-1].substring(1).toLowerCase()
                );
        return yeniMetin;
    }






}
