package day15_arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEklemeMethodu {

    public static void main(String[] args) {

        // Verilen String bir array'in sonuna
        // verilen yeni bir metni eleman olarak ekleyip
        // array'in yeni halini bize donduren bir method olusturun


        String [] isimler = {"ali" , "veli"};
        isimler = arrayeElementEkle(isimler, "ayse");
        System.out.println("Isimlerin yeni hali " + Arrays.toString(isimler));
    }

    public static String[] arrayeElementEkle (String[] eskiArray, String eklenecekYeniElement) {

        //1. adim yeni array olustur
        String[] yeniArray = new String[eskiArray.length+1];

        // 2.adim eski arraydeki elementleri yeni arraye kopyala

        for (int i = 0; i < eskiArray.length ; i++) {
            yeniArray[i] = eskiArray[i];
        }

        // 3. adim sonda kalan elemana eklenecek yeni element degerini atayalim

        yeniArray[yeniArray.length-1] = eklenecekYeniElement;

        // 4. adim eski arraye yeni array degerini atayalim
        eskiArray = yeniArray;

        return eskiArray;
    }
}
