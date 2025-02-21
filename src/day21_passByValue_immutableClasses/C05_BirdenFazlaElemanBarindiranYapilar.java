package day21_passByValue_immutableClasses;

import java.util.Arrays;

public class C05_BirdenFazlaElemanBarindiranYapilar {

    public static void main(String[] args) {

        /*
        Java'da array ve arraylist gibi birden fazla element barindiran yapilarda
        java method'da yapilan degisikligin
        element'lere mi yoksa array/ arrayList'in kendisine mi yapildigina bakar

        Elementler degisti ise Java bu degisikligi kabullenir, hata vermez
        Ama array veya arrayList'in kendisine atama yapilirsa
        bu degisikligi kabul etmez
        main method'da olusturulan halini kullanir
         */

        int[] arr = {3,5,6};
        // array'in tum elementlerini birer artirip son halini yazdiran bir method olusturun

        elementleriBirArtir(arr); // [4, 6, 7] methodda yazdirdi

        System.out.println("main method'da method call'dan sonra arr: " + Arrays.toString(arr));
        // sadece elemntler degisirse java bu degisikligi kabul eder
        // main method'da method call'dan sonra arr : [4, 6, 7]


        // array'e 5 uzunlugunda ve icinde 4,7,8,3,1 elementleri olan yeni bir array atayip
        // arrayi yazdiran bir method olusturun
        yeniArrAta(arr);// method'da array'in son hali: [4, 7, 8, 3, 1]

        System.out.println("main method'da 2. method call'dan sonra arr: " + Arrays.toString(arr));
        // 2. methodda arr'in elementlerine degi ,direkt kendisine yeni deger ataniyor
        // java bu degisikligi kabul etmez
        // main methoddaki son halini yazdirir
        // main method'da 2. method call'dan sonra arr : [4, 6, 7)




    } public static void elementleriBirArtir (int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] += 1; // array'in elementlerine atama yapiliyor
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void yeniArrAta (int[] arr) {
        int [] yeniArr = {4,7,8,3,1}; // array'in kendisine atama yapiliyor

        arr = yeniArr;
        System.out.println("method'da array'in son hali: " + Arrays.toString(arr));
    }
}
