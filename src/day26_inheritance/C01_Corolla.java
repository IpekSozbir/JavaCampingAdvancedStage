package day26_inheritance;

import day25_encapsulation_inheritance.C09_Toyota;

public class C01_Corolla extends C09_Toyota {

    /*
     1 - baslangic itibariyle parent'i olan Toyota
         ve grandparent'i olan araba calss'lardaki
         tum ozelliklere sahiptir

     2- Corolla class'i parent ve grandparent class'lardaki
        istedigi variable'lari kendisine uyarlayabilir

     3- Corolla class'i butun corolla araclarda olan
        ama parent class'i Toyota veya grand parent'i olan Araba class'larinda olmayan
        yeni variable'lar ekleyebilir

     */


    String model = "Corolla";
    String kasa = "Corolla kasasi";
    String motor= "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Turkiye";
    String aku = "Inci akü";
    String renk = "Renk secilmedi";
    String yakıtTuru = "Yakit turu secilmedi";







    C01_Corolla() {
       // System.out.println(marka);
       // System.out.println(motor);
       // System.out.println(kasa);

    }

    public static void main(String[] args) {

        C01_Corolla corolla1 = new C01_Corolla();

        System.out.println(corolla1.sanzuman); // A Sanzuman secilmedi

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.guvenlik); // T Toyota
        System.out.println(corolla1.fren); // T Toyota

        System.out.println(corolla1.model); // C Corolla
        System.out.println(corolla1.kasa); // C Corolla kasasi
        System.out.println(corolla1.motor); // 15 vvdi
        System.out.println(corolla1.lastik); // C 15 inch Pirelli
        System.out.println(corolla1.uretimYeri); // C Turkiye
        System.out.println(corolla1.aku); // C Inci akü
        System.out.println(corolla1.renk); // C Renk secilmedi
        System.out.println(corolla1.yakıtTuru); // C Yakit turu secilmedi

        corolla1.sanzuman = "Otomatik";
        corolla1.kasa = "Corolla Sedan";
        corolla1.renk = "Kirmizi";
        corolla1.yakıtTuru = "Hybrit";
    }
}
