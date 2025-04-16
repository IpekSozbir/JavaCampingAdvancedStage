package day28_overridingPolymorphism;

public class C02_Child extends C01_Parent {

    public void method1(int a) {  // method1 int


   /*
    Ayni class'da
    ayni signature'a sahip 2 method olusturamayiz

    Override edebilmek icin methodlarin child class'da olmasi
    ve parent class'daki method ile ayni signature'a sahip olmasi gerekir

    Override etme yani child'in method'u kendine uyarlamasi
    method body'sini degistirerek olur

     */

    }

    public void method2 () {
        // overridding yaparken esas olan signature'in ayni olmasidir
        // ancak signature'a dahil olmayan
        // return type ve access modifier icin de kurallar vardir

    }

    @Override
    public void method3() {
        // @Override notasyonunu kullanmak mecburi degildir
        // Ancak kullanmak faydalidir
        // bu notasyon parent class'daki override edilen methodu takip eder
        // ve method silnir veya signature'i degistirilirse CTE verir
        // bu notasyon kullanilmadiysa
        // overriding method, overridden method'u takip etmez
        // silinir veya signature'i degistirilirse
        // override etmeden yoluna devam eder
    }

    @Override
    public void method4() {
        super.method4();
        // Normal sartlarda overriding method ve overridden methoddan sadece biri calisir
        // yani en gunceli hangisiyse o calisir
        // Ama yazdigimiz kod geregi ikisinin de calismasini istersek
        // child class'da super.method4(); yazabilirsiniz
    }

    public static void method5 () {
        // static methodlar override edilemez
        // biz manuel olarak aynisini yazsak da Java bunlari override olarak kabul etmez
        // birbiriyle ilgisi olmayan iki farkli method kabul eder
    }

    public final void method66 () {
        // overridden method is final
        // final method, override edilemeyen method demektir
        // signature'i ayni olan bir method yazsak da
        // Java CTE verir
        // ve final method override edilemez diye bizi uyarir

    }

    private void method7 () {
        // parent class da olsa private class uyelerine baska class'dan ulasmak mumkun olmadigi icin
        // biz ayni methodu child class'da olustursak da
        // Java bunlari bagimsiz methodlar olarak kabul eder
        // override olarak iliskilendirmez
    }

    public void method8 () {
        // child class'daki overriding methodun access modifier'i
        // parent class'daki overridden method'un access modifier'indan daha kisitlayici olamaz
        // overridden method default access modifier oldugundan
        // bu method default, protected veya public access modifierli olabilir
    }

    public int method9 () {
        // overridden method'un return type'i
        // primitive veya void ise
        // overriding methodun da ayni olmalidir
        return  0;
    }

    public String method10 () {
        // return type non-primitive ise
        // child class'daki method'un return type'i
        // ya parent class'daki methodun return type'i ile ayni olmalidir
        // yada onun child'i olmalidir (Object-String)
        // buna Covariant data turu denir
        return "";
    }
}
