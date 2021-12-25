package java101;

import java.util.Scanner;

public class TersUcgenFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Basamak Sayısını Girin: ");
        int basamak = scan.nextInt();


        for (int i = 1; i <= basamak; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= 2*basamak-(2*i-1); j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
