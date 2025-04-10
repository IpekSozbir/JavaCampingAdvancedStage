package day24_stringBuilder_accessModifier;

public class P02_StringBuilder_methods {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Nice have a day");

        sb1.reverse(); // metni ters cevirir
        System.out.println(sb1);
        // yad a evah eciN

        sb1.reverse();
        System.out.println(sb1);
        // Nice have a day


        // isim ayni olsa bile String ve StringBuilder da uygulama farkli olabilir
        String str = "Wise";
        sb1.replace(0,4,str);
        System.out.println(sb1);
        // Wise have a day
        // replace methodu index alarak o araliktaki metni silip yerine istediginiz metni koyar


        sb1.delete(0,12);
        System.out.println(sb1);
        // day
        // belirtilen iki index araligindaki veriyi siler


        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);
        // da
        // deleteCharAt herhangi bir indexteki veriyi siler


        sb1.insert(sb1.length(),"y");
        System.out.println(sb1);
        // day
        // insert herhangi bir indexe verilen Stringi ekler


        sb1.insert(0,"Wise have a ");
        System.out.println(sb1);
        // Wise have a day
        // verilen indexten itibaren ilgili str degeri variable'a ekler


    }
}
