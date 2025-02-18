package day19_constructors;

public class C12_KodOkumaDikkatEdilecekler {

    /*
    Kod okuma sorularinda bizi saisrtmak icin bekledigimiz atamalar yerine farkli ve ilgisiz atamalar yapilabilir
    Kod okuma sorularinda biz misafir oldugumuz icin kodda ne islem yapildi ise o islemi takip eder sonucunu kabul ederiz
    CTE vermedigi surece kod icin yanlis yazilmis diyemeyiz
     */

    int sayi =23;
    String isim = "Ali";
    char chr = '@';

    C12_KodOkumaDikkatEdilecekler (int sy, String ism) { // 1
        sayi =34;
        isim = ism.toUpperCase();
    }


    C12_KodOkumaDikkatEdilecekler () { // 2
        chr = '%';
        isim = "Esra";
    }


    C12_KodOkumaDikkatEdilecekler (int sy, String ism, char a) { // 3
        isim = ism;
        sayi = sy;
        
    }

    public static void main(String[] args) {

        C12_KodOkumaDikkatEdilecekler obj3 = new C12_KodOkumaDikkatEdilecekler(22, "Hakan" ,'p');
        // obj3 icin 3 nolu constructor calisir
        System.out.println(obj3.isim); // Hakan
        System.out.println(obj3.sayi); // 22
        System.out.println(obj3.chr); // @


        C12_KodOkumaDikkatEdilecekler obj2 = new C12_KodOkumaDikkatEdilecekler(5, "Cansu");
        // obj2 icin 1 nolu constructor calisir
        System.out.println(obj2.sayi); // 34
        System.out.println(obj2.isim); // CANSU
        System.out.println(obj2.chr); // @



        C12_KodOkumaDikkatEdilecekler obj1 = new C12_KodOkumaDikkatEdilecekler();
        // obj1 icin 2 nolu constructor calisir
        System.out.println(obj1.sayi); // 23
        System.out.println(obj1.isim); // Ali
        System.out.println(obj1.chr); // @
        // parametresiz olsa da degerlerin degismyecegini garanti edemeyiz
        //kod'u takip etmeliyiz

    }
}
