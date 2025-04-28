package day35_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C07_DahaKarmasikNestedMap {

    public static void main(String[] args) {

       /*
                Asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }
         */

        Map< String, Object > rezervasyonMap = new HashMap<>();

        // Once icerdeki inner map'i olusturalim
        Map< String, String > bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");


        // Ana rezervasyon map'ine tum degerleri ekleyelim
        rezervasyonMap.put("firstname", "Ahmet");
        rezervasyonMap.put("lastname", "Bulut");
        rezervasyonMap.put("totalprice", 500);
        rezervasyonMap.put("depositpaid", false);
        rezervasyonMap.put("bookingdates", bookingdatesValueMap);
        rezervasyonMap.put("additionalneeds", "wi-fi");

        System.out.println(rezervasyonMap);
        // {firstname=Ahmet,
        // additionalneeds=wi-fi,
        // bookingdates={checkin=2024-07-21,
        //               checkout=2024-08-10},
        // totalprice=500,
        // depositpaid=false,
        // lastname=Bulut}

        // rezervasyonda fiyat 300'den buyuk mu
        int fiyat = (Integer) rezervasyonMap.get("totalprice");
        System.out.println(fiyat > 300); // true



        // Rezervasyon fiyati 400'den buyukse %10 indirim yapin
        if (fiyat > 400) {
            fiyat = fiyat*90/100;
            rezervasyonMap.put("totalprice", fiyat);
        }
        System.out.println(rezervasyonMap);


        // Kullanicinin ismi a ile basliyorsa %10 ekstra indirim yapin
        String isim = (String) rezervasyonMap.get("firstname");
        if (isim.startsWith("A")) {
            fiyat = fiyat*90/100;
            rezervasyonMap.put("totalprice", fiyat);
        }
        System.out.println(rezervasyonMap);


        // additionalneeds "breakfast" degilse 20 dolar daha indirim yapin
        if (! rezervasyonMap.get("additionalneeds").equals("breakfast")) {
           fiyat = fiyat -20;
            rezervasyonMap.put("totalprice", fiyat);
        }
        System.out.println(rezervasyonMap);


        // check-in tarihini yazdirin
        System.out.println(rezervasyonMap.get("checkin")); // null
        // checkin "bookingdates" key'ine ait value olan map'in icinde

        System.out.println(((Map<String, String>) rezervasyonMap.get("bookingdates")).get("checkin"));
        // 2024-07-21

        // check-out'u yazdirin
        System.out.println(((Map<String, String>) rezervasyonMap.get("bookingdates")).get("checkout"));
        // 2024-08-10


    }


}
