package day31_exceptions;

public class C03_MultipleTryCatch {
    public static void main(String[] args) {
        String str = "Java Candir";
        int [] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // verilen negatif olmayan bir sayiyi index olarka kabul edip
        // yukaridaki str ve arr'deki o indexte bulunan harfi ve sayiyi yazdirin
        // eg4er kullanici index't4en buyuk sayi girerse
        // hata mesaji ve son indexi yazdirin

        int index = 10;


        if (index<0) {
            System.out.println("index negatif olamaz");
        } else {
            // 1. yontem : ayri ayri try catch

            try {
                System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index array'in sinirlari disinda, son element :" + (arr.length-1));
            }

            try {
                System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Index String'in sinirlari disinda, son element :" + (str.length()-1));
            }





        } // else sonu

        System.out.println(str.charAt(index));
        System.out.println(arr[index]);
    }
}
