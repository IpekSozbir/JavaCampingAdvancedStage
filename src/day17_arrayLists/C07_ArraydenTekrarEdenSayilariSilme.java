package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {

        // Verilen bir arrayde tekrar eden bir sayi varsa
        // tekrar eden sayilari silip
        // arrayi her sayidan bir tane bulunacak sekilde kaydedin

        int[] arr = {2,4,5,2,4,2,2,4,2,4,3,5,1};

        List<Integer> tekrarsizList = new ArrayList<>();

        //Arraydeki tum elementleri gozden gecirip tekrarsizList'de yoksa ekleyelim


        for (int i = 0; i <arr.length ; i++) {
           if ( ! tekrarsizList.contains(arr[i]) )
               tekrarsizList.add(arr[i]);
        }

        Collections.sort(tekrarsizList); // List'i siralamak istersen
        System.out.println("Tekrarsiz liste: " + tekrarsizList);

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]  = tekrarsizList.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
