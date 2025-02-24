package day22_immutableClasses_DateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class C05_FarkliLokasyonIcinSaat {

    public static void main(String[] args) {

        /*
        LocalTime class'i ile
        herhangi bir andaki local zamani kaydedebiliriz
        Herhangi bir anda her hangi bir zaman dilimindeki(ZoneId) zamani kaydedebiliriz
        Verilen 2 localtime arasindaki zaman dilimini bulabiliriz
        Localtime'dan
         - get methodlari ile zamanin istenen bolumunu alabilirim
         - with methodlari ile zamanin belirli bir bolumunu istedigim degerle degistirebilirim
         - plus methodlari ile zamani istedigimiz kadar ileri alabiliriz
         - minus methodlari ile zmanai istedigimiz kadar geri alabiliriz
        farkli zamanlari isAfter veya isBefore ile karsilastirabilirim
         */


        // su anda Japonya'daki saati yazdirin
        LocalTime timeJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(timeJaponya);
        // 19:32:53.595993400


        // su anda Londra'daki saati yazdirin
        LocalTime timeLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(timeLondon);
        // 11:32:53.598990900


        // su anda NewYork'daki saati yazdirin
        LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(timeNewYork);
        // 06:32:53.606985900


        // su anda Denver'daki saati yazdirin
        LocalTime timeDenver = LocalTime.now(ZoneId.of("America/Denver"));
        System.out.println(timeDenver);
        // 04:32:53.607986


        // saat 11:25:12:00000 icin local saat olusturun
        LocalTime localTime1 = LocalTime.of(11,25,12,0);

        // saat 02:29:19:00000 icin local saat olusturun
        LocalTime localTime2 = LocalTime.of(2,29,19,0);

        // aralarindaki sure farki
        System.out.println(Duration.between(localTime2, localTime1)); // PT8H55M53S

        System.out.println(localTime1.isAfter(localTime2)); // true
        System.out.println(localTime1.isBefore(localTime2)); // false
    }
}
