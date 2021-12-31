package java101;

public class PalindromikKelime {



    public static boolean palindromik(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
            i++;

        }

       return true;
    }

    public static void main(String[] args) {


        System.out.println(palindromik("abba"));
    }


}
