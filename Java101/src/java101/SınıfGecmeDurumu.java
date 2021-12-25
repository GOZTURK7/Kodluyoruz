package java101;

import java.util.Scanner;

public class SınıfGecmeDurumu {

    public static void main(String[] args) {


    int Matematik, Fizik, Turkce, Kimya, Muzik;

    Scanner scan = new Scanner(System.in);

    System.out.println("Matematik Notunuz: ");
    Matematik=scan.nextInt();
    System.out.println("Fizik Notunuz: ");
    Fizik=scan.nextInt();
    System.out.println("Turkce Notunuz: ");
    Turkce=scan.nextInt();
    System.out.println("Kimya Notunuz: ");
    Kimya=scan.nextInt();
    System.out.println("Muzik Notunuz: ");
    Muzik=scan.nextInt();

    double avarage = (Fizik+Kimya+Matematik+Turkce+Matematik)/5;

    if (avarage>=0 && avarage<=54){
        System.out.println("Ortalamanız: " + avarage+ " Sınıfta Kaldınız.");
    }else if (avarage>54 && avarage<100) {
        System.out.println("Ortalamanız: " + avarage + " Sınıfı Geçtiniz.");
    }



    }

}
