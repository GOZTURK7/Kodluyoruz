package Projects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>(1,2,3,4,5,6,7,8,9,10,11,12);
       // MyList<String> liste1 = new MyList<>("Ali", "ayşe", "mehmet","kamil");


        System.out.println(liste);
       // System.out.println(liste1);

       // System.out.println(liste1.getCapacity());
       // System.out.println(liste1.size());
        System.out.println(liste.getCapacity());
        System.out.println(liste.size());


        System.out.println(liste);


        Integer [] arr = {1, 2, 3, 4, 5, 6, null, null, null};

        Integer [] arr2 = Arrays.copyOf(arr, arr.length +10);

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("arr2 : " + Arrays.toString(arr2));








    }
}
