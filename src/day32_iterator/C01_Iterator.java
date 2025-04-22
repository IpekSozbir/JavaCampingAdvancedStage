package day32_iterator;

import java.util.Arrays;

public class C01_Iterator {

    public static void main(String[] args) {

        /*
        Java index kullanmanin mumkun olmadigi durumlarda
        veya index kullanmak istemediginizde
        tum elementleri bize getirebilecek
        ve kalici degisiklik yapabilecegimiz
        Iterator interface'ini olusturmustur

         */

        int [] arr = {3,5,6};

        // array'in tum elementlerini 2 artirin

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += 2;
        }

        System.out.println(Arrays.toString(arr));

        // INDEX kullanmadan bu islemi yaparsak

        for ( int each : arr ) {
            each += 2;
        }
        System.out.println(Arrays.toString(arr));

        // each local oldugu icin array'e dongu disinda etki edemez

    }
}
