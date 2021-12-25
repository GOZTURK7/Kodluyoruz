package java101;

import java.util.Scanner;

public class ElmasForIle {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Kaç Satırlık olsun:");
        int row = scan.nextInt();

        for (int i = 1; i<=row; i++){

            for (int j = 1; j <= (row-i); j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
        for (int k = 1; k <= (row-1); k++) {

            for (int l = 1  ; l <= k; l++) {

                System.out.print(" ");
            }

            for (int m = 2*(row-1)-(2*k-1); m >= 1; m--) {

                System.out.print("*");
            }
            System.out.println();

      }








    }
}
