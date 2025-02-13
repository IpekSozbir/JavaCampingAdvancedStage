package day18_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        /*
        1- for loop :
        baslangic ve sonuc biliniyorsa veya tekrar sayisi biliniyorsa
        2- while loop :
        tekrar sayisi bilinmiyorsa
        3- do while loop :
        loop bodynin en az bir kere calismasini istiyorsak
        4- for each loop :
        cok ozel bir kullanim icin olusturulmustur
        ama o kullanimda da cok idealdir

        For-each loop birden fazla eleman barindiran yapilardaki
        tum elementleri siralama olmaksizin (index kullanmadan) bize getirir.
         */


        int[] arr = {3,4,5,2,3,4,5,1,2,3};
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,8,5,6,7,4,2,3,4,5,6,4,5,4,3));


        // arr'daki elementlerin toplamini yazdirin

        // sayilar listesindeki cift sayilari toplayin
        int toplam =0;
        for ( int each  : arr  ) {
            toplam += each;
        }
        System.out.println("Array'deki elementlerin toplami: " + toplam);


        toplam=0;
        for (Integer each :sayilar) {
            if (each % 2== 0) {
                toplam += each;
            }
        } System.out.println("Array'deki elementlerin toplami: " + toplam);

        // sayilar listesindeki  cift sayilari toplayin

        toplam = 0;

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 == 0){
                toplam += sayilar.get(i);
            }

        }

        System.out.println("Listedeki cift sayilarin toplami : " + toplam);

        toplam = 0;

        for ( Integer each : sayilar){

            if ( each % 2 == 0){
                toplam += each;
            }
        }
        System.out.println("Listedeki cift sayilarin toplami : " + toplam);
    }
}


