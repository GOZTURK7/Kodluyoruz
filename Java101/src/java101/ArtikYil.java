package java101;

import java.util.Arrays;
import java.util.Scanner;


public class ArtikYil {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yılı girin:");
        int yil = scan.nextInt();

        if(yil%4==0){
            if(yil%100==0){
                if (yil%400==0){
                    System.out.println(yil + " Artık yıldır.");
                }else{
                    System.out.println(yil +" Artık yıl değildir");
                }
            }else{
                System.out.println(yil+" Artık yıldır.");
            }
        }else{
            System.out.println(yil + " Artik yıl değildir");
        }

    }
}
