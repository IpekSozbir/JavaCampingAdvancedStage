package day23_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        topla(5,7); // 12
        topla(3,4,5); // 12
        topla(1,2,3,4,5,6,7,8,9); // 45
        topla(); // 0

        // varargs parametre olarak kullanilmak icin tasarlamistir
        // methodlarin icinde zaten array kullanabiliyoruz
    }


     // public static void topla (int [] arr) // bunu kabul etmez cunku bu zaten public static void topla(int... a) ile ayni



    public static void topla(int... a) {
        //int... icine istedigimiz kadar int koyabilecegimiz bir array olan varargs'i ifade eder
        // var args
        // variety of arguments
        // argument sayilarinin farkli olabilmesi demek

        // a tum elementleri icine alan bir array olduguna gore
        // tum elementleri toplamak icin loop kullanilabilir

        int toplam = 0;
        for (int each : a ) {
            toplam += each;
        }

        System.out.println("Tum sayilarin toplami: " + (toplam));
    }

    public static void topla(int a, int b) {
        System.out.println("Iki tam sayinin toplami: " + (a+b));
    }
    public static void topla(int a, int b,int c) {
        System.out.println("Uc tam sayinin toplami: " + (a+b+c));
    }
}
