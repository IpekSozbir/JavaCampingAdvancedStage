package day27_inheritance;

/*
    Java bir variable'in degerini bulmak icin
     - once bulundugu scope'a bakar
     - scope'da yoksa class level'a bakar
     - class level'da da yoksa parent class(lar)'a bakar
     ve ilk buldugu degeri (en guncel) degeri kullanir

     this. veya super. kullanildi ise
     Java aramaya baslama noktasini degistirir
     this. denilmisse aramaya class level'dan,
     super. denilmisse aramaya parent class'dan baslar
     ve ilk buldugunu kullanir

     Java aramaya basladiktan sonra hep yukari dogru cikar
     bulursa kullanir bulamazsa CTE verir (geriye donuk arama yapmaz)
 */

public class C02_Child extends C01_Parent {

    String str = "Child class";
    String t = "Hande";
    String k = "Ahmet";
    public static void main(String[] args) {
        C02_Child obj = new C02_Child();
        obj.method1();
    }

    public void method1(){
        String str = "Child class method";
        String t = "Ceren";
        String z = "Okan";

        System.out.println(s); // Ipek
        System.out.println(this.s); // Ipek
        System.out.println(super.s); // Ipek

        System.out.println(k); // Ahmet
        System.out.println(this.k); // Ahmet
        //System.out.println(super.k); // CTE

        System.out.println(z); // Okan
        //System.out.println(this.z); // CTE
        //System.out.println(super.z); // CTE

        System.out.println(t); // Ceren
        System.out.println(this.t); // Hande
        //System.out.println(super.t); // CTE

        System.out.println(str); // Child class method
        System.out.println(this.str); // Child class
        System.out.println(super.str); // Java candir

    }


}
