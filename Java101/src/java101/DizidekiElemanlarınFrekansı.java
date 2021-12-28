package java101;

import java.util.Arrays;

public class DizidekiElemanlarınFrekansı {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20,23,33,22,22,22,2,22,22};
        int[] arrKontrol = new int[arr.length];
        Arrays.sort(arrKontrol);
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {

            if (Arrays.binarySearch(arrKontrol, arr[i]) > 0) {
                continue;
            }

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    arrKontrol[i]=arr[i];
                    counter++;

                }
            }
            Arrays.sort(arrKontrol);
            if(((Arrays.binarySearch(arrKontrol, arr[i]))>=0));{
                System.out.println(arr[i] + " Listede " + counter + " kere tekrar edildi.");
                System.out.println();
            }
            counter=1;



        }
    }
}
