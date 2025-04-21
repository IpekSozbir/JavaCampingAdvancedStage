package day31_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_TryCatchKullanimi {
    public static void main(String[] args) {

        // Kullanicidan iki tam sayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin

       /*
       Ongordugumuz problem if else ile cozulebiliyorsa cozeriz
       Eger if else ile cozulemezse try-catch blogu kullaniriz

       try blogu hata olusma riski olan kodlari calistirir
       try blogunu tek basina yazilmasi anlmasiz olur
       mutlaka catch ve/veya finaly blokları ile calismalidir

       catch keywordunun onundeki parantezde bulunan exception
       karsilasmayi bekledigimiz exception olmalidir

       (InputMismatchException e) bu kod su anlama gelir
       bu kod su anlama gelir
       try blogunda kodlari calistirirken
       InputMismatchException olusursa
       hata raporunu e objesine kaydet ve
       catch blogunu calistir
       catch () { }

       Try blogunda exception olusmazsa
       catch blogunun calismasina gerek olmaz
       Yangin yoksa yangin sondurme tupunu kullanmaya gerek yok




        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tam sayi giriniz...");

        int sayi1 = 0;
        int sayi2 = 0;
        try {
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("Bolecek sayi 0 olamaz");
            } else {
                System.out.println(sayi1 / sayi2);
            }

        } catch (InputMismatchException e) {
            System.out.println("Girilen deger tam sayi olmalidir");
        }
    }
}
