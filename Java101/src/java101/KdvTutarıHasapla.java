package java101;

import java.util.Scanner;

public class KdvTutarıHasapla {


    public static void main(String[] args) {
        double tutar=0;
        double kdvOran=0.18;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Tutar girin:");

        tutar = scan.nextInt();

        double kdvtutari = tutar * kdvOran;
        double kdvliTutar = tutar + kdvtutari;
        System.out.println("KDV'siz tutar: "+ tutar);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv tutarı : " + kdvtutari);
        System.out.println("Kdv'li tutar : " + kdvliTutar);



    }
}
