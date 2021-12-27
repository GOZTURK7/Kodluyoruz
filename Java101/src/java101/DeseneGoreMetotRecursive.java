package java101;

import java.util.Scanner;
public class DeseneGoreMetotRecursive {
    static int num;

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen Bir sayı giriniz:");
        num = scan.nextInt();


        System.out.println(desen(num, 5));
    }

    private static String desen(int sayi, int i) {
        if(sayi<=0) i*=(-1);
        int temp = sayi-i;
        if(temp==num) return temp+"";
        return sayi + " " +desen(temp, i);



    }
}
