package day26_inheritance;

import day25_encapsulation_inheritance.C09_Toyota;

public class C02_YeniToyotaAraba extends C09_Toyota {



    String model = "Yeni Model";

    public static void main(String[] args) {

        C02_YeniToyotaAraba obj1 = new C02_YeniToyotaAraba();

    }

    /*
    bir object olusturulurken
    objeyi olusturup ilk deger atamasini constructor yapar

    constructor calismaya baslamadan once
    obje yoksa objeyi olusturur
    ve ait oldugu class'daki
    instance variable'lar ve degerlerinin birer kopyasini alip objeye yapistirir

    Child class'dan obje olusturuldugunda
    objenin parent class'lardaki ozelliklere de sahip olabilmesi icin
    parent class constructorlarinin da calismasi zorunludur
    Java bunu super() sayesinde otomatik olarak yapar

     */

}
