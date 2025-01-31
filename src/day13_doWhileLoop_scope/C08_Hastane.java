package day13_doWhileLoop_scope;

public class C08_Hastane {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";

    String personelIsmi = "isim atanmadi";
    String personelAdres = "adres atanmadi";
    String personelTelefon = "telefon atanmadi";


    public static void main(String[] args) {

        C08_Hastane personel1 = new C08_Hastane();

        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelAdres);
        System.out.println(personel1.personelTelefon);

        personel1.personelIsmi = "Veli";
        personel1.personelTelefon = "5434323232";
        personel1.personelAdres = "balgat";

        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelAdres);
        System.out.println(personel1.personelTelefon);

        C08_Hastane personel2 = new C08_Hastane();

        System.out.println(personel2.personelIsmi);
        System.out.println(personel2.personelAdres);
        System.out.println(personel2.personelTelefon);

        personel2.personelIsmi = "Ayse";
        personel2.personelTelefon = "5434323789";
        personel2.personelAdres = "yenimahalle";

        System.out.println(personel2.personelIsmi);
        System.out.println(personel2.personelAdres);
        System.out.println(personel2.personelTelefon);


        C08_Hastane personel3 = new C08_Hastane();

       // System.out.println(personelismi) ; // bunlar instance static olamdigi icin giremez boyle // cunku method static
        // ama objeler uzerinden kullanabilirsin

        personel2.personelAdres ="çankaya";
        System.out.println(personel1.personelAdres);

    }
}
