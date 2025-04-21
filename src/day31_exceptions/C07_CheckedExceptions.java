package day31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class C07_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        int sayi1 = 10;
        int sayi2 = 0;

        System.out.println(sayi1 / sayi2 );

        // String str = 10; // String bekliyor ama int atadik
       //  List<> sayilar = new ArrayList<>(); // Identifier expected

        int s;
        // System.out.println(s); // deger atamadin der
       //  say i+ 5 = 10; // variable expected der

        /*
        Exceptions temel olarak 2'ye ayrilir

        - RunTime'da ortaya cikan exception'lar ==> RunTimeExceptions, UnCheckedExceptions
           StringIndexOutOfBoundsExceptions
           ArrayIndexOutOfBoundsExceptions
           ArithmeticExceptions

        - Compile Time sirasinda farkedilenler ==> CheckedExceptions

        Biz bugune kadar alti kirmizi cizgili her seye CTE yada Compile Time Error dedik
        AMA alti kirmizi olan her kod hata degildir

        Ozellikle dosya okuma ve yazma islemlerinde
        Java exception olasiligini compile time da kontrol edip bize uyari verir
        Unhandled exception

        Compile Time exception'larda Java bize 2 alternatif sunar
        1- Java ile try catch yapabiliriz
           exception kontrol altina alinip e objesine kaydedilir
           ve kod normal calismaya devam eder

        2- Eger exception'i kontrol altina almak ist4emiyorsak
           (or, dosyaya ulasamiyorsak kodun calismay adevam etmesinin bir anlami kalmiyorsa)
           amacimiz sadece kirmizi cizgiyi kaldirip
           Class'i Run edilebilir hale getirmek ise
           sorumlulugu aldigimiz Java'ya soylemeli
           ve bu class'i sonradan kullanacak insanlari uyarmaliyiz
           Bunun ici n method signature'ina throws FileNotFoundException ekleyebiliriz




         */

        String dosyaYolu = "src/day31_exceptions/notlar.txt";
        /*
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            System.out.println("verilen dosya yolunda bir dosya mevcut degil");
        }

         */

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

    }
}
