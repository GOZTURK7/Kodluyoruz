package java101;

import java.util.Arrays;


public class DizidekiCiftSayilariBul {


    public static void main(String[] args) {

        int[] arr = {3, 7, 3, 2, 9, 10, 21, 1, 33, 9, 1, 4, 6, 4, 2};
        int[] dublicateEven = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j] && arr[i] % 2 == 0) {

                    if(!isFind(dublicateEven, arr[i])){
                        dublicateEven[index++] = arr[i];
                    }
                    break;
                }

            }


        }
        System.out.println(Arrays.toString(dublicateEven));


    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }return false;
    }
}



