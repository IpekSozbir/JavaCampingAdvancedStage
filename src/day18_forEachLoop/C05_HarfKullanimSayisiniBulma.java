package day18_forEachLoop;

import java.util.Scanner;

public class C05_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “Harf cumlede kullanilmamis” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir harf giriniz: ");
        String harf = scan.nextLine().substring(0,1);

        String [] karakterlerArr = cumle.split("");
        int sayac = 0;


        for ( String each : karakterlerArr) {
            if (each.equals(harf)) {
                sayac++;
            }
        }
        if (sayac==0)
            System.out.println("Harf cumlede kullanilmamis");
        else
        System.out.println("Aranan harf cumlede " + sayac + " kere kullanilmis");
    }
}
