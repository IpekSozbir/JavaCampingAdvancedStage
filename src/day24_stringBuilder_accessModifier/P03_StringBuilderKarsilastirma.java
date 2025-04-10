package day24_stringBuilder_accessModifier;

public class P03_StringBuilderKarsilastirma {
    public static void main(String[] args) {

        String str1 = "Murat";
        String str2 = "Murat";

        System.out.println(str1==str2); // true
        System.out.println(str1.equals(str2)); // true

        StringBuilder sb1 = new StringBuilder("Murat");
        StringBuilder sb2 = new StringBuilder("Murat");


        // ayni icerige sahip str1,str2,sb1,sb2'yi karsilastiralim
        System.out.println(sb1==sb2); // false
        // Java compli ve run ederken sorun cikarmaz ama hep false der buna
        System.out.println(sb1.equals(sb2)); // false
        // equals'in tek true verecegi hal sudur;
        System.out.println(sb1.equals(sb1)); // true

        // StringBuilder'larin metinsel esitligi compare() methodu ile karsilastirilir
        // karsilastirma sonucu 0 ise 2 sb birbiriyle aynidir
        // ikisinin compare() edilmesi sonucu 0 degil ise bu ikisinin esit olmadigini gosterir

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("java");
        StringBuilder sb5 = new StringBuilder("Tava");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("temu");

        System.out.println(sb3.compareTo(sb4)); // -32
        // karsilastirma baslarken ilk farkli karakterde durur ve karakterler arasi farki ASCII Table'da
        // J ile j arasinda fark 32 oldugu icin

        System.out.println(sb4.compareTo(sb3)); // 32
        System.out.println(sb5.compareTo(sb6)); // -4
        // ilk harf ayni ikinci harfler arası fark 4

    }
}
