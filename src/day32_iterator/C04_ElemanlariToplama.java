package day32_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C04_ElemanlariToplama {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,3,5,6,7,8));


        // index kullanmadan listedeki tumm elementlerini yazdirin

        Integer sayi = 0;
        Integer toplam = 0;

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {

            sayi = (Integer) itr.next();
            toplam += sayi;

        }
        System.out.println(toplam);

    }
}
