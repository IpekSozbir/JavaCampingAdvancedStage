package day14_scope_arrays;

public class C05_Lenght {
    public static void main(String[] args) {

        String str = "Java Candir";

        int [] arr = {3,5,7,9,1,2};

        System.out.println(str.length()); // 11 // yaninda parantez var yani method
        System.out.println(arr.length); // 6

        // String'in son karakterini yazdir

        System.out.println(str.charAt(str.length() - 1)); //r

        // arr'in son elementini yazdir
        System.out.println(arr[arr.length-1]); //2

        // String'in sondan 3. elementini yazdirin
        System.out.println(str.charAt(str.length() - 3)); // d

        // arr'nin sondan 3. elementini yazdirin
        System.out.println(arr[arr.length - 3]); //9
    }
}
