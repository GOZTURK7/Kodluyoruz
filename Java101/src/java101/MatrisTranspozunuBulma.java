package java101;

import java.util.Arrays;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {


        int matris [][] = { {1,2,3},{4,5,6} };

        System.out.println("Matris:");
        for(int [] each : matris){
            System.out.println(Arrays.toString(each));
        }
        int transpoz [][] = new int[3][2];

        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < transpoz.length ; j++) {

                transpoz[j][i] = matris[i][j];
            }

        }System.out.println("Transpoz:");
        for(int each [] : transpoz){
            System.out.println(Arrays.toString(each));
        }


    }

}
