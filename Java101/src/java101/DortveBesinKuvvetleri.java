package java101;

import java.util.Scanner;

public class DortveBesinKuvvetleri {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Sayı Giriniz:");
        int num = scan.nextInt();

        for (int i = 1; i < num; i*=4) {

            System.out.print(i +" ");

        }
        System.out.println();

        for (int i = 1; i < num; i*=5) {

            System.out.print(i + " ");


        }





    }
}
