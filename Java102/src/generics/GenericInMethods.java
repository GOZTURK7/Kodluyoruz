package generics;

public class GenericInMethods {

    public static void main(String[] args) {

        String [] a = {"Java", "102", "Patika", "Dev"};
        Integer [] b =  {1, 2, 3, 4};
        Character [] c = {'J', 'A', 'V', 'A'};

//        for(String i : a){
//            System.out.println(i);
//        }
//
//
//        for(Integer i : b){
//            System.out.println(i);
//        }
//
//        for(Character i : c){
//            System.out.println(i);
//        }

        Print.printArray(a, b); // generic method ile yukarıdakinin aynısı hem de iki farkıl Type'daki array'i aynı anda yazdıran bir method yazabiliriz.
        System.out.println("========================");
        Print.printArray(b, c);
        System.out.println("========================");
        Print.printArray(c, a);


    }
}
