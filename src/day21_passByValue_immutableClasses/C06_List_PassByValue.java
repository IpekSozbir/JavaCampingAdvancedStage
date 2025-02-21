package day21_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu","Dilan","Bahadir","Arya"));
        birIsimEkle(isimler); // methodda listenin yeni hali: [Cansu, Dilan, Bahadir, Arya, Ipek]

        System.out.println("main methodda method call'dan sonra isimler: " + isimler);
        // main methodda method call'dan sonra isimler: [Cansu, Dilan, Bahadir, Arya, Ipek]

        yeniListeOlustur(isimler); // 2. methodda listenin yeni hali: [Selen]

        System.out.println("main methodda 2. method call'dan sonra isimler: " + isimler);
        // main methodda 2. method call'dan sonra isimler: [Cansu, Dilan, Bahadir, Arya, Ipek]
    }


    // verilen isimler listesine kullanicidan bir isim isteyip ekleyin
    // ve yeni halini yazdirin

    public static void birIsimEkle (List<String> isimler) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen listeye eklenecek bir isim giriniz: ");
        isimler.add(scan.nextLine()); // element atandi

        System.out.println("methodda listenin yeni hali: " + isimler);

    }

    // verilen isimler listesine yeni bos bir liste atayan
    // sonra kullanicidan bir isim alip listeye ekleyen
    // ve listenin son halini yazdiran bir method olusturan

    public static void yeniListeOlustur (List<String> isimler) {
        isimler = new ArrayList<>(); // isimler listesinin kendine atama yapildi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen listeye eklenecek bir isim giriniz: ");
        isimler.add(scan.nextLine());

        System.out.println("2. methodda listenin yeni hali: " + isimler);
    }
}
