package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListOlusturma {

    public static void main(String[] args) {

        int [] arr = {3,5,6};
        String[] isimler = new String[5];
        // arr ve isimlerin data turu Array'dir. int ve String bu Array'lerin icine koyacagimiz elementlerin data turu.


       // List<String> metinler = new list(); olmaz!
        // list abstact bir yapi oldugundan direkt obje olusturulamaz

        List<String> harfler1 = new ArrayList<>();
        List<String> harfler2 = new ArrayList<String>();
        ArrayList<String> harfler3 = new ArrayList<>();
        // 3 sekilde de olur ama en cok en ustteki kullanilir

        List<Integer> sayilar =new ArrayList<>();
        System.out.println(sayilar);
        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar); // [4, 7, 9] sen ekledikce o da sona ekler

        sayilar.add(1,8);
        System.out.println(sayilar); // [4, 8, 7, 9]

        sayilar.add(0,3);
        System.out.println(sayilar); // [3, 4, 8, 7, 9]

        List<Integer> ekList = new ArrayList<>(Arrays.asList(20,30,40));
        // eger List olusturulurken konulacak elementler belli ise
        // Arrays class'indan asList() ile direkt eklenebilir
        System.out.println(ekList); //[20, 30, 40]

        sayilar.addAll(ekList); // direkt icine bir List'in tamamini eklemek istersek
        System.out.println(sayilar); // [3, 4, 8, 7, 9, 20, 30, 40]

       // String'de method ile yapilan degisiklikler atama olmazsa kalici degisiklik olmaz
        // Ama Array ve Array List icin boyle degil
        // method ile yapilan degisiklikler kalici olur
        // atama yapmaya gerek kalmaz
    }
}
