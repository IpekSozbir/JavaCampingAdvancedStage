package day14_scope_arrays;

public class C01_Hastane {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";

    String personelIsmi = "isim atanmadi";
    String personelAdres = "adres atanmadi";
    String personelTelefon = "telefon atanmadi";

    public static void main(String[] args) {

        System.out.println(hastaneAdresi);

        C01_Hastane per1 = new C01_Hastane();

        per1.personelIsmi = "Yelda";
        per1.personelAdres = "Sincan";
        per1.personelTelefon = "5353563534";

        System.out.println(per1.bashekim); // bu zaten gelirdi objeye gerek yoktu diye sariya boyuyor

        /*
        static variablelar class icinde her yerden direkt kullanilabilir
        obje uzerinden kullanmak isterseniz Java buna da itiraz etmez
        sadece static variablea neden instance muamelesi yapiyorsun ne gerek var objeye diye altini sari cizer
         */

        C01_Hastane per2 = new C01_Hastane();
         per2.personelIsmi = "Oguzhan";
         per2.personelAdres = "Cankaya";
         per2.hastaneAdresi = "Cankaya";

         // per2 nin yaptigi atamalar per'i etkiler mi?
        System.out.println(per1.hastaneAdresi); // Cankaya

        C01_Hastane per3 = new C01_Hastane();

        per3.personelIsmi = "Esra";
        per3.hastaneAdresi = "Mamak";
        per3.bashekim = "Dr Ipek";

        /*
        per3'un yaptigi atamalardan kisisel olanlar yani instance variablelar
        diger personeli etkilemez
        ANCAK ortak olanlar yani static variables tum personeli etkiler
         */

        System.out.println(bashekim); // Dr Ipek
        System.out.println(per1.bashekim); // Dr Ipek
        System.out.println(per2.bashekim); // Dr Ipek
        System.out.println(per3.bashekim); // Dr Ipek

        System.out.println(per1.personelIsmi); // "Yelda"
    }
}
