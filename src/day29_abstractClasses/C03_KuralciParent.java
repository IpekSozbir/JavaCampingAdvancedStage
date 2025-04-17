package day29_abstractClasses;

public abstract class C03_KuralciParent {

   /*
   Parent class'daki method1 ve method2'yi
   butun child class'lar kendilerine uyarlamak zorunda olsun
   method3 ve method4 icin bir sey demiyoruz

   klasik inheritance kurallarina uysunlar


   1- oncelikle kuralcı parentlar
   kendilerinin kuralci oldugunu deklare etmelidir
   bunun icin class deklarasyonuna abstract keyword eklenmelidir

   2- abstract class olan parent class'lar
   hangi methodlarin child class'lar tarafindan
   implement edilmesinin (kendilerine uyarlama) zorunlu olacagini belirler

   3- child class'larin implement etmesi zorunlu olacak methodlar
   abstract method haline getirilir

   abstract methodlar sadece kurali yazan cumleler gibidir
   standart bir method olmasina gerek yoktur

   4- abstract class'daki abstrac olmayan methodlar
   child class'lar tarafindan implement edilmek zorunda degildir
   klasik inheritance uygulamalrina tabidir

   5- abstract childclass'a sonradan abstract bir method eklenirse
   tum child class'lar bu yeni abstract methodu
   derhal kendilerine uyarlamak zorunda kalirlar

   Devam eden bir projede bu cok tavsiye edilmez
   cunku child clas'lar bu methodu uygulaiginda
   tum uygulamanin ozelliklerini etkileyebilir

   Bu sbeeple genllikle abstract yapilara sonradan eklenen methodlarin
   abstract method olmamasi tercih edilir


    */


    String str;
    String s;
    static int sayi = 10;

    // beni parent edinen child class method1'i kendine uyarlamak zorundadir
    public abstract void method1 ();


    public abstract void method2 ();

    public static void method3(){
        System.out.println("Parent method3");
    }

    public static void method4(){
        System.out.println("Parent method4");

    }

    public abstract int method5();

}
