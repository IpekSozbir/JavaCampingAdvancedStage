package day32_iterator;

import java.util.*;

public class C05_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,8,1,3,4));

        // Listedeki tum sayilari index kullanmadan toplayip, sonra elemenlari silelim

        Iterator itr = sayilar.iterator();

        Integer toplam = 0;


        while (itr.hasNext()) {

            toplam += (Integer) itr.next();
           //  itr.remove(); bu da bi yontem

        } System.out.println(toplam);


        // Iterator konusunda dikkat etmemiz gereken en onemli konu iterator objesinin nerede oldugudur
        // yukarida while loop ile iterator'i sona kadar goturdugumuz icin
        // silmek icin tum elemanlari silme islemini ayni iterator ile yapamayiz
        // eger yeniden bastan sonantum elementleri elden gecirmek isterseniz
        // yeni ikinci bir iterator daha olusturmaliyiz

        itr = sayilar.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        System.out.println(sayilar);


        // Iterator sadece 3 method'a sahip oldugundan istenen islemleri yapmakta zorlaninca
        // Java Iterator'in Child Interface'i olan ListIterator'i olusturmustur

        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(2,5,7,8,1,3,4));

        ListIterator lit = sayilar2.listIterator();

        toplam = 0;

        while (lit.hasNext()) {
            toplam += (Integer) lit.next();

        }
        System.out.println(toplam);

        // list iterator'da ileri gidebildigimiz gibi geride gelebiliriz
        // ilk while loop'da sona kadar gittigimiz icin simdi sondan basa dogru loop olusturalim

        while (lit.hasPrevious()) {
            lit.previous();
            lit.remove();
        }
        System.out.println(sayilar2);


    }
}
