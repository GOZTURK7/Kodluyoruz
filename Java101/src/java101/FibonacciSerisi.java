package java101;

import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Kaç Elemanlı Olsun: ");
        int num = scan.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+ ", ");
        System.out.print(b + ", ");
        while(num>1){

            c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;
            c=0;
            num--;
        }


    }
}
