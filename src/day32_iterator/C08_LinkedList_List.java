package day32_iterator;

import java.util.LinkedList;
import java.util.List;

public class C08_LinkedList_List {

    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        sayilar.hashCode();

        System.out.println(sayilar.hashCode()); // 1

        sayilar.add(10);
        sayilar.add(20);

        System.out.println(sayilar.hashCode()); // 1291



    }
}
