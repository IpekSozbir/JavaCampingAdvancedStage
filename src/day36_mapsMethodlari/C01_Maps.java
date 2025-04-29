package day36_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        //Soru : Verilen bir array’de kullanilan sayilari
    //   ve kacar defa kullanildigini yazdirin.
    // Input : {1,2,4,4,5,3,4,1,5,1,4,2,4,1}
    // output :
    // 1 kullanimi : 4 adet
    // 2 kullanimi : 2 adet
    // 3 kullanimi : 1 adet
    // 4 kullanimi : 5 adet
    // 5 kullanimi : 2 adet

        Map<Integer, Integer> kullanimSayilariMap = new TreeMap<>();

        int [] arr = {1,2,4,4,5,3,4,1,5,1,4,2,4,1};


        for ( Integer each : arr) {
            // eger baktigi eleman map'de yoksa ekleyecek ve value'sunu 1 yapacak
            if ( ! kullanimSayilariMap.containsKey(each)) {
                kullanimSayilariMap.put(each,1);
            } else {
                // eger eleman varsa onun da value degerini 1 artirsin
                kullanimSayilariMap.put(each,kullanimSayilariMap.get(each)+1);
            }
        }
        System.out.println(kullanimSayilariMap);

    }
}
