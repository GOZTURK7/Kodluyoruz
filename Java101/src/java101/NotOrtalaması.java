package java101;

import java.util.Scanner;

public class NotOrtalaması {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Ders Notlarınızı girin:");
        System.out.println("Matematik Notunuz:");
        mat = scan.nextInt();
        System.out.println("fizik Notunuz:");
        fizik = scan.nextInt();
        System.out.println("kimya Notunuz:");
        kimya = scan.nextInt();
        System.out.println("turkce Notunuz:");
        turkce = scan.nextInt();
        System.out.println("tarih Notunuz:");
        tarih = scan.nextInt();
        System.out.println("muzik Notunuz:");
        muzik = scan.nextInt();

        double notlarToplami = mat + fizik+kimya+turkce+tarih+muzik;
        double sonuc = notlarToplami/6;
        System.out.println("Not ortalaması : " + sonuc);

    }
}
