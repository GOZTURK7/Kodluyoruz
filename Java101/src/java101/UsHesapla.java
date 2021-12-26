package java101;

import java.util.Scanner;

public class UsHesapla {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Taban değeri girin:");
        int taban = scan.nextInt();
        System.out.println("Üs değerini girin: ");
        int us = scan.nextInt();


        System.out.println(usHesapla(taban, us));


    }

    private static int usHesapla(int taban, int us) {

        if(us == 0) return 1;
        us--;

        return taban*usHesapla(taban, us);

    }
}
