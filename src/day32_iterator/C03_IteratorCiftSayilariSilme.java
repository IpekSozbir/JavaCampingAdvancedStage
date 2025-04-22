package day32_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_IteratorCiftSayilariSilme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,3,5,6,7,8));

        System.out.println(sayilar);

        // index kullanmadan sayilar listesindeki cift sayilari silin

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {

            Integer sayi = (Integer) itr.next();

            if (sayi % 2 == 0 ) {
                itr.remove();
            }

        }
        System.out.println(sayilar);

    }
}
