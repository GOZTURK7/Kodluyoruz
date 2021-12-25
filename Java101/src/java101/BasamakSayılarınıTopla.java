package java101;

import java.util.Scanner;

public class BasamakSayılarınıTopla {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Sayı girin :");
        int num = scan.nextInt();
        int num1 = num;
        int toplam=0;
        do{
            toplam+=num1%10;
            num1=num1/10;
        }while(num1!=0);

        System.out.println(num+" Sayısının Rakamaları Toplamı: "+toplam);
    }
}
