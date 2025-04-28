package day35_maps_nestedMaps;

import java.util.Set;

public class C05_SoyisimleriGuncelle extends NestedMapDepo {

    public static void main(String[] args) {

        // tum ogrencilerin soyisimlerini buyuk harf yapin


        // 1-key'leri bir set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- butun key'leri elden gecirelim
        for (Integer eachKey : ogrenciKeySeti) {

            // gelen eachKey'e ait value'de soyismi update edelim

            String eskiSoyisim = ogrenciMap.get(eachKey).get("soyisim");
            String yeniSoyisim = eskiSoyisim.toUpperCase();

            // Map'i yeni soyisim ile guncelleyelim

            ogrenciMap.get(eachKey).put("soyisim", yeniSoyisim);

            // isterseniz bu 3 satiri tek satirda yapabiliriz
            // ama islemin anlasilir olmasi icin bir 3 adimda yaptik
            ogrenciMap.get(eachKey).put("soyisim", ogrenciMap.get(eachKey).get("soyisim").toUpperCase());

        }
        System.out.println(ogrenciMap);

    }
}
