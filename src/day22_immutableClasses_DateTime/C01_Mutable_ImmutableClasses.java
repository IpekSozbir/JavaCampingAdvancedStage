package day22_immutableClasses_DateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java candir"; // String class immutable

        str.toUpperCase();
        str.substring(5);
        System.out.println(str); // Java candir
        // Immutbale classlarda methodlarla yapilan değişiklikler kalici olmaz


        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu", "Asuman", "Hakan"));

        isimler.set(0, isimler.get(0).toUpperCase());
        isimler.add("Ipek");
        System.out.println(isimler); // [CANSU, Asuman, Hakan, Ipek]
        // Mutable classlarda methodlarla yapilan değişiklikler kalici olur
    }
}
