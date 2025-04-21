package day31_exceptions;

public class C09_BaziExceptionTurleri {
    public static void main(String[] args) {

        // 1 -StringInexOutOfBoundsExceptions
        // 2 -ArrayInexOutOfBoundsExceptions
        // 3- ArithmeticException
        // 4- FileNotFoundException
        // 5- IOException ==> tum dosya okuma ve yazma islemleri
        // 6- RunTimeException ==> Run Time da olusan tum exception'larin parent'i
        // 7- Exception ==> tum exceptionlarin parent'i
        // 8- NullPointerException
        String str = null;
        System.out.println(str); // null
        System.out.println(str + " candir"); // null candir
        System.out.println(str.length()); // NullPointerException

        // 9 - NumberFormatException
        String fiyat1 = "23.4"; // 23.4a dersek
        String fiyat2 = "41.2";
        // iki fiyatin toplamini yazdirin
        System.out.println(Double.parseDouble(fiyat1 )+ Double.parseDouble(fiyat2)); // 64.6

        // 10 - ClassCastException
        Integer sayi = 23;
        Object obj = sayi; // Object Integer'in parent'i oldugu icin kabul eder
                           // Integer IS - A Object

        String str1 = (String) obj; // Object HAS - A String  yazabildigimiz icin cast yapilabilir
        // System.out.println(str1);



    }
}
