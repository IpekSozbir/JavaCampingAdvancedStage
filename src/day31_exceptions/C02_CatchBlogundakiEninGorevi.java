package day31_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_CatchBlogundakiEninGorevi {
    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz...");

        int sayi1 = 0;
        int sayi2 = 0;
        try {
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("bolecek sayi 0 olamaz");
            } else {
                System.out.println(sayi1 / sayi2);
            }

        } catch (InputMismatchException e) {
            System.out.println("girilen deger tamsayi olmalidir");

            System.out.println(e.getMessage()); // null
            System.out.println(e.getCause()); // null
            e.printStackTrace(); // hem butun hatayi yazdirir hem de normal calismaya devam eder code 0 der
        }


        /*
        e yakalanan InputMismatchException hatasini kaydettigimiz variable'dir
        isminin e olmasi sart degildir
        ama genelde e kullanilir
        eger isterseniz hata bildirmek icin
        e ile bazi hazir methodlari kullanabilirsiniz

         */



    }
}
