package day16_arrays_MultidimensionalArrays;

import java.util.Arrays;

public class C05_TumElementleriKontrolEtme {

    public static void main(String[] args) {

        int[][] arr = {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        // arr'deki cift sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0) {
                    toplam += arr[i][j];
                }
            }
        }System.out.println("Cift sayilari toplami: " +toplam);



        // arr'deki tek sayilardan en buyuk olani yazdirin

        int enBuyukTekSayi = Integer.MIN_VALUE;
        // en buyuk tek sayiyi ariyoruz, gecici atadigimiz bu degeri EN KUCUK deger olarak atadik

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] %2 != 0 && arr[i][j] > enBuyukTekSayi) {
                    enBuyukTekSayi = arr[i][j];
                }
            }
        }
        System.out.println("Arraydeki en buyuk tek sayi: " + enBuyukTekSayi);



        // arr'deki tum sayilari 1 artirin

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                arr[i][j] += 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));



        // arr'deki tum tek sayilari ve cift sayilari ayri ayri toplayip
        // ciftSayilarToplami - tekSayilarToplamini yazdirin

        int ciftSayilarToplami = 0;
        int tekSayilarToplami = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0) {
                    ciftSayilarToplami += arr[i][j];
                } else {
                    tekSayilarToplami += arr[i][j];
                }
            }
        }

        System.out.println("Cift sayilarin ve tek sayilarin toplamlari arasindaki fark: "  +(ciftSayilarToplami-tekSayilarToplami));
    }
}
