package nestedClasses;

public class Local {

    public void run(){

        System.out.println("Local Run()  Çalıştı");

       class Yerel{
           private int a;
          public Yerel(int a){
              this.a=a;
          }

           public int getA() {
               return a;
           }

           public void setA(int a) {
               this.a = a;
           }



       }
        Yerel y = new Yerel(15);
        System.out.println("Local Sınıfı Çalıştı");
        System.out.println(y.getA());
    }


}
