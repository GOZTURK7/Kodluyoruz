package java101;

import java.util.Scanner;

public class UcakBiletiFiyatıHesapla {

    public static void main(String[] args) {

        double ucret=0.10, tutar, yasIndirimli = 0, toplamTutar;
        int yas, mesafe, yolculukTipi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Girin:");
        yas = scan.nextInt();

        System.out.println("Lütfen Mesafeyi Girin:");
        mesafe=scan.nextInt();
        System.out.println("Lütfen Yolculuk Tipini Girin:\n1-Tek-Yön\n2-Gidiş-Dönüş");
        yolculukTipi=scan.nextInt();

        tutar= ucret*mesafe;

        if(yas<0 || yolculukTipi<0 || yolculukTipi >2){
            System.out.println("Hatalı Veri Girdiniz");
        }else{


            if(yas < 12){
                yasIndirimli=tutar-(tutar*0.50);
            }else if(yas < 24){
                yasIndirimli=tutar-(tutar*0.10);
            }else if(yas < 65){
                yasIndirimli=tutar;
            }else if(yas > 65){
                yasIndirimli=tutar-(tutar*0.30);
            }

            if(yolculukTipi==1){
                toplamTutar=yasIndirimli;
                System.out.println("Toplam Tutar : "+ toplamTutar);
            }else {
                toplamTutar = (yasIndirimli - yasIndirimli * 0.20)*2;
                System.out.println("Toplam Tutar: " + toplamTutar);
            }


        }



    }
}
