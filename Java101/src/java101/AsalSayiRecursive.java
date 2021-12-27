package java101;

import java.util.Scanner;

public class AsalSayiRecursive {


    public static void main(String[] args) {

    int num, prime ;
    Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
    num= scanner.nextInt();


    if (isPrime(num, num/2)==true){
        System.out.println(num+" sayisi asaldir");
    }else {
        System.out.println(num+" sayisi asal değildir");
    }
}

    private static boolean isPrime(int num, int i) {

        if(num==1) return false;
        if(i==1) return true;
        if(num%i == 0) return false;

        return isPrime(num, i-1);

        }





    }

