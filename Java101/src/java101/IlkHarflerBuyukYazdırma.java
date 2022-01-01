package java101;

import java.util.Arrays;

public class IlkHarflerBuyukYazdırma {

    public static String LetterCapitalize(String str) {
        String newStr="";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(i!=arr.length-1){
                newStr+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
            }else{
                newStr+=arr[i].substring(0,1).toUpperCase().concat(arr[i].substring(1));
            }
        }
        // code goes here  
        return newStr;
    }

    public static void main(String[] args) {
        
        
       System.out.println(LetterCapitalize("Hello World nasılsın"));

       

    }
}
