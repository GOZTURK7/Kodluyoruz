package generics;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

class Printer {
    //Write your code here


    public Printer() {

    }

    public <T> void printArray(T[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
            //Arrays.stream(value).forEach(System.out::println);

        }
    }


}



class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}