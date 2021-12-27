package OgrenciNotSistemiKendim;

public class Student {

    String name;
    int stuNo;
    Course mat;
    Course fiz;
    Course kim;
    double avarage;

    Student(String name, int stuNo, Course mat, Course fiz, Course kim){
        this.name = name;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fiz = fiz;
        this.kim = kim;


    }

    public void addBulkExamNote(double mat, double matSozlu, double fiz, double fizSozlu, double kim, double kimSozlu){
        this.mat.note =mat;
        this.mat.sozluNote=matSozlu;
        this.fiz.note = fiz;
        this.fiz.sozluNote=fizSozlu;
        this.kim.note = kim;
        this.kim.sozluNote=kimSozlu;
        calculateAvarage();
        printNote();
        isPass();
        System.out.println("=================================================");


    }

    public void calculateAvarage(){
        double matNot= this.mat.note*0.8 + this.mat.sozluNote*0.2;
        double fizNot= this.fiz.note*0.8 + this.fiz.sozluNote*0.2;
        double kimNot= this.kim.note*0.8 + this.kim.sozluNote*0.2;

        this.avarage = (matNot + fizNot + kimNot)/3;
    }

    public void isPass(){
        if(this.avarage > 55){
            System.out.println("Ortalama: " + this.avarage);
            System.out.println(this.name + " Sınıfı Geçti");
        }else{
            System.out.println("Ortalama: " + this.avarage);
            System.out.println(this.name + " Sınıfı Geçemedi !!");
        }
    }

    public void printNote(){
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik\t Yazılı: " +this.mat.note +" Sözlü: " + this.mat.sozluNote );
        System.out.println("Fizik\t\t Yazılı: " +this.fiz.note +" Sözlü: " + this.fiz.sozluNote );
        System.out.println("Kimya\t\t Yazılı: " +this.kim.note +" Sözlü: " + this.kim.sozluNote );


    }



}
