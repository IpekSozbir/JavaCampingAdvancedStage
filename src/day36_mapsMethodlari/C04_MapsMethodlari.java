package day36_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C04_MapsMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> map = new TreeMap<>();

        map.put("W",10);
        map.put("I",40);
        map.put("S",25);
        map.put("E",100);

        System.out.println("ilk map: " + map);
        map.replace("I",60);
        System.out.println(map);

        map.put("M",30);
        // varolan key'lerde put ile replace arasinda hic bir fark yoktur

        map.replace("Y", 2024);
        // var olmayan bir key icin put derseniz ekelr ama replace derseniz hic bir islem yapmaz

        map.replace("W", 10, 1980);
        // bu methodda once ilk yazilana bakar eger dogru ise ikinci yazilani onunla degistirir
        System.out.println(map);

        System.out.println(map.getOrDefault("X", 500));
        // x'i bulamadiysan sana verdigim default'u dondur demek

        map.remove("W");
        System.out.println(map);


    }
}
