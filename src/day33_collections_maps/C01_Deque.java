package day33_collections_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList();

        // Deque ==> Double ended queue
        // kuyruk ama iki taraftan da ekleme cikarma yapabilirsin
        // butun method'larin ....first ve ... last'lari vardir

        deque.add(23);
        deque.addFirst(45);

        System.out.println(deque); // [45, 23]

        deque.addLast(34);

        System.out.println(deque); // [45, 23, 34]

        deque.removeFirstOccurrence(23); //en bastaki elemani degil, ilk 23'un kullanimini siler
        System.out.println(deque); // [45, 34] // ne olduguna bakmadan en bastaki elemani siler

        deque.push(67);
        System.out.println(deque); // [67, 45, 34]
        // deque'in basina ekleme yapar eger kapasite izin verirse
        // addFirst'ten farki bu


    }
}
