package nestedClasses;

public class main {

    public static void main(String[] args) {


        Out out = new Out();
        out.run();


        // 1. way
        Out.In inner = out.new In();
        inner.run();

        // 2. way
        Out.In inner1 = out.getIn();
        inner1.run();




        Local l = new Local();
        l.run();



        Anonim a = new Anonim(){ // burada bu nesneye özel run metodunu override edip bu nesneye özgü özelleştirdik yani nesne oluşturma
            // yöntemini kullandıktan sonra {}; açarsak sanki Anonim classının içindeyiz de orada method veya variable üretiyoruz gibi düşünebeliriz
            // ama bu nesneye özgü olur yani burada oluşturduğumuz a nesnesine özgü.
            int a = 20; // BU NESNEYE ÖZGÜ ANONİM SINIFINA AİT A VARİABLE'I OLUŞTURABİLİRİZ
            @Override
            public void run(){
                System.out.println("Anonim olarak yazılmış run metdou !");
                System.out.println("Anonim Methodu int a = " + a);
                System.out.println("Anonim Classı Orjinal int a = " + this.a);  // yine a = 20 yazdı çünkü nesneye özgü a = 20 dedik,
            }

//            public void print(){
//                System.out.println("Print Metodu");  NOTE NESNE ÜZERİNDEN SIFIRDAN VAR OLMAYAN BİR METHOD OLUŞTURAMAYIZ
                                                    // VAR OLAN METHODU OVERRİDE EDEREK ÖZELLEŞTİREBİLİRZ ANCAK VARİABLE'LAR DA SIKINTI YOK
                                                    // ONLARI BURADA OLUŞTURABİLİRİZ,
//            }




        };
        a.run();
        //a.print();




    }


}
