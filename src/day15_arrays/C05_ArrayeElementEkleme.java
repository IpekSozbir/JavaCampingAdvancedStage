package day15_arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {

    public static void main(String[] args) {

        int [] sayilar = {3,5,6};

        // sayilar array'ine 4. element olarak yani 3. indexe 8 ekleyin

        //sayilar = new int[4]; // [0, 0, 0, 0]
        // eger direkt deger atamasi olarak new int[4] dersek tum elemanlari sifirlar

        // 1. adim : once yeni bir array olusturalım
        // yeni array'in kapasitesi eskiden 1 fazla olsun

        int[] yeniArr = new int [sayilar.length+1];

        // 2. adim yeni array 0'lardan olusur
        // once eski arraydeki elementleri yeni elemente kopyalamaliyiz

        for (int i = 0; i < sayilar.length ; i++) {
            yeniArr[i] = sayilar[i];
        }

        //3. adim sonda kalan tek 0 yerine, eklemek istedgimiz sayiyi atayalim

        yeniArr[yeniArr.length-1] =8;

        // 4.adim eklemeyi yeni arraye yaptık
        // eski arraye yeni arrayi deger olarak atayalım

        sayilar = yeniArr;
        System.out.println(Arrays.toString(sayilar));
    }
}
