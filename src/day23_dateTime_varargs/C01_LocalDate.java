package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2024-10-23


        LocalDate localDateJapan = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(localDate); // 2024-10-23

        LocalDate dogumGunu = LocalDate.of(1990,10,5);
    }
}
