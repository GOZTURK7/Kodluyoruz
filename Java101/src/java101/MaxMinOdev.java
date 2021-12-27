package java101;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinOdev {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("bir Sayı girin:");
        int num = scan.nextInt();

        int arr [] = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr, num);
        int indexKucukYakın= -index-2;
        int indexBuyukYakın=  -index-1;

        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: "+ arr[indexKucukYakın]);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: "+ arr[indexBuyukYakın]);



    }
}
