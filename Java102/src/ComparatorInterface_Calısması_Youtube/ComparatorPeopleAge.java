package ComparatorInterface_Calısması_Youtube;

import java.util.Comparator;

public class ComparatorPeopleAge implements Comparator<Peoples> {

    /*
    Compares its two arguments for order. Returns a negative integer, zero, or a positive integer
    as the first argument is less than, equal to, or greater than the second.

            1)  İlk önce bir class oluşturuyoruz ve burada comparator interface'ine implenments ediyoruz yukarıdaki gibi
                ex: public class ComparatorPeopleAge implements Comparator<Peoples>  buradaki Peoples Comparator'den aldığımız
                methodun içine parametre olarak gidecek olan objelerin data type olacak

            2) daha sonra Comprataro interface'inden compare() methodunu @Override ediyoruz ki neye göre sıralayacağını
                özelleştirebilelim.

            3) burada dikkat etmemiz gereken şey ;

                    'Compares its two arguments for order. Returns a negative integer, zero, or a positive integer
                    as the first argument is less than, equal to, or greater than the second.'

               bu ifade çünkü comparator bu şekilde çalışıyor bu compare() methodu bir int değer dönmeli;
               bu değer ya negative, ya pozitive , yada sıfır olmalı ki sonucu parametre olarak verilen
               objeleri karşılaştırabilsin bunu sağlamanın birkaç yolu var aşağıda görüldüğü gibi;
     */

    @Override
    public int compare(Peoples o1, Peoples o2) {

//        return o1.getAge()-o2.getAge();   Bu şekilde de yazabiliirz Burada parametre olarak gelen objelerin yaşlarını birbirinden çıkarıyoruz ve sonuç
                                            // olarak döndürüyoruz bu şekilde de aşağıdaki mantığı sağlamış oluyoruz aslında uzun uzun yazmaktansa ;
        if(o1.getAge() > o2.getAge()){
            return 5;
        }else if(o1.getAge() < o2.getAge()){
            return -5;
        }
        return 0;
    }
}
