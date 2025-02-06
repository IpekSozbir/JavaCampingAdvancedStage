package day15_arrays;

import java.util.Arrays;

public class C07_ArrayMethodlar_Sort {

    public static void main(String[] args) {

        String[] isimler = {"Metin" , "MEte" , "metehan", "Mikail" , "Nevzat", "Yasar", "yakup", "Yaman"};

        // Array'i natural order'a gore duzenleyin ( dogal siralama)

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        /*
        not 1:
        natural order sayilar icin kucukten buyuge
        metinler icin ise sozluk siralamasina gore siralama demektir
        ancak javanin case sensitive oldugunu ve kucuk harflerin buyuk harflerden sonra geldigini unutmamaliyiz

        not 2:
        String'de method ile yapilan degisiklikler atama olmazsa kalici degisiklik olmaz
        ancak bu kural tum non-primitiveler icin gecerli degildir
        (ilerde bu konu detaylanacak)
        array ve arrayList'de method ile yapilan degisiklikler kalici olur
         */

    }
}
