package day24_stringBuilder_accessModifier;

public class P01_StringBuilder {
    public static void main(String[] args) {
        
        
        StringBuilder sb1 = new StringBuilder();
        // 16 karakterli kapasiteye sahip bos bir StringBuilder olusturdum

        System.out.println("sb1 = " + sb1); // hiclik verir
        System.out.println("sb1'in uzunlugu = " + sb1.length()); // 0
        System.out.println("sb1'in kapasitesi = " + sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder(7);
        // 7 karakter kapasiteye sahip bir StringBuilder olusturdu

        System.out.println("sb2 = " + sb2); // hiclik verir
        System.out.println("sb2'in uzunlugu = " + sb2.length()); // 0
        System.out.println("sb2'in kapasitesi = " + sb2.capacity()); // 7
        // burada 7 karakterli girise kadar sorun olmaz
        // faakt 7'den bir tane daha fazla gerekirse
        // kapasite direkt (eski*2)+2 kadar otomatik yapilir

        sb2.append("IPEK SOZBIR");
        System.out.println("sb2 = " + sb2); // IPEK SOZBIR
        System.out.println("sb2'in uzunlugu = " + sb2.length()); // 11
        System.out.println("sb2'in kapasitesi = " + sb2.capacity()); // 16

        StringBuilder sb3 = new StringBuilder("DOGRU");
        System.out.println("sb3 = " + sb3); // DOGRU
        System.out.println("sb3'un uzunlugu = " + sb3.length()); // 5
        System.out.println("sb3'in kapasitesi = " + sb3.capacity()); // 21
        // Java bu sekilde olusturulan StringBuilderlarda 16+lenght kadarlik bir sb olusturur

        StringBuilder sb4 = new StringBuilder("Java");
        System.out.println("sb4 = " + sb4); // Java
        System.out.println("sb4'un uzunlugu = " + sb4.length()); // 4
        System.out.println("sb4'in kapasitesi = " + sb4.capacity()); // 20

        sb4.append(" ogrenen pisman olmaz.");
        System.out.println("sb4 = " + sb4); // Java ogrenen pisman olmaz
        System.out.println("sb4'un uzunlugu = " + sb4.length()); // 26
        System.out.println("sb4'in kapasitesi = " + sb4.capacity()); // 42

        long tcNO = 12356448254L;
        System.out.println( "tcNO =" + (tcNO+1) );

        StringBuilder tcNosb = new StringBuilder(11);
        // lenghtini kisitlamak, degismesinin onuna gecmek icin
        tcNosb.append("25698756984");
        System.out.println("tcNo =" + tcNosb);
        // append methodu ekleme yapiyor

        StringBuilder sb5 = new StringBuilder();
        sb5.append("Java");
        String str = "Guzeldir";

        sb5.append(str,0,4);
        System.out.println(sb5);
        // JavaGuze

    }
}
