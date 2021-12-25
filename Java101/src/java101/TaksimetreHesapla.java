package java101;

import java.util.Scanner;

public class TaksimetreHesapla {

    public static void main(String[] args) {

        double mesafe, minimumTutar=20, acılısUcreti=10, kimBasina=2.20, toplamTutar;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen mesafe girin :");
        mesafe = scan.nextDouble();
        toplamTutar=acılısUcreti+ (mesafe*kimBasina);
        if(toplamTutar<minimumTutar){
            toplamTutar=minimumTutar;
            System.out.println("Toplam tutarınız: "+ toplamTutar);

        }else{
            toplamTutar=mesafe*kimBasina+acılısUcreti;
            System.out.println("Toplam tutarınız: " + toplamTutar);
        }




    }

}
