package java101;

import java.util.Scanner;

public class UsluSayıHesapla {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Üssü alınacak Sayıyı girin:");
        int num = scan.nextInt();
        System.out.println("Üssü girin: ");
        int pow=scan.nextInt();

        int result = 1;
        for (int i = 0; i < pow; i++) {

            result*=num;

        }
        System.out.println("Sonuç "+ result);

    }
}
