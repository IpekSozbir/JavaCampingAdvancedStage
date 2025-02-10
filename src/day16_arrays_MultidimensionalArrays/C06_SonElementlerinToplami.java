package day16_arrays_MultidimensionalArrays;

public class C06_SonElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini yazdiran bir method olusturun.

        int[][] arr = {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        // tum elementleri elden gecirecek miyiz? Hayir. O zaman ic ice for loop'a gerek yok tek for loop

        int sonElementlerinToplami = 0;

        for (int i = 0; i <arr.length ; i++) {
            sonElementlerinToplami += arr[i][arr[i].length-1];

        }
        System.out.println("Son elementler toplami : " + sonElementlerinToplami);
    }
}
