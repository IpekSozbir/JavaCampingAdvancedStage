package day18_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        System.out.println(ilkNFibonacciListesi(5)); // [0, 1, 1, 2, 3]

        // Kullanicidan pozitif bir n tam sayisini alip
        // ilk n tane Fibonacci sayisini bir liste olarak yazdirin.

        // Fibonacci Sayisi = 0 1 1 2 3 5 8 13 21 34 55 89 144.....
        // 0 ve 1 le baslar son sayiyla bir onceki sayinin toplamiyla devam eder

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac adet Fibonacci sayisini yazdirmak istediginizi giriniz: ");
        int n = scan.nextInt();

        // kullanici negatif veya 0 girerse  ==> hata
        // kullanici 1 girerse ==> 0
        // kullanici 2 girerse  ==> 1
        // kullanici 2'den fazla deger girerse ==> formul  0 1 for loop


        List <Integer> fibonacciSerisi = new ArrayList<>();

        if (n <= 0 ) {
            System.out.println("Girilen sayi pozitif deger olmalidir");
        } else if (n == 1) {
            fibonacciSerisi.add(0);
        } else if (n == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i<n ; i++) {
               fibonacciSerisi.add(fibonacciSerisi.get(i-2) + fibonacciSerisi.get(i-1));
            }
        }
        System.out.println(fibonacciSerisi);
    }



    // Verilen pozitif bir n tam sayisini alarak,
    // bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

    public static List<Integer> ilkNFibonacciListesi (int n) {

        List <Integer> fibonacciSerisi = new ArrayList<>();
        if (n <= 0 ) {
            System.out.println("Girilen sayi pozitif deger olmalidir");
        } else if (n == 1) {
            fibonacciSerisi.add(0);
        } else if (n == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i<n ; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i-2) + fibonacciSerisi.get(i-1));
            }
        }
        return fibonacciSerisi;
    }
}
