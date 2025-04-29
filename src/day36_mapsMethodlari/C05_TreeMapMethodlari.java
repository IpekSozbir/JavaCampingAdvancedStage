package day36_mapsMethodlari;

import java.util.TreeMap;

public class C05_TreeMapMethodlari {
    public static void main(String[] args) {

        /*
        MAp<String, Integer> map = new TreeMap<>();
        biz bu gosterimde objeyi treeMap yapmamiza ragmen
        data turu map secildigi icin
        butun map ozelliklerine ulasabiliriz

        Ama data turu de TreeMap secilirse
        sadece TreeMap'e ozgu methodlar kullanilabilir


         */

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("H",40);
        treeMap.put("T",10);
        treeMap.put("M",50);
        treeMap.put("L",65);
        treeMap.put("C",45);
        treeMap.put("SS",25);
        System.out.println(treeMap);

        // TreeMap index kullanmamasina ragmen dogal sirali oldugu icin
        // bastaki ve sonraki yada onlardan bir once ve sonraki elemana ulasabiliriz

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.tailMap("M"));
        // verilen elemandan sona kadar olan entry'leri getirir
        System.out.println(treeMap.tailMap("L",true)); // verilen elemani dahil eder
        System.out.println(treeMap.tailMap("L",false)); // verilen elemandan sonrasini verir

        System.out.println(treeMap.headMap("L")); // girilen elemandan oncekileri verir
        System.out.println(treeMap.headMap("L",true)); // verileni de dahil ederek geriye dogru verir

        System.out.println(treeMap.higherKey("H"));
        System.out.println(treeMap.ceilingKey("H"));

        System.out.println(treeMap.descendingMap()); // siralamayi tersine cevirir
        System.out.println(treeMap.pollFirstEntry()); // asil siralamaya gore ilk elemani cikarir


    }
}
