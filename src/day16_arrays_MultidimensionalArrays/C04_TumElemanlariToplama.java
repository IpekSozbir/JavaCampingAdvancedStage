package day16_arrays_MultidimensionalArrays;

public class C04_TumElemanlariToplama {

    public static void main(String[] args) {

        int[] sayilar = {3,6,9,1};

        // Array'in tum elementlerinin toplamini yazdirin
        int toplam = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam += sayilar[i];
        }
        System.out.println("Elementlerin toplami: " + toplam);


        int[][] arr = {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        // Array'in tum elementlerinin toplamini yazdirin

        toplam = 0;

        for (int i = 0; i <arr.length ; i++) { // dıs loop outer array'deki inner array'leri kontrol eder

            for (int j = 0; j <arr[i].length ; j++) { // her bir inner array'deki elementleri kontrol eder

                toplam += arr[i][j];
            }
        }
        System.out.println("Elementler toplami: " + toplam);

        // eger iki katli bir arrayde TUM ELEMENTLERI gozden gecirmemiz gerekiyorsa
        // yukardaki iki katli loop'u satndart olarak kullanabiliriz
    }
}
