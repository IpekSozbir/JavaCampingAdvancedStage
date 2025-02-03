package day14_scope_arrays;

import java.util.Arrays;

public class C07_TumElementleiArtirma {
    public static void main(String[] args) {

        //Verilen bir int array’in
        // tum elemanlarini 2 artirip

        int [] arr = {3,7,0,2,4,6};

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += 2;
        }
        System.out.println(Arrays.toString(arr));

        arr = arrayinElementleriniArtir(arr,3);

        arr = arrayinElementleriniArtir(arr,-4);



    }

    //Verilen bir int array’in
    // tum elemanlarini verilen sayi artirip bize donduren bir method olusturun.
    // Eski array’i yeni haliyle kaydedin.

    public static int[] arrayinElementleriniArtir (int[] arr, int artisMiktari) {

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += artisMiktari;
        }
        return arr;
    }

}
