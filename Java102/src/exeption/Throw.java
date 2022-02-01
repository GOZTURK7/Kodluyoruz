package exeption;

import java.util.Scanner;

public class Throw {

    // iki yöntem vardı biri
    // 1) try - catch
    // 2) throw (hata fırlataarak hatanın çağrıldığı noktada kontrolünün sağlanmasıdır.

    public static void checkAge(int age) throws Exception { // javada runtime exception dışındaki türleri bir method içinde kullanmak istiyorsan throws deyip o hatayı yazıyoruz.
        if(age < 18){
            throw new Exception("Yaşınız Tutmuyor.");

        }
        System.out.println("Yaşı uygundur.");
    }


    public static void main(String[] args) { //throws Exception yapıp try - catch kullanmaya bililiriz
        //                                              // yada try - catch yapar throws Exception kullanmayız
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int age = scan.nextInt();

        //checkAge(age); bu şekilde try - catch yapmadan kullanmak için yukarıya throws Exception yazmamız gerekiyor.

        try{
            checkAge(age);

        }catch (Exception e){
            System.out.println("Yaşı Uymadı");
            System.out.println(e.toString());
        }

        System.out.println("program bitti");

    }
}
