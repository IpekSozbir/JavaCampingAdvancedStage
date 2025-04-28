package day35_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C09_HarfSayilari {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"t"};
        // {a=5, b=2, d=3, r=1, t=1}

        Map <String,Integer> harfSayilariMap = new TreeMap<>();

        for (String each : harfler ) {
            // gelen harf map'de varsa degerini 1 artir
            // gelen harf map'de yoksa degeri 1 olarak map'e ekle

            harfSayilariMap.computeIfPresent(each,(k,v) -> v+1);
            harfSayilariMap.computeIfAbsent(each,v->1);
        }
        System.out.println(harfSayilariMap); // {a=5, b=2, d=3, r=1, t=1}






        // Data type'i TreeMap olan bir map olusturalim
        // data type daha spesifik oldugu icin tum TreeMap'lerin sahip oldugu pek cok methoda sahip olur


        TreeMap<String, Integer> yeniMap = new TreeMap<>();

        // harfSayilari map'i TreeMap
        // ama data type map secildigi icin
        // butun maplerle ortak olan ozelliklere sahip olabilir

        // hayvanlar class'indaki kartal hareket eder, ucamaz
        // ama avcikuslar'daki kuslar ucar, pencelidir, et yer vs

    }
}
