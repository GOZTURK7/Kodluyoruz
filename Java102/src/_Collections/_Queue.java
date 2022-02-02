package _Collections;

import java.util.*;

public class _Queue {

    public static void main(String[] args) {


        //  1) LİNKEDLİST ;

        /*
        LinkedList hem QUEUE  hem de LİST interface'inin özelliklerini kullanabiliyor.

        List sınıfından üretilirse List gibi Queue sınıfından üretilirse Queue gibi davranacak (Polymorphism)

        Queue : FİFO first in first out , ilk giren ilk çıkar  ancak Queue e Colliction ara yüzüdeki methodlar kullanılarak
        Fifo yapısı LIFO yapısı gibi kullanılabilir.

                                    METHODLARI :
        element() methodu kuyruğun başındaki verir ama onu kuyruktan atmaz, Queue boş ise 'NoSuchElementException' exception'ı fırlatır
        peek(): kuyrukta başındaki elemana ulaşmak için kullanılır. element()'den farkı eğer Queue boş ise null döndürür exception fırlatmaz
        add(eleman): parametrede verilen elemanı kuyruğa ekler işlemin başarısız olması durumunda hata fırlatır.
        offer(eleman): parametrede verilen elemanı kuyruğa ekler. işlemin başarısız olması durumunda null dönder.
        poll(): kuyruğun başındaki elemanı kuyruktan çıkarır. remove'dan farkı, Queue boş ise 'NoSuchElementException' fırlatmaz ama remover fırlatır.
        remove(): bir değer girmezsek en baştakini siler, bir obje girersek onu siler.

         */


        Queue<String> q = new LinkedList<>();
        q.add("Gökhan");
        q.add("Öztürk");
        q.add("Yusuf burhan");
        q.offer("Hatice"); // add gibi ama
        System.out.println(q.remove("Hatice"));
        System.out.println(q.element()); // Gökhan
        System.out.println(q.poll());
        System.out.println(q.peek());


        System.out.println(" *******************");

        Iterator<String> itr = q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        // 2)  PRIORITYQUEUE  ;

        System.out.println("************************ PRIORITYQUEUE ********************");

        PriorityQueue<String> q1 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }

        });

        q1.add("Gökhan");
        q1.add("Öztürk");
        q1.add("Ahmet");
        q1.add("Damla");


        for(String s : q1){
            System.out.println(s);
        }



    }


}
