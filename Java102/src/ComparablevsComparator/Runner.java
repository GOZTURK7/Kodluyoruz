package ComparablevsComparator;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        Collections.sort(laps); // Java buraya int'lardan oluşan bir liste atarsak sıralıyor veya String'lerden oluşan bir liste attığımızda da sort ediyor
                                // ancak buraya ben kendi oluşturduğum Laptop data tipindeki Lapotplardan oluşan bir liste attığımda complain ediyor şikayet ediyor
                                // çünkü bunu anlamıyo neye göre sırlayacağım diyor marka'ya göre mi ram'e göre mi price' a göre mi? işte burada yapmamız gereken
                                // Laptop classını 'public class Laptop implements Comparable<Laptop>' şeklinde buraya implement etmek ve sonrasında
                                // bu interfaceden compareTo() methodunu override edip özelleştireceğiz aşağıdaki gibi,


    for(Laptop l : laps){
        System.out.println(l);           /* Laptop{brand='Apple', ram=8, price=1200}
                                            Laptop{brand='Acer', ram=12, price=700}
                                            Laptop{brand='Dell', ram=16, price=800}
                                         */
    }



    /*
            ŞİMDİ SIRA COMPARATOR DE COMPARABLE VARKEN NEDEN COMPARATOR KULLANALIM :

                1) EĞER BİR HERHANGİ BİR İNTERFACE'E İMPLEMENTS OLAN BİR CLASSIMIZ YOKSA
                        (bu durumda sort edemeyiz bu class tipinden bir listedeki verileri)
                2) İKİNCİ DURUMDA COMPARABLE İNTERFACE'İNE İMPLEMENTS OLMUŞ BİR CLASSIMIZ OLABİLİR VE COMPARETO METHODUNU
                    OVERRİDE EDEREK RAM'E GÖRE SIRALAYABİLİRİZ AMA EĞER MARKA'YA GÖRE VEYA FİYATA GÖRE DE SIRALAMAK İSTERSEM NE
                    OLACAK O ZAMAN İKİ KERE OVERRİDE EDEMEM BU DURUMDA HER DEĞİŞKEN İÇİN AYRI BİR COMPARATOR CLASS'I OLUŞTURUP
                    ORADA AYNI MANTIĞI İŞLETİCEZ YANİ PRİCE'A GÖRE SIRALAYACAK AYRI BİR CLASS OLUŞTURUP ONUN İÇİNDE COMPARATOR'E İMPLEMENTS
                    EDİCEZ VE ONUN İÇİNDE COMPARE() METHODUNU OVERRİDE EDİCEZ AMA BU DURUMDA RUNNER CLASSTA 'Collictions.sort(arr, comparator) şeklinde
                    bir sort kullanacağız.
     */


        Comparator<Laptop> com = new Comparator<Laptop>() { // BURADA ANONYMOUS CLASS KULLANDIK YENİ BİR CLAS AÇMAK YERİNE COMPARATOR İÇİN;
            @Override
            public int compare(Laptop l1, Laptop l2)
            {
                if(l1.getPrice() > l2.getPrice()) return 1;
                if(l1.getPrice() < l2.getPrice()) return -1;
                return 0;
            }
        };


        Collections.sort(laps, com); // BURASI ÖNEMLİ BURAYA ANONYMİOUS CLASSTAN ALDIK.

        System.out.println("**********************************************");
        for(Laptop l : laps){
            System.out.println(l);       /* Laptop{brand='Acer', ram=12, price=700}
                                            Laptop{brand='Dell', ram=16, price=800}
                                            Laptop{brand='Apple', ram=8, price=1200}
                                         */
        }


        /*
                NOTE : ÖNEMLİ !!!!!!!!!!!!!!!
                TÜM HALİHAZIRDA VAR OLAN CLASSLAR İNTEGER STRİNG VB. HEPSİ COMPARABLE' INTERFACE'İNE İMPLEMENTS EDİYORLAR
                BU SEBEPLE BU VARİABLE'LARI SORT ETTİĞİMİZDE BUNLARIN KENDİ MANTIKLARI DEFAULT OLARAK ÇALIŞIYOR AMA KENDİ
                OLUŞTURDUĞUMUZ BİR CLASS İÇİN BU ŞEKİLDE SORT MANTIĞI OLUŞTURUP VERMELİYİZ Kİ JAVA NEYE GÖRE SORT EDECEĞİNİ
                BİLSİN
         */




    }
}
