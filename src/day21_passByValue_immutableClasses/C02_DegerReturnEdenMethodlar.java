package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {

    public static void main(String[] args) {

        // Verilen isim ve soyismi duzenleyip
        // Ilk harfleri buyuk, geriye kalan harfler kucuk olacak sekilde
        // "Isim Soyisim" halinde bize donduren bir method olusturun


        // Kullanicidan isim ve soyisim alip
        // methodda duzenleyip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminnizi giriniz: ");
        String soyisim = scan.nextLine();

        System.out.println(isimDuzenle(isim, soyisim));
    }


    public static String isimDuzenle (String isim, String soyisim) {
        isim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).toLowerCase();

        String duzenlenmisIsim = isim + " " + soyisim;
        return duzenlenmisIsim;
    }
}
