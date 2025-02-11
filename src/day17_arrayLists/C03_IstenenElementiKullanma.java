package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {

    public static void main(String[] args) {

        int[] arr = {3,5,6,8,1};
        arr[2] = 10;
        System.out.println(arr[4]); // 1

        // arr'deki tum elementleri toplayin
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
             toplam += arr[i];
        }

        System.out.println("Array'deki elementlerin toplami: " + toplam); // 27

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,1,4,0));
        // sayilar listesinin ikinci indexindeki sayiyi yazdirin
        System.out.println(sayilar.get(2)); // 8

        //sayilar listesindeki tum elmentleri toplayin
        toplam =0;

        for (int i = 0; i <sayilar.size() ; i++) {
           toplam += sayilar.get(i);
        }
        System.out.println("listedeki tum elementler toplami: " + toplam); // 22

        //2. indexteki elementi 5 yapin
        sayilar.set(2,5);
        System.out.println(sayilar); // [3, 6, 5, 1, 4, 0]

        // 4. indexteki elementi yazdirin
        System.out.println(sayilar.get(4)); // 4

        // sayilar listesindeki 4.indexteki elementi 11 yapin
        sayilar.set(4,11);
        System.out.println(sayilar); // [3, 6, 5, 1, 11, 0]

        //sayilar listesindeki 4. indexe 23 ekleyin
        sayilar.add(4,23);
        System.out.println(sayilar); // [3, 6, 5, 1, 23, 11, 0]

        // set update ederken add yeni bir element ekler
        // set yeni eleman eklemez, eleman sayisi ayni kalir sadece eleman degisir, update olur
    }
}
