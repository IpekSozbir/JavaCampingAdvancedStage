package day34_maps;

import java.util.Set;

public class C05_BolumListesiYazdir extends MapDepo{

    public static void main(String[] args) {

        // verilen bolumdeki tum ogrencilerin
        // Numara, isim, soyisim ve subelerini yazdirin

        String istenenBolum = "MF";


        System.out.println(istenenBolum + " bolumundeki ogrenci listesi");
        // numara da istendigi icin sadece value yetmez, key'leri de kullanmamiz gerekir

        // 1- Tum key'leri kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- her bir key'i ele almak icin for each loop yazalim

        for ( Integer eachKey : ogrenciKeySeti ) {
            // ornek eachKey: 101

            // for each loop her bir key'i bize getirecek
            // ama aradigimiz bilgiler key'de degil value'da

            String eachValue = ogrenciMap.get(eachKey);
            // "Ali-Can-11-H-MF"

            // 3- istenen bilgilere ulasmak icin eachValue'yu split edelim
            String [] eachValueArr = eachValue.split("-");

            // 4-artik istenen bilgilere ulasabiliyoruz
            // verilen gorevi yapalim

            if (eachValueArr[4].equalsIgnoreCase(istenenBolum)) {
                System.out.println(
                        eachKey + " " +
                        eachValueArr[0] + " " +
                        eachValueArr[1] + " " +
                        eachValueArr[3] + " "
                );
            }
    }
}
}
