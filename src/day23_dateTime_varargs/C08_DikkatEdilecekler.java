package day23_dateTime_varargs;

public class C08_DikkatEdilecekler {
    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // sonuncusu haric geriye kalanlari toplayip
        // bulunan toplam deger ile son sayinin carpimini yazdiran
        // bir method olusturun

        islemyap(1,2,3,4,5); // 50

    }

    // public static void islemYap (int...v,int sonSayi) {
    // Varargs parameter must be the last in the list
    // varargs bir parametre varsa, sonda olmak zorunda
    // cunku vararg element almada sinir tanimaz, tum elementleri almak ister



    public static void islemyap (int ... v) {
   // vararg array altyapisi kullandigi icin
        // son elementi vararg icinde ayirabiliriz

        // varar'da son element haric, elementleri toplayin

        int toplam =0;

        for (int i = 0; i <= v.length-2 ; i++) {
           toplam +=  v[i];
        }
        System.out.println(toplam * v[v.length-1]);

    }
}


