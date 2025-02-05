package day15_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz Array'in kac elmentten olusacagini giriniz: ");
        int arrayLenght = scan.nextInt();

        int[] sayilar = new int[arrayLenght];

        for (int i = 0; i <arrayLenght ; i++) {

            System.out.println("Lutfen arraye konulacak elemanlari giriniz");
            sayilar[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(sayilar));
    }

    // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun

    public static int[] arrayOlustur () {
        // method signature = methodIsmi + parametrelerin data turu
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz Array'in kac elmentten olusacagini giriniz: ");
        int arrayLenght = scan.nextInt();

        int[] sayilar = new int[arrayLenght];


        for (int i = 0; i <arrayLenght ; i++) {

            System.out.println("Lutfen arraye konulacak elemanlari giriniz");
            sayilar[i] = scan.nextInt();
        }
        return sayilar;

    }

    public static String[] stringArrayOlustur () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz Array'in kac elmentten olusacagini giriniz: ");
        int arrayLenght = scan.nextInt();
        scan.nextLine(); // dummy kod

        String[] metinler = new String[arrayLenght];


        for (int i = 0; i <arrayLenght ; i++) {

            System.out.println("Lutfen arraye konulacak metinler giriniz");
            metinler[i] = scan.nextLine();
        }
        return metinler;
    }
}
