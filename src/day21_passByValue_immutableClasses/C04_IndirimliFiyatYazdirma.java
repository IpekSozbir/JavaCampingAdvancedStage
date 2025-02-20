package day21_passByValue_immutableClasses;

public class C04_IndirimliFiyatYazdirma {

    public static void main(String[] args) {

        // 3 farkli method olusturup
        // verilen fiyat variable'ina %10, %20, %40 indirim yapin
        // methodlarda fiyatin indirimli halini kaydedip
        // urunun %10 indirimli fiyati: 90 seklinde yazdirin

        double fiyat =250;
        indirimliFiyatYazdir10(fiyat); // 225.0
        indirimliFiyatYazdir10(fiyat); // 225.0

        indirimliFiyatYazdir20(fiyat); // 200.0
        indirimliFiyatYazdir40(fiyat); // 150.0
    }


    public static void indirimliFiyatYazdir10 (double fiyat) {

        fiyat = 90 * fiyat / 100;
        System.out.println("Urunun %10 indirimli fiyati: " + fiyat);
    }

    public static void indirimliFiyatYazdir20 (double fiyat) {

        fiyat = 80 * fiyat / 100;
        System.out.println("Urunun %20 indirimli fiyati: " + fiyat);
    }

    public static void indirimliFiyatYazdir40 (double fiyat) {

        fiyat = 60 * fiyat / 100;
        System.out.println("Urunun %40 indirimli fiyati: " + fiyat);
    }
}
