package java101;

public class PalindromeSayı {
    static int reverseNumber=0;
    public static void main(String[] args) {

        int num = 121;

        if(num==isPalindrome(num)) System.out.println(num+ " is Palindrome");
        else System.out.println(num + " is not Polindrome");
    }

    public static int isPalindrome(int num){
        if(num==0){
            return reverseNumber;
        }
        int temp=num, lastNumber;
        lastNumber=temp%10;
        reverseNumber=(reverseNumber*10) + lastNumber;
        return isPalindrome(temp/10);




//        if(num==0) {
//            return 0;
//        }

//        int a = num%10;
//        num=num/10;
//        temp=a;
//        a=a*10 + num%10;
//        num=num/10;
//        a=a*10 + num%10;
//        num=num/10;
//        return a*10 + isPalindrome(num/10);
    }
}
