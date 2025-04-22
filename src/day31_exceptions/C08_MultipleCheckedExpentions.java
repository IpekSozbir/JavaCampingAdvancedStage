package day31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C08_MultipleCheckedExpentions {

    public static void main(String[] args) {

        /*
        fileInputStream objesi olusturdugumuzda Java ya dosyayi bulamazsam dedi
        try catch ile sarmalayip FileNotFoundException'i kontrol altina aldik

        Ancak fileInputStream.read() yazdigimizda
        bu defa da IOException riski barindirdigi icin altini kirmizi cizdi

        IOException, FileNotFoundException'in parent'in oldugundan
        islem yaparken bu iliskiyi dikkate almaliyiz
        1- eger ikisini de ayri atch cumleleri ile yazacaksdak
        uste child exeption yazilmalidir

        2- eger ikisini ayri ayri yazmak istemezsek
        sadece parent olan IOException'i yazmamiz yeterli olacaktir
        Cunku IOException ikisini de kapsar



         */

        // notlar dosyasindaki yazilari konsolda yazdirin

        String dosyaYolu = "src/day31_exceptions/notlar.txt";
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(dosyaYolu);
            // dosyadaki yazilari konsolda yazdirin
            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya yolu hatali....");
        } catch (IOException e) {
            System.out.println("Dosyadaki degerler okunamiyor");
        }


    }
}
