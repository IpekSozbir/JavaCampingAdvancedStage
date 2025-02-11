package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));
        System.out.println(sayilar);

        // Listede kac tane element oldugunu yazdirin
        System.out.println(sayilar.size()); // 9

        // Listede element olarak 7'nin var olup olmadigini yazdirin
        System.out.println(sayilar.contains(7)); // true

        // Listede varsa 2'nin ilk indexini yazdirin
        System.out.println(sayilar.indexOf(2)); // 2

        // Listede varsa 2'nin son kullanilma indexini yazdirin
        System.out.println(sayilar.lastIndexOf(2)); // 5

        // Listede varsa 11'in ilk indexini yazdirin
        System.out.println(sayilar.indexOf(11)); // -1

        // Listede 2 icin asagideki cumlelerden uygun olani yazdirin
        // Listede 2 yok
        // Listede 2 sadece 1 tane var
        // Listede birden falza 2 var

        if (sayilar.indexOf(2) == -1) {
            System.out.println("Listede 2 yok");
        } else if (sayilar.indexOf(2) == sayilar.lastIndexOf(2)) {
            System.out.println("Listede 2 sadece 1 tane var");
        } else {
            System.out.println("Listede birden fazla 2 var");
        }

        sayilar.clear();
        System.out.println(sayilar); // []
    }
}
