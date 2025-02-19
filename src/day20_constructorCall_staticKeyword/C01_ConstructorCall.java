package day20_constructorCall_staticKeyword;

public class C01_ConstructorCall {

    C01_ConstructorCall () {
        System.out.println("Parametresiz constructor calisti");
    }


    C01_ConstructorCall (int sayi) {
        System.out.println("int parametreli constructor calisti");
    }

    C01_ConstructorCall (String str) {
        this(5); // constructor call icin this (ilgili parametre) kullanilir

        // this(); constructor call ILK SATIRDA OLMALIDIR
        //         bu sebeple 2 constructor call ayni yerde yapilamaz


        System.out.println("String parametreli constructor calisti");

    }




    public static void main(String[] args) {

        C01_ConstructorCall obj1 = new C01_ConstructorCall();
        // parametresiz constructor calisti

        C01_ConstructorCall obj2 = new C01_ConstructorCall(4);
        // parametresiz constructor calisti
        // int parametreli constructor calisti


        C01_ConstructorCall obj3 = new C01_ConstructorCall("Ali");



    }


    public static void C01_ConstructorCall () {
        System.out.println("method calisti");
    }

}
