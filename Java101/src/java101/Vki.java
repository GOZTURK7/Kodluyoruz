package java101;

import java.util.Scanner;

public class Vki {

    public static void main(String[] args) {

        double kilo, boy, vki;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu giriniz: ");
        kilo = scan.nextDouble();
        System.out.println("Lütfen Boyunuzu m cinsinden giriniz: ");
        boy=scan.nextDouble();

        vki = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+ vki);



    }
}
