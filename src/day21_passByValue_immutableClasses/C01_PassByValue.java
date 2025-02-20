package day21_passByValue_immutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
        Bir variable'i argument olarak kullanip baska bir methoda gonderdigimizde
        Java variable'in kendisini degil value'sunu(degerini) gonderir
         */

        String cumle = "Java her gun daha da guzellesiyor";
        uzunlukYazdir(cumle); // methodda "verilen cumlenin uzunlugu: 33" yazdirir
        buyukHarfeCevir(cumle);
        System.out.println("main methodda cumlenin son hali: "+ cumle);
        // main methodda cumlenin son hali: Java her gun daha da guzellesiyor




    }
    public static void uzunlukYazdir (String cumle) {
        // cumlenin uzunlugunu yazdirin
        // System.out.println(cumle.lenght());

        System.out.println("Verilen cumlenin uzunlugu: "+ cumle.length());
        /*
        cumle veriable'i main method icerisinde olusturuldugu icin local bir variable'dir
        Scope'u main methoddur ve main method disindan kullanilamaz

        Eger cumle variable'inin degerinin uzunlukYazdir methodunda kullanmak istersek
        parametre olarak yollayabiliriz
         */
    }

    public static void buyukHarfeCevir (String cumle) {
        cumle = cumle.toUpperCase();
        System.out.println("Method'da cumle: " + cumle);
    }
}
