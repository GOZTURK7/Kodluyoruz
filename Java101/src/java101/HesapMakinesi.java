package java101;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        int number1, number2, selection;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı girin:");
        number1=scan.nextInt();
        System.out.println("Lütfen ikinci Sayıyı giriniz:");
        number2=scan.nextInt();

        System.out.println("Sayı 1:" + number1 + " Sayı 2:" + number2);

        System.out.println("1- Toplama\n2-Çıkarma\n3-Carpma\n4-Bölme");
        System.out.println("Seçiminiz Nedir?");
        selection = scan.nextInt();

        switch(selection){

            case 1:
                System.out.println("Toplam:" + (number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (number1<number2 ? (-(number1-number2)) :(number1-number2)));
                break;
            case 3:
                System.out.println("Carpım: "+ (number1*number2));
                break;
            case 4:
                if (number2 != 0){
                    System.out.println("Bölme :"+ (number1/number2));
                    break;
                } else {
                    System.out.println("Bir Sayı Sıfıra bölünemez");
                    break;
                }
            default:
                System.out.println("Geçerli bir işlem giriniz");
        }
    }
}
