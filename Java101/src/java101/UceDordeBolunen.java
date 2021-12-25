package java101;

import java.util.Scanner;

public class UceDordeBolunen {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen sayı giriniz:");
        int num = scan.nextInt();;

        int toplam=0;
        int counter=0;
        for (int i = 0; i < num; i++){
            if(i%3==0 && i%4==0) {
                counter++;
                toplam += i;

            }

        }System.out.println("Ortalama :" + (toplam/counter));
    }
}
