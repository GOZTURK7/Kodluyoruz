package generics;

public class Main {
    public static void main(String[] args) {

        // Generic Class 'Nullable' clası örneği

        int a = 12;
        String str = "abc";

        Nullable<Integer> n =  new Nullable<>(10);
        n.run();

        Nullable<String> n1 =  new Nullable<>(str);
        n1.run();


        // Generic Class 'Test' clası örneği
        int a1 = 10;
        String b = "patika";
        double d = 3.14;
        String c = "dev";


        Test<Integer, String, Double> t = new Test<>(a1, b, d);
        t.setObj2(c);
        t.showInfo();

        // GENERİC INTERFACE
        Student<String> stu = new Student<>();
        stu.insert("ABC");

    }
}
