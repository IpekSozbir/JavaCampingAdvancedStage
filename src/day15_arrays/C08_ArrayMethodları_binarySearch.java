package day15_arrays;

import java.util.Arrays;

public class C08_ArrayMethodları_binarySearch {

    public static void main(String[] args) {

        String[] harfler = {"d", "d", "t", "w", "w","t", "a","a"};

        // Verilen bir array'de a harfinin var olup olamdigini yazdirin

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"a");

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"x");

        int[] sayilar = {3,4,7,9,1,12};

        // sayilar arrayinde 8in var olup olmadigini kontrol edin

        System.out.println(Arrays.binarySearch(sayilar, 3)); //0
        System.out.println(Arrays.binarySearch(sayilar, 4)); //1
        System.out.println(Arrays.binarySearch(sayilar, 7)); //2
        System.out.println(Arrays.binarySearch(sayilar, 9)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 1)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 12)); // 5

        /*
        Arrays.binarySearch methodu bir arrayde aranan elementin hangi indexte oldugunu verir
        Ancak bu methoddan önce sort methodu calistirilmalidir
         */

        Arrays.sort(sayilar);
        System.out.println(Arrays.binarySearch(sayilar, 3)); // 1
        System.out.println(Arrays.binarySearch(sayilar, 4)); // 2
        System.out.println(Arrays.binarySearch(sayilar, 7)); // 3
        System.out.println(Arrays.binarySearch(sayilar, 9)); // 4
        System.out.println(Arrays.binarySearch(sayilar, 1)); // 0
        System.out.println(Arrays.binarySearch(sayilar, 12)); //5

        // olmayan bir eleman arandiginda ise
        // olsaydi bulunacagi SIRALAMAYI - olarak verir
        // index kullanilsaydi -0 diyemeyecegimiz icin index degil SIRALAMAYI verir

        System.out.println(Arrays.binarySearch(sayilar, 10)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 5)); // -4
        System.out.println(Arrays.binarySearch(sayilar, 0)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 40)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 10000)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 234510)); // -7

    }
}
