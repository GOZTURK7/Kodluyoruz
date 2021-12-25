package java101;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Bir Sayı Girin: ");

        int num = scan.nextInt();

        int toplam=0;
        for (int i = 1; i < num; i++) {

            if (num%i==0) toplam+=i;

        }
        if (toplam==num) System.out.println(num + " Mükemmel Sayı");
        else System.out.println(num + " Mükemmel Sayı Değil");
    }

}
