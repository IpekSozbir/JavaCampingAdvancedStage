package day31_exceptions;

public class C04_TekTryMultipleCatch {
    public static void main(String[] args) {
        String str = "Java Candir";
        int [] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // verilen negatif olmayan bir sayiyi index olarak kabul edip
        // yukaridaki str ve arr'deki o indexte bulunan harfi ve sayiyi yazdirin
        // eger kullanici index'ten buyuk sayi girerse
        // hata mesaji ve son indexi yazdirin

        int index = 26;


        if (index<0) {
            System.out.println("Index negatif olamaz");
        } else {
            // 2. yontem : tke try multiple catch
            // 2 yontem de hatayi yakalar
            // asil amac kodun exception vermeden calismaya devam etmesi ise ikisi de olur
            // ama 1. yontem hata ayiklama icin daha elverisli


            try {
                System.out.println(arr[index]);
                System.out.println(str.charAt(index));

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index array'in sinirlari disinda, son element :" + (arr.length-1));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Index String'in sinirlari disinda, son element :" + (str.length()-1));
            }



        }
    }
}
