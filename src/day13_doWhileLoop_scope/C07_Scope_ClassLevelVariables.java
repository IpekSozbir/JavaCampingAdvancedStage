package day13_doWhileLoop_scope;

public class C07_Scope_ClassLevelVariables {

    /*


    Class Level'da olusturulan variable'larin sope'u tum class'dir
    yani her yerden kullanilabilir olmali

    AMA direkt kullanibilir olmasi static keyworde baglidir
   - static variablelar her yerde direkt kullanilabilir
   - instance variablelar static olmayan variablelardan direkt kullanilabilir
   AMA instance bir variable'i
    static method'dan direkt KULLANİLAMAZ, obje olusturup kullanmamiz gerekir

     */

    public String str = "Java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi = true;
    public static boolean aktifMi;
    public static char ilkHarf = 'A';
    static char karakter;

    public static void main(String[] args) {

        System.out.println(isim); // deger atanmamis ==> null
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(ilkHarf);
        System.out.println(karakter);

        C07_Scope_ClassLevelVariables obj = new C07_Scope_ClassLevelVariables();

        System.out.println(obj.emekliMi);
        System.out.println(obj.str);
        System.out.println(obj.numara);
    }
}
