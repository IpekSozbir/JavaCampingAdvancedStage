package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));
        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        System.out.println(sayilar); // [4, 6, 1, 9, 3]

        sayilar.set(2,5);
        System.out.println(sayilar); // [4, 6, 5, 9, 3]

        // System.out.println(sayilar.set(2, 5)); // 1
        // boyle direkt method call'u yazdirinca
        // delil olarak eski elementi getirir

        System.out.println(isimler.remove("Ali")); // true
        System.out.println(isimler); // [Veli, Cemil, Ayse, Fatma, Hatice]

        System.out.println(isimler.remove(2)); // Ayse
        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]

        System.out.println(sayilar.remove(3)); // 9

        Integer silinecekSayi = 4;
        System.out.println(sayilar.remove(silinecekSayi)); // true
    }
}
