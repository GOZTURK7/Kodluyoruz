package ComparatorInterface_Calısması_Youtube;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Peoples> arr = new ArrayList<>();

        arr.add(new Peoples("Gökhan", "Öztürk", 33));
        arr.add(new Peoples("Yusuf", "Burhan", 3));
        arr.add(new Peoples("Hatice", "Köse", 34));


        System.out.println("*******************YAŞA GÖRE SIRALAMA COMPARATORÜ********************");

        System.out.println("Before Sortign: "+arr.toString());
        Collections.sort(arr, new ComparatorPeopleAge());
        System.out.println("After Sorting: "+arr.toString());

        System.out.println("*******************İSME GÖRE SIRALAMA COMPARATORÜ********************");

        System.out.println("Before Sortign: "+arr.toString());
        Collections.sort(arr, new ComparatorPeopleName());
        System.out.println("After Sorting: "+arr.toString());
    }
}
