package java101;

public class AsalSayılarıBul {

    public static void main(String[] args) {

        System.out.print("2, ");

        boolean isPrime = true;
        for (int i = 3; i < 100; i++) {

            for (int j = 2; j < i ; j++) {

                if(i%j==0){
                    isPrime=false;

                }

            }if (isPrime) System.out.print(i + ", ");
            isPrime=true;

        }


    }
}
