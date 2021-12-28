package java101;

import java.util.Scanner;

public class a {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    public static boolean canWin(int leap, int[] g, int i) {
        if (i < 0 || g[i] == 1) {
            return false;
        }
        if (i + leap >= g.length || i == g.length - 1) {
            return true;
        }
        g[i] = 1;

        return (
                canWin(leap, g, i + 1) ||
                        canWin(leap, g, i + leap) ||
                        canWin(leap, g, i - 1)
        );
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("q:");
        int q = scan.nextInt();
        while (q-- > 0) {
            System.out.println("n:");
            int n = scan.nextInt();
            System.out.println("leap:");
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("game[i]");
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
