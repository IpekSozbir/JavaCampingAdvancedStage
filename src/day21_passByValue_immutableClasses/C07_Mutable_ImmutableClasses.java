package day21_passByValue_immutableClasses;

import java.util.Arrays;

public class C07_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        String str  = "Java candir";
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java candir

        String[] isimler = {"Esra", "Can", "Ruya"};

        isimler[1] = isimler[1].toUpperCase();

        System.out.println(Arrays.toString(isimler)); // [Esra, CAN, Ruya]


        /*
        Java'da bazi Class'lardan olusturulan objeler sonradan degistirilemez (immutable) (ör:String)


        ama bazi Class'lardan olusturulan objeler sonradan degistirilebilir (ör: arrays ve arrayList)

        immutable class'larda methodlarla yapilan degisiklikler KALICI OLMAZKEN
        mutable class'larda methodlarla yapilan degisiklikler KALICI OLUR

         */

        str = str.toUpperCase();

        String isim1 = "Ali";
        String isim2 = "Ali";
        String s = "A";
        String t = "li";
        String isim3 = s + t;
        System.out.println(isim1 == isim2); // true
        System.out.println(isim1 == isim3); // false
    }
}
