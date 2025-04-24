package day34_maps;

import java.util.Set;

public class C06_BelirliNumaraAraligindakiOgrenciListesiYazdirma extends MapDepo {

    public static void main(String[] args) {

        // verilen baslangic ve bitis numaralari dahil olmak uzere
        // bu numaralar arasindaki ogrencilerin
        // No, isim, soyisimlerini yazdirin

        int basNo = 102;
        int bitNo = 105;

        System.out.println(basNo + " ile " + bitNo + "numaralari arasindaki ogrenci listesi");

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // butun keyleri elden gecirmek icin for each loop

        for (Integer eachKey : ogrenciKeySeti) {

            // bu defa kontrol value'e degil key'de

            if (eachKey>=basNo && eachKey<=bitNo) {

                // isim ve soyisimlere ulasabilmek icin value'ye ihtiyacimiz var
                String eacchValue = ogrenciMap.get(eachKey);

                // Value'deki bilgilere ulasmak icin split yapmaliyiz
                String [] eachValueArr = eacchValue.split("-");

                // artik istedigimiz bilgilere ulasabiliriz
                System.out.println(
                        eachKey + " " +
                        eachValueArr[0] + " " +
                         eachValueArr[1]
                );

            }
        }
    }
}
