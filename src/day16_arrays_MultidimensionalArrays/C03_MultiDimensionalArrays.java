package day16_arrays_MultidimensionalArrays;

import java.util.Arrays;

public class C03_MultiDimensionalArrays {

    public static void main(String[] args) {

        // Array'lerde herhangi bir yazdirma islemi yapacagimiz zaman ne yazdirdigimizi iyi bilmeliyiz
        // eger String veya primitive deger yazdiracaksak direkt sout
        // eger yazdirmak istedgimiz sey tek katli bir array ise Array.toString
        // eger yazdirmak istedgimiz sey multiDimensionalArray ise Arrays.deepToString


        int[][] arr = {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        System.out.println(arr.length); // 4

        System.out.println(arr[0].length); // 3

        System.out.println(arr[2][0]); // 4

        System.out.println(arr[3][3]); //6

        System.out.println(arr[1]); // array oldugu icin referansini yazdirir
        System.out.println(Arrays.toString(arr[1])); // [3, 5]

        System.out.println(Arrays.toString(arr)); // hepsinin referensini yazar

        System.out.println(Arrays.deepToString(arr)); // [[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]
    }
}
