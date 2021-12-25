package java101;

import java.util.Scanner;

public class DaireninAlanıveCevresi {

    public static void main(String[] args) {

        double pi=3.14, cevre, alan, r, acı;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dairenin Yarıcapını giriniz:");
        r = scan.nextDouble();
        System.out.println("Lütfen Daire Diliminin Açısını giriniz:");
        acı = scan.nextDouble();

        alan = (pi*(r*r)*acı)/360;
        cevre = 2*pi*r;
        System.out.println("Dairenin Cevresi: "+ cevre);
        System.out.println("Daire diliminin alanı: "+ alan);


    }
}
