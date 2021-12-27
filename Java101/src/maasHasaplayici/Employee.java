package maasHasaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        printInfo();

    }

    double tax(){
       if(this.salary > 1000){
           return this.salary*0.03;
       }else return 0;
    }

    double bonus(){
        if(workHours > 40) {
            return (this.workHours - 40) * 30;
        }else return 0;
    }

    double raiseSalary(){
        if(2021 - hireYear < 10) return this.salary*0.05;
        if(2021 - hireYear < 20) return this.salary*0.10;
        if(2021 - hireYear > 19) return this.salary*0.15;
        return 0;
    }

    public void printInfo() {
        System.out.println("Adı\t\t\t\t\t:"+ this.name +
                "\nMaaşı\t\t\t\t:"+ this.salary +
                "\nÇalışma Saati\t\t:"+ this.workHours +
                "\nBaşlangıc Yılı\t\t:"+this.hireYear+
                "\nVergi\t\t\t\t:"+tax()+
                "\nBonus\t\t\t\t:"+bonus()+
                "\nMaaş Artışı\t\t\t:"+raiseSalary()+
                "\nVergi ve Bonuslar ile \nBirlikte Maaş\t\t:"+(this.salary+this.bonus()-this.tax()) +
                "\nToplam Maaş\t\t\t:"+ (this.salary+this.bonus()+this.raiseSalary()-this.tax()));
    }
}
