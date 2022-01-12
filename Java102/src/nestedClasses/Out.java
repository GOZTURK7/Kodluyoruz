package nestedClasses;

public class Out {
    int a = 5;

    public class In{

        int a = 10;

        public void run(){
            System.out.println("In sınıfına ait run metodu çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);

        }



    }


    public void run(){
        System.out.println("Out sınıfına ait run methodu çalıştı.");
        int a= 2;
        System.out.println(a);
        System.out.println(this.a);
        In in = new In();
        System.out.println(in.a);



    }


    public In getIn(){
        In in = new In();
        return in;
        //return new Out.In();
    }
}
