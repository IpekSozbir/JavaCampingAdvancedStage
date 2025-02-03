package day14_scope_arrays;

import java.util.Arrays;

public class C06_TumElementleriKullanma {
    public static void main(String[] args) {

        int[] sayilar = {4,7,1,3,4,8,0,1};

        // sayilar arrayini yazdirin
        System.out.println(Arrays.toString(sayilar));

        // sayilar array'inin tum elementlerini yanyana yazdir
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " ");
        }

        // sayilar arrayindeki tum elementlerin toplamini yazdirin
        int toplam =0;

        for (int i = 0; i < sayilar.length ; i++) {
           toplam += sayilar[i];
        }
        System.out.println("Tum elementlerin toplami: "+ toplam);


        // sayilar array'indeki cift sayilarin carpimini yazdirin
        int carpim =1;

        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]%2==0)
                carpim *= sayilar[i];
        }
        System.out.println("Cift elementlerin carpimi : " + carpim);
    }
}
