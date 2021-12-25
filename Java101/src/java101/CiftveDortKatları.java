package java101;

import java.util.Scanner;

public class CiftveDortKatları {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int num;

        int toplam=0;
        do{
            System.out.println("Sayı girin");
            num = scan.nextInt();
            if(num%4==0){
                toplam+=num;
                System.out.println("Geçerli Sayı:" + num);

            }
        }while(num%2!=1);

        System.out.println("Girdiğiniz Sayıların Toplamı:"+toplam);

    }
}
