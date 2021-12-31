package java101;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {

        //int number = (int) (Math.random()*100); // 0 ile 100 arasında random bir int değer üretiyor.
        //System.out.println(number);

        Random rand = new Random();;
        int number = rand.nextInt(100);

        Scanner scan = new Scanner (System.in);
        int right = 0;
        int selected;
        int [] wrong= new int [5];
        boolean isWin=false;

        while(right < 5){
            System.out.println("Lütfen tahmininizi giriniz :");
            selected = scan.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz:");
                continue;
            }

            if(selected==number){
                System.out.println("Tebrikler, doğru tahmin ettiniz tahmin ettiğiniz sayı: "+ number);
                isWin=true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz:");
                if(selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür");
                }else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür");
                } wrong[right++]=selected;
                System.out.println("Kalan hakkınız: "+(5-right));



            }



        }
        if(isWin==true){
            System.out.println("Kazandınız Tebrikler");
        }else{
            System.out.println("Oyunu Kaybettiniz");
        }

        System.out.println("Gizli Sayı: "+number);
    }
}
