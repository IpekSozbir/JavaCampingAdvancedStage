package day31_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_SayiToplama {

    // Kullanicidan toplamak uzere tam sayilar isteyin
    // vve kullanici Q'ya veya q'ya basincaya kadar islemi devam ettirin
    // Kullanici q'ya bastiginda kac adet sayi girildigini ve toplamin ne oldugunu yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;
        int girilenSayi = 0;
        String girilenMetin = "";

        do{
            System.out.println("Lutfen toplanmak uzere tam sayi girin, \nbitirmek icin Q'ya basin");


            try {
                girilenSayi = scan.nextInt();
                toplam += girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {
                girilenMetin = scan.next();
                if (girilenMetin.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("giris hatali... tamsayi veya Q olmali");
                }
            }

        } while (! girilenMetin.equalsIgnoreCase("q"));
        System.out.println("girilen " + sayac + " adet sayinin toplami: " + toplam);
    }






}
