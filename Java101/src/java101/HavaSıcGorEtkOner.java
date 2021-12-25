package java101;

import java.util.Scanner;

public class HavaSıcGorEtkOner {

    public static void main(String[] args) {

        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklığı girin:");
        heat = scan.nextInt();

        if (heat < 5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if (heat < 15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }else if (heat < 25){
            System.out.println("Pikniğe Gidebilirsiniz");
        }else if (heat > 25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }


    }
}
