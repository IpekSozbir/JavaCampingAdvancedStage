package day23_dateTime_varargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2024-10-23

        localDate.getDayOfYear(); // bugun yilin kacinci gunu

        localDate.getDayOfWeek(); // gunlerden ne

       // get methodlari tarihin belirli bir bolumunu bize getirebilir

        localDate.withMonth(5); // 2024-05-23

        // with methodlari tarihin istedigimiz bolumunu degistirir

        // plus ve minus tarihe belirli bir sureyi ekleyebilir yada cıkarabilirsiniz

        localDate.plusWeeks(34).plusDays(11);

        localDate.minusMonths(15).plusDays(13);

        System.out.println(localDate.isLeapYear()); // artik yil mi

        // 1903 artik yil mi ?

        LocalDate tarih = LocalDate.of(1903,1,1);
        System.out.println(tarih.isLeapYear()); // false

    }
}
