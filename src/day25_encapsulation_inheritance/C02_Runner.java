package day25_encapsulation_inheritance;

public class C02_Runner {
    public static void main(String[] args) {

        /*
        Access modifier kullanarak bir variable'a ulasabiliyorsak
        o variable'i hem kullanabilir hem de o variable'a deger atamasi yapabiliriz

         */

        // static variable'lara ulasmak icin
        // obje olusturmaya gerek olmaz
        // static variable'larin diger adi Class variable'lardir
        // Class ismi ile birlikte kullanilabilirler

        // System.out.println(C01.strPris);
        // Private ne yaparsanız yapın class disindan kullanilamaz

        System.out.println(C01.strDefS);
        System.out.println(C01.strProS);
        System.out.println(C01.strPubS);

        C01.strDefS = "Yeni class default";
        C01.strProS = "Yeni class protected";
        C01.strPubS = "Yeni class public";
        // yazdirabiliyorsak atama da yapabiliriz


        // static olmayan variable'lara ulasabilmek icin C01 class'indan obje olusturmaliyiz

        C01 obj = new C01();

       //  System.out.println(obj.strPri); // cunku private
        System.out.println(obj.strDef);
        System.out.println(obj.strPro);
        System.out.println(obj.strPub);

        obj.strDefS = "Yeni class default";
        obj.strProS = "Yeni class protected";
        obj.strPubS = "Yeni class public";


    }
}
