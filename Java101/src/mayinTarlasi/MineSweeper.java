package mayinTarlasi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    static Scanner scan = new Scanner(System.in);
    static int satir;
    static int sutun;
    static int boardYerlestirilecekMayinSayisi=satir*sutun/4;
    static int isFinishCounter=0;
    public String [][] board = new String[satir][sutun];
    public String[][] boardMayinKonumlari = new String[satir][sutun];

    public MineSweeper(int satir, int sutun) {
        this.sutun = sutun;
        this.satir = satir;

    }
    public MineSweeper(){

    }

    public void board(){
        for(String [] w : board){
            for(int i=0; i<w.length; i++){
                w[i]="_";
            }
        }

        for(String[] w : board){
            for (int i = 0; i <w.length ; i++) {
                System.out.print(w[i]+" ");
            }System.out.println();

        }System.out.println("**************");
    }

    public void boardMayinYerlestir(){
        Random rand = new Random();
        for (int i = 0; i < boardYerlestirilecekMayinSayisi ; i++) {
            int randSatirIndex = rand.nextInt(satir);
            int randSutunIndex = rand.nextInt(sutun);
            //board[randSatirIndex][randSutunIndex]="*"; // bu satırı en son sileceğim !!!!!!!!!!!!!!! çünkü bu satır sadece boş boardu dolu getiriyor.
            boardMayinKonumlari[randSatirIndex][randSutunIndex]="*";

        }
    }
    public void boardMayinKonumlari(){
        for(String [] w : boardMayinKonumlari) {
            for (int i = 0; i < w.length; i++) {
                   if(w[i]==null){
                       w[i]="_";
                   }
            }
        }
        for(String[] w : boardMayinKonumlari){
            for (int i = 0; i <w.length ; i++) {

                    System.out.print(w[i]+" ");

            }System.out.println();

        }System.out.println("**************");
    }

    public void run(){
        System.out.println("Satir:" + satir + " Sutun:" + sutun);
        boardMayinYerlestir();
        boardMayinKonumlari();
        board();
        boolean flag = true;
        do {
            System.out.println("Satır Giriniz:");
            int satirKullanici = scan.nextInt();

            System.out.println("Sütun Giriniz:");
            int sutunKullanici = scan.nextInt();

            if (satirKullanici < 0 || satirKullanici > board.length - 1
                    || sutunKullanici < 0 || sutunKullanici > board.length - 1) {
                System.out.println("Board sınırları için Koordinat girin;");
                continue;

            } else {
                int startSatirIdx = satirKullanici - 1;
                int finishSatirIdx = satirKullanici + 1;

                int startSutunIdx = sutunKullanici - 1;
                int finishSutunIdx = sutunKullanici + 1;

                if (satirKullanici == 0) {
                    startSatirIdx = satirKullanici;
                } else if (satirKullanici == (boardMayinKonumlari.length - 1)) {
                    startSatirIdx = board.length - 2;
                    finishSatirIdx = board.length - 1;
                }
                if (sutunKullanici == 0) {
                    startSutunIdx = sutunKullanici;
                } else if (sutunKullanici == (boardMayinKonumlari[0].length - 1)) {
                    startSutunIdx = board[0].length - 2;
                    finishSutunIdx = board[0].length - 1;
                }


                int counter = 0;
                for (int i = startSatirIdx; i <= finishSatirIdx; i++) {

                    for (int j = (startSutunIdx); j <= (finishSutunIdx); j++) {

                        if (!boardMayinKonumlari[i][j].equals(boardMayinKonumlari[satirKullanici][sutunKullanici])
                                && boardMayinKonumlari[i][j].equals("*")) {
                            counter++;
                        }
                    }
                }


                if (boardMayinKonumlari[satirKullanici][sutunKullanici].equals("*")) {
                    System.out.println("Game Over !!");
                    flag=false;

                } else {
                    isFinishCounter++;
                    if(!(isFinishCounter==satir*sutun-boardYerlestirilecekMayinSayisi)) {
                        board[satirKullanici][sutunKullanici] = String.valueOf(counter);
                        for (String[] a : board) {

                            for (int j = 0; j < a.length; j++) {

                                System.out.print(a[j] + " ");
                            }
                            System.out.println();

                        }System.out.println("isFinihCounter: "+ isFinishCounter);
                        System.out.println("*****************");
                    }else{
                        System.out.println("Tebrikler Oyunu Kazandın !!!!!!!!");
                        flag=false;
                    }

                }

            }
        }while(flag);
        isFinishCounter=0;

    }


}
