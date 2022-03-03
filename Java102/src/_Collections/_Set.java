package _Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _Set {

    public static void main(String[] args) {

        ////////////////// SET ///////////////

        //  A) HASHSET ;


        HashSet<Integer> hSet = new HashSet<>(); // bir boyut vermediğimiz için biz eleman ekledikçe genişleyecek boyutu array'den farkı
                                                // bu şekilde dynamic bir yapı sağlanmış olyor


        // NASIL VERİ EKLENİR HASHSET'E
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null); // null değer de atayabiliyoruz HasSet'lere
        // EKRANA BASTIRMAK İÇİN

        // 1) ITERATOR KULLANABİLİRİZ VEYA
        // 2) FOREACH KULLANABİLİRİZ.


        System.out.println("direkt"+hSet);



        //) 2) foreach
        for(Integer sayi : hSet){
            System.out.println(sayi); // 20 10 30 yazdırdı
            // 1) SIRA GARANTİSİ YOK dağınık verdi
            // 2) TEKRAR EDEN RAKAMLARI ALMAZ tekrar eden 10 rakamını bir kere aldı (SET) ÖZELLİĞİNDEN
            // 3) null DEĞERİNİ DE ATAYABİLİYORUZ HASHSET'LERE
        }


        // 1) ITERATOR İLE;
        Iterator<Integer> itr = hSet.iterator(); // HasSet'in içindeki iterator() ini alıp kendi ürettiğin Iterator'a atayıp benim üzerimde gezebilirsin diyoruz.
        // HasNext() bir sonraki eleman var mı kontrol ediyor
        // Next() bir sonraki değeri getiriyor bize

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        System.out.println(" ******************* LİNKEDHASHSET ***************************");

        /*
                                            B LINKEDHASSET ;

         HASHSET'ten farkı giren değer sırasıyla çıkıyor hashset'te garanti yoktu
        tek farkı bu yine tekrar eden değerler burada da yok
         */

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);

        Iterator<Integer> itr1 = lSet.iterator();
        while(itr1.hasNext()){
            System.out.println("LinkedHashSet Iterator: "+itr1.next()); // 10 20 30 ŞEKLİNDE çıktı verdi giriş sırasıyla çıktı verdi HashSet'ten farklı
            // olarak ama yine tekrar eden elementleri döndürmedi aynı şekilde.
        }

        System.out.println(" ******************* TREESET ***************************");

        /*
                                            C TREESET ;

         KENDİMİZ ÖZEL BİR SIRALAMA ŞEKLİ VERMEK İSTİYORSAK BUNU KULLANIYORUZ.
         null kabul etmiyor yukarıdakilerden farklı olarak
         */

        TreeSet tSet = new TreeSet();
        tSet.add(1);
        tSet.add(78);
        tSet.add(23);
        tSet.add(0);

        tSet.forEach(item->System.out.println(item)); // 0 1 23 78 şeklinde sıralı olarak yazdırdı işte TreeSet bunu sağlıyor
        // bizim girdiğimiz sıralama önemli değil sonuç olarak doğal sıralı olarak çıktı veriyor.

        System.out.println(" **********************************************");


        TreeSet tSet1 = new TreeSet();
        tSet1.add("Ali");
        tSet1.add("Veli");
        tSet1.add("Gökhan");
        tSet1.add("Yusuf Burhan");
        tSet1.add("Hatice");
        tSet1.add("Hatice");
        tSet1.add("Ali");
        tSet1.forEach(item->System.out.println(item)); // Ali Gökhan Hatice Veli 'Yusuf Burhan' şeklinde doğal sıralı verdi null kabul etmez, tekrarlı olmaz


        System.out.println(" **********************************************");

        // TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());


        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 60));

        for(Student stu : students){
            System.out.println(stu.getName());
        }
    }
}
