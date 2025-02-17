package day19_constructors;

public class C03_HastaneRunner {

    public static void main(String[] args) {

        C02_Hastane per1 = new C02_Hastane();

        System.out.println(per1.perIsim);
        System.out.println(per1.perAdres);
        System.out.println(per1.perTelefon);

        // C02_Hastane per2;
        // System.out.println(per2.perIsim);
        // System.out.println(per2.perAdres);
        // System.out.println(per2.perTelefon);

        /*
        Constructor calismazsa obje olusturulmus olmaz

        Java'da bir obje olusturmak icin
        MUTLAKA bir Constructor CALISMALIDIR
         */

        System.out.println(new C02_Hastane().perIsim);
        String adres = new C02_Hastane().perAdres;

        // Ya yazdirmalisin ya atamalisin
    }
}
