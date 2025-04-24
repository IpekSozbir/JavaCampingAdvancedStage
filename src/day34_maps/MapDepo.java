package day34_maps;

import java.util.*;

public class MapDepo {

    protected static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    public static void isimdenListeYazdir(String istenenIsim) {
        // 1- ismi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String > valueCollection = ogrenciMap.values();

        System.out.println(valueCollection);

        System.out.println("Ismi " + istenenIsim + " olan ogrenci listesi");

        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim
        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            //  verilen isme sahip olan ogrencilerin isim, soyisim, sinif ve subelerini yazdirin

            if (eachValueArr[0].equalsIgnoreCase(istenenIsim)){
                System.out.println(
                        eachValueArr[0] + " " +
                                eachValueArr[1] + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3]
                );
            }



        }
    }

    public static void sinifSubeListesiYazdir(int istenenSinif, String istenenSube) {

        System.out.println(istenenSinif+"/"+istenenSube + " sinifi ogrenci listesi");
        // 1- sinif ve subeyi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String> valueCollection = ogrenciMap.values();


        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim

        for ( String eachValue:valueCollection){

            // ornegin each bize "Ali-Can-11-H-MF" getirdi
            // 3- value icindeki sinif ve sube bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // verilen sinif ve subedeki tum ogrencilerin isim ve soyisimlerini yazdirin

            if ( (istenenSinif+"").equalsIgnoreCase(eachValueArr[2])
                    && istenenSube.equalsIgnoreCase(eachValueArr[3]) ){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);

            }


        }

    }

    public static void soyisimdenListeYazdir(String istenenSoyisim) {
        // 1- ismi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String > valueCollection = ogrenciMap.values();

        System.out.println(valueCollection);

        System.out.println("Soyismi " + istenenSoyisim + " olan ogrenci listesi");

        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim
        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // Verilen soyisme sahip ogrencilerin
            // Isim, sinif ve subelerini liste olarak yazdirin
            if (eachValueArr[1].equalsIgnoreCase(istenenSoyisim)){
                System.out.println(
                        eachValueArr[0] + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3]
                );
            }

        }
    }

    public static void bolumListesiYazdir (String istenenBolum) {
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

    public static void numaraAraligindakiOgrenciListesi (int basNo, int bitNo) {
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

    public static void kullaniciyaYeniOgrenciOlusturtma () {
    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen ogrenci no giriniz");
    int key = scan.nextInt();

    String value = "";
    scan.nextLine();

    System.out.println("lutfen ogrenci ismini giriniz");
    value += scan.nextLine();
    value += "-";

    System.out.println("lutfen ogrenci soyismini giriniz");
    value += scan.nextLine();
    value += "-";

    System.out.println("lutfen ogrenci sinifini giriniz");
    value += scan.nextLine();
    value += "-";

    System.out.println("lutfen ogrenci subesini giriniz");
    value += scan.nextLine().toUpperCase();
    value += "-";

    System.out.println("lutfen ogrenci bolumunu giriniz");
    value += scan.nextLine();

    ogrenciMap.put(key,value);



}

    public static void numaraIleSoyisimUpdate (int ogrenciNo, String yeniSoyisim) {
    // once ogrencinin eski value'sunu alalim

    String eskiValue = ogrenciMap.get(ogrenciNo);
    // "Veli-Cem-10-K-TM"

    // Value birlesik bilgilerden olusuyor
    // soyisme ulasmak ve update etmek icin eski value'yu split etmemiz gerekir

    String [] eskiValueArr = eskiValue.split("-");
    // [Veli, Cem, 10, K, TM]

    // artik yeni soyismi arr'ye atayabiliriz

    eskiValueArr[1] = yeniSoyisim;
    // / [Veli, Kaya, 10, K, TM]

    String yeniValue = String.join("-",eskiValueArr);

    ogrenciMap.put(ogrenciNo,yeniValue);
    System.out.println(ogrenciMap);

}

    public static void bolumGuncelle (String eskiBolum, String yeniBolum) {
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
        }
        String yeniValue = String.join("-",eskiValueArr);
        ogrenciMap.put(eachKey,yeniValue);
        System.out.println(ogrenciMap);
    }
}

public static void yilsonuSinifArtir () {
    // update varsa key olmali

    // 1- tum key'leri kaydedelim
    Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

    // 2- tum key'leri gozden gecirmek icin once for each loop

    for (Integer eachKey : ogrenciKeySeti) {

        // 3- sinif update etmek icin value'yu kaydedelim

        String eachValue = ogrenciMap.get(eachKey);

        // 4- bilgilere ulasmak ve update etmek icin split edelim
        String [] eachValueArr = eachValue.split("-");

        // 5- artik arr'de istenen update'i yapabiliriz

        switch (eachValueArr[2]) {
            case "9" :
                eachValueArr[2] =  "10";
                break;
            case "10" :
                eachValueArr[2] =  "11";
                break;
            case "11" :
                eachValueArr[2] =  "12";
                break;
            case "12" :
                eachValueArr[2] =  "Mezun";
                break;
        }

        // 6- array'de yapilan degisikligi map'e kaydetmek icin
        // yeniValue'yu olusturalim

        String yeniValue = String.join("-", eachValueArr);

        // 7- guncel value var, key ==> eachKey
        ogrenciMap.put(eachKey, yeniValue);


    }
}
}




