package day34_maps;

import java.util.Set;

public class C09_BolumleriDegistir  extends MapDepo {

    public static void main(String[] args) {

        // ogrenci map'inde tum ogrencileri gozden gecirip
        // verilen eski bolum bilgisine sahip olanlari
        // yeni bolum olarak update edin

        System.out.println(ogrenciMap);

        String eskiBolum = "MF";
        String yeniBolum = "Say";

        // Tum ogrencilerin key ve value'larini gozden gecirmemiz gerekiyor

        // 1- key'leri bir set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- tum key'leri elden gecirmek icin for each loop

        for ( Integer eachKey : ogrenciKeySeti ) {

            // biz key'leri elden geciriyoruz ama bolum bilgisi value'da
            // eachKey'i kullanarak eskiValue'yu bulalim

            String eskiValue = ogrenciMap.get(eachKey);

            String [] eskiValueArr = eskiValue.split("-");

            if (eskiValueArr[4].equalsIgnoreCase(eskiBolum)) {
                eskiValueArr[4] = yeniBolum;
                // tum ogrencileri yeniden birlestirip map'i her ogrenci icin update etmesini istmezsek
                // guncellemeyi if icinde yapmaliyiz

                String yeniValue = String.join("-",eskiValueArr);
                ogrenciMap.put(eachKey,yeniValue);
                System.out.println(ogrenciMap);
            }
        }
    }
}
