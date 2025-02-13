package day18_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        System.out.println(fibonacciListesiOlustur(100)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
        System.out.println(fibonacciListesiOlustur(1000)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987]

        // Kullanicidan pozitif bir tam sayi alip
        // o tam sayidan kucuk Fibonacci sayilarini bir liste olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Fibonacci sayilarini yazdirmak icin ust sayi sinirini giriniz: ");
        int maxSayi = scan.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();

        // negatif deger girilirse ==> hata
        // 0 girilirse ==> 0
        // 1 girilirse ==> 0 1 1
        // 1'den buyuk bir deger girilirse ==> 0 1 1 .............. maxSayi

        if (maxSayi<0) {
            System.out.println("Girilen deger negatif olamaz");
        }
        else if (maxSayi==0) {
            fibonacciSerisi.add(0);
        } else if (maxSayi==1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int sonrakiSayi = 0;
            int sonrakiIndex = 3;

            while (sonrakiSayi <= maxSayi ){

                sonrakiSayi = fibonacciSerisi.get(sonrakiIndex-2)+
                        fibonacciSerisi.get(sonrakiIndex-1);

                if (sonrakiSayi <= maxSayi){
                    fibonacciSerisi.add(sonrakiSayi);
                }
                sonrakiIndex++;
            }
            System.out.println(fibonacciSerisi);
        }
    }




    // Kullanicidan pozitif bir tam sayi alip
    // o tam sayidan kucuk Fibonacci sayilarini bir liste olarak bize donduren bir method olusturun.

    public static List<Integer> fibonacciListesiOlustur (int maxSayi) {
        List<Integer> fibonacciSerisi = new ArrayList<>();

        // negatif deger girilirse ==> hata
        // 0 girilirse ==> 0
        // 1 girilirse ==> 0 1 1
        // 1'den buyuk bir deger girilirse ==> 0 1 1 .............. maxSayi

        if (maxSayi<0) {
            System.out.println("Girilen deger negatif olamaz");
        }
        else if (maxSayi==0) {
            fibonacciSerisi.add(0);
        } else if (maxSayi==1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int sonrakiSayi = 0;
            int sonrakiIndex = 3;

            while (sonrakiSayi <= maxSayi ){

                sonrakiSayi = fibonacciSerisi.get(sonrakiIndex-2)+
                        fibonacciSerisi.get(sonrakiIndex-1);

                if (sonrakiSayi <= maxSayi){
                    fibonacciSerisi.add(sonrakiSayi);
                }
                sonrakiIndex++;
            }
        }return fibonacciSerisi;
    }
}
