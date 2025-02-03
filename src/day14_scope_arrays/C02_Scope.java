package day14_scope_arrays;

public class C02_Scope {
    public static void main(String[] args) {

        /*
        static variablelarin en buyuk avantaji erisim kolayligidir
        - class icerisinden her yerden direkt ulailabilir
        - baska classlardan da ClassIsmi.staticVariableIsmi seklinde kolayca ulasilabilir

        static variablelarin en buyuk dezavantaji
        -ulasan herkesin degistirebilmesidir

         */

        System.out.println(C01_Hastane.hastaneIsmi); //Yildiz Hastanesi
        System.out.println(C01_Hastane.hastaneAdresi); // Yenimahalle
        System.out.println(C01_Hastane.bashekim); // Dr Ali

        C01_Hastane.bashekim = "Dr Oguzhan";

        System.out.println(C01_Hastane.bashekim); // Dr Oguzhan
    }
}
