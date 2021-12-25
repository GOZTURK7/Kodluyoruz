package java101;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("1. sayı:");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("2. sayı:");
        int num2 = scan.nextInt();

        int okek;
        int obeb=1;
        int k=0;
        if(num1>num2){
            k=num2;
        }else{
            k=num1;
        }

        while(k>0){
            if(num1%k==0 && num2%k==0){
                System.out.println(k);
                obeb=k;
                break;

            }
            k--;
        }

        okek=(num1*num2)/obeb;

        System.out.println("OBEB: "+ obeb + " OKEK: "+ okek);


    }
}
