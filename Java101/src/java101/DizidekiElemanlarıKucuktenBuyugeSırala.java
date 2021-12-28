package java101;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarıKucuktenBuyugeSırala {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Dizinin Boyutunu Girin n=:");
        int boyut = scan.nextInt();
        int [] arr = new int[boyut];
        System.out.println("Dizinin Elemanlarını Girin:");

        int counter = 0;
        while(counter<arr.length){
            System.out.println(counter+1+". Eleman:");
            int eleman=scan.nextInt();
            arr[counter]=eleman;
            counter++;

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        }
    }


