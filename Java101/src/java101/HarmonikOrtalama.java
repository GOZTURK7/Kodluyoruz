package java101;

public class HarmonikOrtalama {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        double harmonikSeri=0, harmonikOrtalama;

        for (double i = 1; i <= arr.length ; i++) {

            harmonikSeri+=(1/i);
            System.out.println(harmonikSeri);
        }
        harmonikOrtalama=arr.length/harmonikSeri;
        System.out.println("Harmonik Ortalama:" +harmonikOrtalama);

    }
}
