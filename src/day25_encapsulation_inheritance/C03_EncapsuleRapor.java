package day25_encapsulation_inheritance;

public class C03_EncapsuleRapor {

    private int satisTutari =0;

    public  void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;
    }

    //baska classlardan deger atamasi yapilabilsin - Write yetkisi  0K
    // ama atanmis degerleri kimse goremesin       - Read yetkisi  yasak

    private int toplamSatisTutari =0;
    // baska classlardan deger atamasi yapilamasin - Write yetkisi yasak
    // ama atanmis degeri gorebilsin               - Read yetkisi OK


    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
}
