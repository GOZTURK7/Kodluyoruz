package java101;

import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Armut Kaç kilo");
        int arm = scan.nextInt();
        System.out.println("elma Kaç kilo");
        int el = scan.nextInt();
        System.out.println("domates Kaç kilo");
        int dom = scan.nextInt();
        System.out.println("muz Kaç kilo");
        int mu = scan.nextInt();
        System.out.println("patlıcan Kaç kilo");
        int pat = scan.nextInt();

        double toplamTutar= arm*armut + el*elma + dom* domates + mu*muz + pat* patlican;

        System.out.println("Toplam Tutar: "+ toplamTutar);




    }
}
