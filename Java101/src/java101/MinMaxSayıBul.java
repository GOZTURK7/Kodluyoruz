package java101;

import java.util.Scanner;

public class MinMaxSayıBul {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        System.out.println("Kaç tane Sayı Gireceksiniz:");
        int kacSayi = scan.nextInt();
        System.out.println("Sayıları Giriniz:");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while (kacSayi>0) {
            int num = scan.nextInt();
            if(num > max) max = num;
            if(num < min) min = num;
            kacSayi--;
        }
        System.out.println("Max: "+max+ " Min: "+min);



    }
}
