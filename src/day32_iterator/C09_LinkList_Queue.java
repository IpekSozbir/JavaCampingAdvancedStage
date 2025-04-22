package day32_iterator;

import java.util.LinkedList;
import java.util.Queue;

public class C09_LinkList_Queue {

    public static void main(String[] args) {

        /*
        Queue (kuyruk/sira)

        yeni gelenler standart olarak sona eklenir
        cikacak olanlar is bas kisimdan cikarilir
        FIFO
         */

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);
        System.out.println(sayilar); // [20, 30, 10, 50]
        // kuyruk yapisindan dolayi araya ekleme yoktur

        sayilar.remove();
        // remove bize index verme hakki tanimiyor
        // kuyruk yapisi geregi bastaki elemani siliyor
        System.out.println(sayilar); // [30, 10, 50]

        System.out.println(sayilar.remove()); // 30

        System.out.println(sayilar); // [10, 50]

        Queue<Integer> sayilar2 = new LinkedList<>();

        // System.out.println(sayilar2.remove()); // NoSuchElementException
        // bos bir listede remove kullanilirsa exception olusur

        sayilar.poll();
       System.out.println(sayilar); // [50]
        // Queue'nun basindaki elemeni siler, element yoksa null doner

        System.out.println(sayilar.poll()); // 50

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);

        sayilar.offer(25); // [20, 30, 10, 50, 25]
        System.out.println(sayilar);
        // offer da siranin sonuna element ekler
        // add'de farki
        //listede bir kapasite sinirlarmasi yoksa
        // verilen elementi listeye ekler
        // sinir doluysqa exception firlatir


        System.out.println(sayilar.peek()); // 20
        // listenin basindaki elementi silmeden bize getirir, silmez
        // bos bir listede null doner

        System.out.println(sayilar.element());
        // listenin basindaki elementi silmeden bize getirir, silmez
        // peek'den farki bos listede exception firlatir

    }
}
