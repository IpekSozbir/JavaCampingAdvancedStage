package day34_maps;

public class C08_NumaraIlesoyisimUpdate extends MapDepo {

    public static void main(String[] args) {

     // ogrenci map'inde numarasi ve yeni soyismi verilen ogrencinin
     // eski soyisminin yerine yeni soyismi kaydedin

        int ogrenciNo = 102;
        String yeniSoyisim = "Kaya";

        // once ogrencinin eski value'sunu alalim

        String eskiValue = ogrenciMap.get(102);
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
}
