package day20_constructorCall_staticKeyword;

public class C04_StaticBlocks {

    /*
    static blocklar class calismaya baslarken
    her seyden hatta main methoddan bile once calisir

    static bloklarin yeri onemli degildir
    en altta da olsa ilk onlar calisir

    birden fazla static block varsa kendi iclerinde once ustteki calisir
     */

    C04_StaticBlocks () {
        System.out.println("Constructor calisti");
    }



    public static void main(String[] args) {
        System.out.println("main method calisti");
        C04_StaticBlocks obj = new C04_StaticBlocks();
        C04_StaticBlocks obj2 = new C04_StaticBlocks();

    }

    public static void method1 () {
        System.out.println("method calisti");
    }


    static {
        System.out.println("static block1 calisti");
    }

    static {
        System.out.println("static block2 calisti");
    }

    {
        // obje olusturulmadan yapilacak ayarlamalar icin kullanilir
        // her constructor calismasindan once static olmayan block calisir

        System.out.println("static olmayan kod blogu calisti");
    }

}
