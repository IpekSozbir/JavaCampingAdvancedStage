package day32_iterator;

import java.util.Deque;
import java.util.LinkedList;

public class C10_LinkedList_Deque {

    public static void main(String[] args) {

        // Deque ==> Double Ended Queue ==> Iki uclu kuyruk

        Deque<Integer> sayilar = new LinkedList<>();
        System.out.println(sayilar.add(10)); // true
        sayilar.add(20);
        sayilar.add(60);
        sayilar.add(50);
        System.out.println(sayilar);

        // Deque double ended queue oldugundan hemen hemen butun methodlarin ...first ve ...last versiyonlari bulunur

        sayilar.addFirst(70);
        sayilar.addLast(90);
        System.out.println(sayilar); // [70, 10, 20, 60, 50, 90]


        sayilar.addFirst(20);
        sayilar.addLast(70);


    }
}
