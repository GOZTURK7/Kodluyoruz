package java101;

public class HackerRankJavaLoops2 {

    public static void main(String[] args) {

        int a = 5, b= 3, n=10;
        for (int i = 0; i < n-1 ; i++) {

            a = (int) (a + Math.pow(2,i)*b);
            System.out.print(a+ " ");
        }
        System.out.println();
    }
}
