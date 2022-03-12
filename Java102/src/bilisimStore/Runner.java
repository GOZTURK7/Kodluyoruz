package bilisimStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Brand> brands = new ArrayList<>();
    public static List<CellPhone> cellPhoneList = new ArrayList<>();
    public static List<NoteBook> noteBookList = new ArrayList<>();


    public static void main(String[] args) {

        run();


        CellPhone samsun = new CellPhone(1000,50,12,"Cep Telefonu","Samsung","8 RAM", "13 inch", "64 GB", 4000,"Blue");


        System.out.println(
                "price: " +  samsun.getPrice() +
                " discountPercentage :"+samsun.getDiscountPercentage() +
                " stockNumber :"+samsun.getStockNumber() +
                " productName: "+samsun.getProductName() +
                " brandName: "+ samsun.getBrandName()+
                " ram: "+ samsun.getRam() +
                " screenSize: "+samsun.getScreenSize() +
                " memory: "+ samsun.getMemory() +
                " batteryPower :" + samsun.getBatteryPower() +
                " color :"+samsun.getColor());





    }


    public static void run(){
       int choise =  menu();

        switch(choise){
            case 1:
                int menuCellPhone = menuCellPhone();
                switch (menuCellPhone){
                    case 1:

                        addProduct();
                }
                break;
            case 2:
                break;
            case 3:
                listBrands();
        }
    }


    public static int menu(){
        System.out.println("************** Welcome to Bilisim Store ***************");
        System.out.println();
        System.out.println("1 - Notebook Operations Operations\n" +
                "2 - Cell Phone Operations\n" +
                "3 List the Brand\n" +
                "0 Exit");
        System.out.println("Your Choise: ");
        int choise = scanner.nextInt();

        return choise;
    }


    public static int menuCellPhone(){
        System.out.println("************** Welcome to Cell Phone Operations ***************");
        System.out.println();
        System.out.println("1 - Add Cell Phone\n" +
                "2 - List Cell Phones\n" +
                "3 - Delete Cell Phone With Id\n" +
                "4 - Filter to Brand\n"+
                "5 - Filter to Id\n"+
                "0 Exit");
        System.out.println("Your Choise: ");
        int choise = scanner.nextInt();

        return choise;
    }

    public static void listBrands(){

        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

        Collections.sort(brands, new ComparatorBrandName());

        for(Brand w : brands){
            System.out.println("- "+w.getName());
        }

    }



}
