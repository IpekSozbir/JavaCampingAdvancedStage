package day25_encapsulation_inheritance;

public class C05_GetterSetterBirlikteKullanma {

    public int sayiPublic = 10;
    // baska classlardan deger atama write yetkisi -OK
    // baska classlardan goruntuleme read yetkisi -OK

    private int sayiPrivate = 100;
    // baska class'lardan deger atama write yetkisi - direkt degil ama setter ile ok
    // baska class'lardan goruntuleme read  yetkisi - direkt degil ama getter ile ok

    public int getSayiPrivate() {
        return sayiPrivate;
    }

    public void setSayiPrivate(int sayiPrivate) {
        this.sayiPrivate = sayiPrivate;
    }
}
