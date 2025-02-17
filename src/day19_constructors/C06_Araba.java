package day19_constructors;

public class C06_Araba {

    String marka = "Toyota";
    String model = "Corolla";
    String renk = "Kirmizi";
    int yil = 2012;
    int fiyat = 3000;


    @Override
    public String toString () {
        return "Araba özellikler ==> " +
                " marka: " + marka +
                " model: " + model +
                " renk: " + renk +
                " fiyat: " + fiyat
                ;
    }
}
