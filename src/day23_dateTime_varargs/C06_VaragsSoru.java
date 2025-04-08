package day23_dateTime_varargs;

public class C06_VaragsSoru {
    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam degeri ile ilk sayinin carpimini yazdiran bir method olusturun


        islemYap(1,2,3); // islem sonucu: 5
        islemYap(5); // 0

        // varargs'a hic eleman atamasak da varargs bos bir array olur ve CTE olusmaz



        // islemYap();
        // varargs bos kalabilir ama a'ya deger atamak zorundayiz

    }


    public static void islemYap (int a,int... v) {
        int toplam =0;
        for (int each : v ) {
            toplam += each;
        }
        System.out.println("Islem sonucu: " + toplam*a);
    }
}
