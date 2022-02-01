package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _List {
    public static void main(String[] args) {

        /*
            En çok kullanılan collection.
            Listlere aynı Array'ler mantığı ile çalışır
            Veri ekleme ve çıkarmada da efektifdir.
            değerler index'lerde tutulur.
            ordered'dır  girildiği şekilde çıktı alırız
            Arraylerden birbirine tür dönüşümü de yapılabiliyor.
            null değer kabul eder (şu ana kadar sadece set'teki TeeSet null kabul etmiyordu.
            TEKRARLI DEĞER ALIYOR.
         */

        // ARRAY LİST ;

        System.out.println("************************ ARRAYLİST ********************");

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(4);
        liste.add(5);
        liste.add(null);


        // 1. YOL YAZDIRMAK İÇİN
        Iterator<Integer> itr = liste.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // 2. YOL YAZDIRMAK İÇİN
        System.out.println(liste); // [10, 1, 4, 5, null] girildiği sırayla çıktı veriyor indexlerle çalıştığı için


        System.out.println(liste.get(0)); // 10
        System.out.println(liste.get(3)); // 5

        System.out.println(liste.indexOf(null));  //6
        System.out.println(liste.indexOf(1));  // 1
        System.out.println(liste.lastIndexOf(1)); // 3

        liste.add(2, 15);
        System.out.println(liste);

        liste.set(7, 15);
        System.out.println(liste);

        System.out.println(liste.contains(10)); // true

        System.out.println(liste.remove(1)); // 1
        System.out.println(liste);

        List<String> liste1 = new ArrayList<>();
        liste1.add("Ankara");
        liste1.add("İstanbul");
        liste1.add("Amasya");
        liste1.add("Bolu");
        liste1.add("Siirt");

        System.out.println(liste1.remove(0)); // Ankara
        System.out.println(liste1); // [İstanbul, Amasya, Bolu, Siirt]


        List<String> liste2 = new ArrayList<>();
        liste2.add("İzmir");
//        liste2.addAll(liste1); //  [İzmir, İstanbul, Amasya, Bolu, Siirt]
        liste2.addAll(0,liste1);
        System.out.println(liste2); //  [İstanbul, Amasya, Bolu, Siirt, İzmir]


        List<String> liste3 = liste2.subList(3, 5); // 3 dahil 5 dahil değil indekstekileri alıyor [3, 5) gibi
        System.out.println(liste3); // [Siirt, İzmir]


        ////////  LİSTEYİ ARRAY'E ÇEVİRMEK İÇİN /////////////
        String[] str = liste3.toArray(new String[0]);
        System.out.println(str[0]);


















    }
}
