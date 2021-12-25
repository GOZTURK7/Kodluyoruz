package java101;

import java.util.Scanner;

public class KullanıcıGirisi {

    public static void main(String[] args) {

        String kullanıcıAdi="Patikadev", sifre="java123";
        String userName, password;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız:");
        userName = scan.nextLine();

        System.out.println("Şifreniz :");
        password = scan.nextLine();

        if (userName.equals(kullanıcıAdi) && password.equals(sifre)) {
            System.out.println("Sisteme başarıyla giriş yaptınız;");
        } else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Bilgileriniz Sıfırlamak istermisiniz E/H");
            String sıfırla = scan.next();
            scan.nextLine();
            if (sıfırla.equals("E")){
                System.out.println("Lütfen Yeni Kullanıcı Adını giriniz:");
                userName= scan.nextLine();
                System.out.println("Lütfen Yeni Sifreyi Giriniz:");
                password=scan.nextLine();
                if(!(userName.equals(kullanıcıAdi)) && !(password.equals(sifre))){
                    kullanıcıAdi=userName;
                    sifre=password;
                    System.out.println("Şifreniz Değiştirildi.");
                }else{
                    System.out.println("Şifreniz değiştirilemedi başka bir şifre girin:");
                }
            }else{
                System.out.println("Yine Bekleriz");
            }

        }


    }

}
