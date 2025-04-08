package day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        // eger tarih ve zamani birlikte kullanmak isterseniz

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-10-23T11:13:37.927490900

        // tarih ve zamani istediginiz formatta yazdirabilirsiniz
        // once istediginiz formati hazirlamalisiniz
        // Javada istenen formati hazirlamak icin DateTimeFormatter Class'indan format olusturulmasi gerekir


         /*
            Eger tarih ve saati istediginiz bir form'da yazdirmak isterseniz
            once o formati olusturmalisiniz
            format olusturduktan sonra ldt'yi istenen formatla yazdirabilirsiniz
            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini
             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h
                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati
                 a yazarsak AM veya PM degerini yazar
         */






        // 23.10.2024 pazartesi
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d.M.YYYY EEEE");
        System.out.println(ldt.format(format1));
        // 23.10.2024 Çarşamba


        // 23/Ekim/2024 297.gun
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MMMM/YYYY DDD");
        System.out.println(ldt.format(format2) + ". gun");
        // 23/Ekim/2024 297



        // 08 / 05 / 24  ay / gun / yil'in son 2 rakami ay ve gun 2 basamakli olsun
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MM / dd / YY");
        System.out.println(ldt.format(format3));
        // 10 / 23 / 24


        // 8/5/2024 ay / gu / yil'in son 2 rakami ay ve gun tek basamakli olabilir
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("M / d / YY");
        System.out.println(ldt.format(format4));
        // 10 / 23 / 24

        LocalDateTime tarih = LocalDateTime.of(2009,3,7,5,4);
        System.out.println(tarih);
        // 2009-03-07T05:04

        System.out.println(tarih.format(format3)); // 03 / 07 / 09
        System.out.println(tarih.format(format4)); // 3 / 7 / 09



        // 10:19
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ldt.format(format5));
        // 11:44


        // 10:19 am
        DateTimeFormatter format7 = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(ldt.format(format7));
        // 12:04 ÖS



        // 08:23:24 saat, dakika, saniye hepsi 2 basamakli ve 24 saate gore
        DateTimeFormatter format8 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(ldt.format(format8));
        // 12:05:00


        // 8:3:24 saat, dakika, saniye hepsi tek basamakli olabilsin
        DateTimeFormatter format9 = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(ldt.format(format9));
        // 12:6:7

        // Wed Oct 23 3:20 PM
        DateTimeFormatter format10 = DateTimeFormatter.ofPattern("EEE MMM dd h:mm");
        System.out.println(ldt.format(format10));
        // Çar Eki 23 12:08

    }
}
