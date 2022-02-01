package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerrankJavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> listOfList = new ArrayList<>();
        System.out.println("Row");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("ikinci NextInt");
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                System.out.println("Üçüncü Next Int");
                list.add(sc.nextInt());
            }
            listOfList.add(list);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            try {
                int v = listOfList.get(r - 1).get(c - 1);
                System.out.println(v);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }

}
