package _Collections;

import java.util.*;

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

        // 1)  ARRAY LİST ;

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




        // 2)  LINKEDLİST  ;

        System.out.println("************************ LINKEDLIST ********************");


        List<String> liste5 = new LinkedList<>();
        liste5.add("Gökhan");
        liste5.add("Öztürk");
        liste5.add("Java");
        liste5.add("102");


        Iterator<String> itr5= liste5.iterator();

        while(itr5.hasNext()){
            System.out.println(itr5.next());
        }

        /*
                                                LİNKEDLİST VE ARRAYLİST FARKLARI :

        Linked listler listelerden farkı listenin ortasına eleman ekleyip çıkarmak istersek ArrayListlere göre daha az maliyetli oluyor
        ArrayListler'de ortaya değer eklemek için add dediğimizde eklediğimiz index'in sağındakilerin hepsi sağa ötelenmesi gerekecek
        ancak burada Linked listler birbirine sıkı sıkıya yan yana bağlı olmadığı aradaki bağı kesip yeni değer ekleyip node'ları yeni değiştirmek yeterli

        ancak ArrayList'lerin de arama search mekanizmasının Linkedlistlerden daha iyi.

        EKLEME ÇIKARMA İŞLEMLERİNİ ÇOK YAPACAKSAK LİNKEDLİST KULLANIMI DAHA MANTIKLI OLACAKTIR ANCAK DAHA ÇOK ARAMA İŞLEMİ YAPACAKSAK
        O ZAMAN DA ARRAYLİST KULLANIMI DAHA MANTIKLI OLACAKTIR BUNA YAPILAN PROJENİN İHTİYACINA GÖRE YAZILIMCI KENDİ KARAR VERECEKTİR.

         */

        // 2)  VECTOR  ; (ÇOK ESKİ BİR YAPI)

        System.out.println("************************ VECTOR ********************");

        /*
        Vectorler senkrnize çalıştığı için maliyeti çok fazla, ayrıca çok eski kullanımdan kalkmadı ancak bunun yerine ArrayList kullanılıyor
        bunun hala kullanıldığı eski yazılımlar olduğu için bilsek iyi olur.
         */

        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2, "Bolu");

        System.out.println(vector.contains("Ankara"));

        Iterator<String> itr6 = vector.iterator();

        while (itr6.hasNext()){
            System.out.println(itr6.next());
        }

        for(String str1 : vector){

            System.out.println(str1);
        }

        // listlerdeki methodları burada da kullanabiliyoruz yukarıda görüldüğü gibi neredeyse aynı.














    }
}
