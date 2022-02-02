package comparableInterface_Calısması_Kaynak_Youtube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    /*

    Bildirimi :         public interface Comparable<T>


    Bu arayüz, kendisini kılgılayan her sınıfın nesneleri üzerinde bir tümel total sıralama kurar.
    Bu sıralamaya sınıfın doğal sıralaması deniliri. compareTo() metoduna doğal sıralama metodu
    denilir...

    Bu arayüzü kılgılayan listeler ve arrayler, sırasıyla, Collections.sort() ve Arrays.sort() metotları
    ile sıralanırlar...

    Comparable Arayüzünün Metodu:
        int compareTo(T o)
        Verilen nesneyi parametredeki nesne ile mukayase eder.

        @param args

     */

    public static void main(String[] args) {

        ArrayList<People> arr = new ArrayList<>();

        arr.add(new People("Gökhan", "Öztürk", 33));
        arr.add(new People("Yusuf", "Burhan", 3));
        arr.add(new People("Hatice", "Köse", 34));

        System.out.println(arr.toString());
        Collections.sort(arr);
        System.out.println(arr.toString());




    }
}
