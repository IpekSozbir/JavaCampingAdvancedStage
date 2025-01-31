package day13_doWhileLoop_scope;

public class C05_Scope_LocalVariables {
    public static void main(String[] args) {

      String str = "Java candir" ;

       // sayi = 6; // cunku sayi method 1in scopeunda olusturulmus


        for (int i = 0; i <5 ; i++) {
            System.out.println(i+" ");
            String isim = "Ali Can";
            System.out.println(str);
        }


        // System.out.println(i);
       //System.out.println(isim); // cunku for loopun scopeunda olusturulmus disinda kullanilamaz

    }

    public static void method1 () {
       // System.out.println(str);

        int sayi = 5;
    }
}
