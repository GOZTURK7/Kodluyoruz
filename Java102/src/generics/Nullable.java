package generics;

public class Nullable <T> {
    /*
    NOTE : GENERİC BOUNDED TYPE  YANİ EĞER BURADA ALINACAK GENERİC PARAMETRELERE BİR SINIRLAMA GETİRMEK İSTERSEK
    'Nullable' class adının yanına extends diyerek alınacak parametre türlerini sınırlandırabiliriz şöyle ki;
    mesela Integer , Double , Float ---> Number Clasının alt sınıfları eğer biz

    public class Nullable <T extends Number> şeklinde yazarsak bu Nullable Clasından oluşturulacak obje için parametreyi bunlar
    dışında String bir ifade yazarsak kabul etmeyecek işte buna Generic sınırlama deniyor 'Generic Bounded Type'

     */

    private final T value;


    public Nullable(T value) {
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        }else{
            System.out.println(this.getValue());
        }

    }

}
