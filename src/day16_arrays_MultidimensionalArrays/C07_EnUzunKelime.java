package day16_arrays_MultidimensionalArrays;

public class C07_EnUzunKelime {

    public static void main(String[] args) {

        String[][] arr = {{"Ali", "okula", "git"},{"Merhaba", "arkadaslar"},{"Bu","is","olacak"}};

        // iki katli array'deki en uzun kelimeyi yazdirin
        // Tum elementleri kontrol edecek miyiz? Evet. fori fori

        String enUzunKelime = arr[0][0];

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j].length() > enUzunKelime.length()) {
                    enUzunKelime = arr[i][j];
                }
            }
        }
        System.out.println("En uzun kelime: " +enUzunKelime);
    }
}
