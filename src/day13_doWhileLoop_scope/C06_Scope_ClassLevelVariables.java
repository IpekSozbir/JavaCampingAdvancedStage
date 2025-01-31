package day13_doWhileLoop_scope;

public class C06_Scope_ClassLevelVariables {

    String str = "Java candir";
    static String isim;
    public int sayi1 = 10;
    public static int numara;
    // class levelda olunca variablelarda public yada static olabilirler
    // publicin class icinde hic bi onemi yok class disindan ulasabilmek icin

    //***
    // 1- class levelda olusturulan variablelarin scopeu tum classtir
    // yani tum classtan kullanilabilirler
    // 2- class levelda olusturulan variablelar icin java 2 alternatif sunar
    //    -static variable : deklarasyonunda static keyword kullanilan variablaler
    //    -instance variable : deklarasyonunda static keyword kullanilmayan variablaler
    // 3- ANCAAAK class level variablelarin kullanim seklinde static keywordu de etkilidir
    //*** eger variable static ise her yerden direkt olarak kullanilabilir
    // -variable instance ise (static degil) secim hakki methoda gecer,
    // static methodlar sinirlarindan iceri static olmayan hic bir sey girmesine izin vermez
    // method static degilse static olmayani da kabul eder
    // 4- Local variablelar deger atamadan dekalre edilebilir
    // ama deger atamadan kullanilamaz
    // eger biz deger atamamissak Java Class level variable'lar icin
    //            belirlemis oldugu default degerleri atama yapar
    //            non-primitive'ler icin ==> null
    //            sayisal primitive'ler  ==> 0
    //            boolean                ==> false
    //            char                   ==> hiclik

    boolean emekliMi = true;
    static boolean aktifMi;
    char ilkHarf = 'A';
    char karakter;

    public static void main(String[] args) {
        System.out.println(isim); // cunku ayricaliklar klubu
        System.out.println(aktifMi);

    }

    static void method1 () {
        System.out.println(isim); // cunku ayricaliklar klubu
    }

    public void methos2 () {
        System.out.println(isim); // cunku ayricaliklar klubu

    }

}
