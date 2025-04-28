package day35_maps_nestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        String str = "Ali";
        // Integer sayi = str;
        Integer sayi = 20;

        // List<String> isimler = str;
        List<String> isimler = new ArrayList<>();

        Object obj = str;
        obj = sayi;
        obj = isimler;

        // Non-primitive data turlerinde casthing sadece parent-child iliskisi olan class'lardsa olur

        // str = (String) obj; // olur



        List<Object> elementler = new ArrayList<>();

        // data turunu Object secmek elementleri eklemede bize cok kolaylik saglar
        // AMA elementleri kullanirken surekli casthing gerekebilir
        // surekli olarak kullanmak istedigimiz elementin data turunu kontrol etmeli
        // ve Object data turunden istedigimiz data turune cast etmeliyiz


        elementler.add(20);
        elementler.add(true);
        elementler.add('a');
        elementler.add("esra");

        int [] arr = {2,4,6};

       elementler.add(arr);

       System.out.println(elementler); // [20, true, a, esra, [I@60f82f98]

        // elementler listesindeki 4. indexteki array'i yazdirin

        System.out.println(
                Arrays.toString((int[]) elementler.get(4))
        ); // [2, 4, 6]


        // elementler listesindeki 3. indexteki ismin uzunlugunu yazdirin

        System.out.println(
                ((String) elementler.get(3)).length()
        ); // 4

        // elementler listesindeki 0. indexteki sayiyi 5 artir

        elementler.set(0, (Integer)elementler.get(0)+5);
        System.out.println(elementler); // [25, true, a, esra, [I@60f82f98]

    }
}
