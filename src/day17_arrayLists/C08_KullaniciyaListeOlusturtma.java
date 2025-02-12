package day17_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(stringListeOlustur());
    }



    public static List<String> stringListeOlustur () {
       
       List<String> isimler = new ArrayList<>();
       Scanner scan = new Scanner(System.in);

       String girilenIsim = "";

       // Dongu sayisi belli olmadıgı icin while
       // AMA en azindan kullanicidan bi deger alsin once dedigimiz icin do while

       do {
           System.out.println("Listeye eklemek icin isim giriniz.\nBitirmek icin q'ya basiniz");
           girilenIsim = scan.nextLine();
           if (! girilenIsim.equalsIgnoreCase("q")) {
               isimler.add(girilenIsim);
           }

       } while ( ! girilenIsim.equalsIgnoreCase("q") );

       return isimler;
    }
}
