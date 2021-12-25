package java101;

import java.util.Scanner;

public class BurcBul {

    public static void main(String[] args) {

        int month, day;

        String burc;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Doğduğunuz Ayı girin:");
        month = scan.nextInt();
        System.out.println("Lütfen Doğduğunuz Günü Girin");
        day = scan.nextInt();

        if ((month == 3 && (day>=21 || day<=31)) || (month==4 && (day>=1 || day<=20))){
             System.out.println("Koç Burcu");
        }else if((month == 4 && (day>=21 || day<=30)) || (month==5 && (day>=1 || day<=22))){
            System.out.println("Boğa Burcu");
        }else if((month == 5 && (day>=22 || day<=31)) || (month==6 && (day>=1 || day<=22))){
            System.out.println("İkizler Burcu");
        }else if((month == 6 && (day>=23 || day<=30)) || (month==7 && (day>=1 || day<=22))){
            System.out.println("Yengeç Burcu");
        }else if((month == 7 && (day>=23 || day<=31)) || (month==8 && (day>=1 || day<=22))){
            System.out.println("Aslan Burcu");
        }else if((month == 8 && (day>=23 || day<=31)) || (month==9 && (day>=1 || day<=22))){
            System.out.println("Başak Burcu");
        }else if((month == 9 && (day>=23 || day<=30)) || (month==10 && (day>=1 || day<=22))){
            System.out.println("Terazi Burcu");
        }else if((month == 10 && (day>=23 || day<=31)) || (month==11 && (day>=1 || day<=21))){
            System.out.println("Akrep Burcu");
        }else if((month == 11 && (day>=22 || day<=30)) || (month==12 && (day>=1 || day<=21))){
            System.out.println("Yay Burcu");
        }else if((month == 12 && (day>=22 || day<=31)) || (month==1 && (day>=1 || day<=21))){
            System.out.println("Oğlak Burcu");
        }else if((month == 1 && (day>=22 || day<=30)) || (month==2 && (day>=1 || day<=19))){
            System.out.println("Kova Burcu");
        }else if((month == 2 && (day>=21 || day<=28)) || (month==3 && (day>=1 || day<=20))){
            System.out.println("Balık Burcu");
        }else{
            System.out.println("Geçersiz Tarih girdiniz:");
        }




    }

}
