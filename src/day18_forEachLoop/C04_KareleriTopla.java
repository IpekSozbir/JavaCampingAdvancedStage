package day18_forEachLoop;

public class C04_KareleriTopla {

    public static void main(String[] args) {

        // Verilen int array’deki her elementin karesini alip
        // karelerinin toplamini yazdiran bir method olusturun

        int[] arr = {1,3,5,7,2};

        elementlerinKareleriToplami(arr);

    }



    public static void elementlerinKareleriToplami (int[] arr) {

        int toplam = 0;

        for (int each: arr) {
            toplam += each*each;
        }
        System.out.println("Array'deki elementlerin kareleri toplami: " + toplam);
    }



}
