package java101;

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Küme Kaç elemanlı: ");
        int n = scan.nextInt();
        System.out.println("Kaç Elemanlı Grup Oluşturacaksınız:");
        int r = scan.nextInt();

        int nFact=1;
        int rFact=1;
        int nrFact=1;
        for (int i = 1; i <=n; i++) {
            nFact*=i;
        }
        for (int i = 1; i <=r; i++) {
            rFact*=i;
        }
        for (int i = 1; i <=(n-r); i++) {
            nrFact*=i;
        }
        int result = nFact/(rFact*nrFact);
        System.out.println("Result: "+result);



    }
}
