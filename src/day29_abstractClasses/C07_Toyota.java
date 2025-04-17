package day29_abstractClasses;

public abstract class C07_Toyota extends C06_Araba {

/*
bir class olusturdugumuzda
abstract olup olmamasina
o class'dan obje olusturulup olusturulmayacagina gore karar veririz

Toyota markasina sahip ama modeli olmayan
bir obje olmayacagi icin bu class'in abstract olmasi daha dogru olacaktir

abstract bir parent'in abstract olan child'i
parent class'daki abstract methodlari
implement etmek zorunda degildir

Ama isterse klasik inheritance kurallari cercevesinde
parent class'daki abstract methodlari override edebilir





 */

   //public abstract void motor ();
    // parent classdaki abstract method'u tekrar yazmaya gerek yok
    // ya yeni kurallar koyar yada var olan kurallari concrete yapip kendisine uyarlar

    public void motor () {
        System.out.println("Toyota araclar Toyota VVTI motoru kullanir");

    }

    public void guvenlik () {
        System.out.println("Toyota araclar AGS1001'e uyar");
    }


    public abstract void sesSistemi ();
    public abstract void direksiyon ();
    public void sunroof () {
        System.out.println("Toyota araclarda ozel Toyota sunroof kullanilir");
    }



}
