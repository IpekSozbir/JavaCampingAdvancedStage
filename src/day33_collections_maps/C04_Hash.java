package day33_collections_maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Hash {

    public static void main(String[] args) {

        Set<Integer> sayilar = new HashSet<>();

        System.out.println(sayilar.hashCode()); // 0

        sayilar.add(20);
        System.out.println(sayilar.hashCode()); // 20

        sayilar.add(25);
        System.out.println(sayilar.hashCode()); // 65

        sayilar.add(1);
        sayilar.add(3);
        System.out.println(sayilar.hashCode()); // 69

        List<String> isimler = new ArrayList<>();

        System.out.println(isimler.hashCode()); // 1
        isimler.add("Ipek");
        System.out.println(isimler.hashCode()); // 2285644


    }
}
