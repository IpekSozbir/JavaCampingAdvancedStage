package day32_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,8,1,3,4));

        // verilen listedeki tum elementleri index kullanmadan iki artirin

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {

            lit.set( (Integer)lit.next()+2);
        }
        System.out.println(sayilar);

        // Listede var olan her elementten sonra elementin bir fazlasi degere sahip
        // yeni bir element ekleyin

        lit = sayilar.listIterator();

        while (lit.hasNext()) {
            lit.add((Integer)lit.next()+1);
        }
        System.out.println(sayilar);


    }
}
