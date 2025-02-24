package day22_immutableClasses_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) {

        LocalTime localTimeBaslangic = LocalTime.now();
        System.out.println("Loop'dan once localTime: " + localTimeBaslangic);
        // Loop'dan once localTime: 13:04:59.064311900

        // LocalTime class'i obje olusturdugumuz satir calistiginda
        // calistigi sistemdeki zaman bilgisini alir

        // olusturulan localTme objesi bir kronometre degil
        // olusturuldugu andaki degeri saklayan basit bir variable'dir


        for (int i = 0; i <10000000 ; i++) {
           String srt = ""+i+1;
        }

       LocalTime localTimeBitis = LocalTime.now();
        System.out.println("Loop'dan sonra localTime: " + localTimeBitis);
        // Loop'dan sonra localTime: 13:04:59.299165100

        System.out.println((localTimeBitis.getSecond() - localTimeBaslangic.getSecond()));


        // .get.. localTime degerindeki saat, dakika, saniye ve nanosaniyeyi bize getirir

        System.out.println(Duration.between(localTimeBaslangic,localTimeBitis)); // PT0.250845S

        System.out.println(localTimeBitis.withHour(20)); // saatini degistirir
        System.out.println(localTimeBitis.withMinute(0)); // dakikasini degistirir
        System.out.println(localTimeBitis.withSecond(0).withNano(0)); // saniye ve nanosaniyeyi degistirir

        // .with.. methodlari localTime degerindeki saat, dakika, saniye veya nanosaniyeyi istedigimiz deger olarak ayarlar

        System.out.println(localTimeBitis.plusHours(29).plusMinutes(17));

        System.out.println(localTimeBitis.minusHours(217));

        // .plus.. veya . minus... localTime degerindeki saat, dakika, saniye veya nanosaniyeyi
        // istedigimiz deger kadar ileri veya geriye alir

        System.out.println(localTimeBaslangic.toSecondOfDay());
        // gunun baslangıcı olan 00:00'dan localTimeBaslangicina kadar gecen toplam saniye
        System.out.println(localTimeBaslangic.toNanoOfDay());
        // gunun baslangıcı olan 00:00'dan localTimeBaslangicina kadar gecen toplam nanosaniye


        // yukardaki loop islem suresini baslangic ve bitis saniyeleri ile bulalım

        System.out.println(localTimeBitis.toSecondOfDay()-localTimeBaslangic.toSecondOfDay());

        // yukardaki loop islem suresini baslangic ve bitis nanosaniyeleri ile bulalım

        System.out.println(localTimeBitis.toNanoOfDay()-localTimeBaslangic.toNanoOfDay());




    }
}
