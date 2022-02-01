package exeption;

import java.util.Scanner;

public class TryCatchFinally {
    // iki yöntem vardı biri
    // 1) try - catch
    // 2) throw (hata fırlataarak hatanın çağrıldığı noktada kontrolünün sağlanmasıdır.

    public static void main(String[] args) {


        System.out.println("Program Başladı. ");
        Scanner scan = new Scanner(System.in);

        int a = 0;
        int b = 20;
        int c;

        try {
            System.out.println("Bölme İşlemi");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti");
            c = scan.nextInt();
        }catch(ArithmeticException e){
            System.out.println("Aritmeetik Hata alındı");
            System.out.println(e.getMessage());

        }catch(Exception e){ // Catch burada method gibi çalışıyor Exception sınıfından e adında bir parametre alıyormuş gibi düşün.
            System.out.println("Hata Yakalndı:");
            System.out.println(e.getMessage());
           e.printStackTrace();
           System.out.println(e.toString());

        }finally{
            System.out.println("Bu kısım kesinlikle Çalışacak");
        }

        System.out.println("Program Bitti. ");



    }
}
