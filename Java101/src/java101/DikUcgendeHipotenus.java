package java101;

import java.util.Scanner;

public class DikUcgendeHipotenus {

    public static void main(String[] args) {

        double dikKenar1, dikKenar2;
        double hipotenus;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci kenarı girin:");
        dikKenar1 = scan.nextDouble();
        System.out.println("Lütfen İkinci Kenarı girin :");
        dikKenar2 = scan.nextDouble();
        hipotenus=Math.sqrt((dikKenar1*dikKenar1)+(dikKenar2+dikKenar2));
        System.out.println("Üçgenin Hipotenüsü "+ hipotenus);
    }
}
