package day19_constructors;

public class C02_Hastane {

    /*
    C02_Hastane() {

     }
    default constructor parametresizdir ve body'sinde kod yoktur

     gorunur bir constructor olusturuldugunda java default constructor'i siler
     */


    String perIsim = "isim atanmamis";
    String perAdres = "Adres atanmamis";
    String perTelefon = "Telefon atanmamis";

    C02_Hastane() {
        System.out.println("Parametresiz, kod calisti");
    }

    // defalut constructor buna benzer ama
    // bu default constructor degildir
    // bu parametresiz constructor'dır
}
