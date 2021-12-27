package OgrenciNotSistemiKendim;

public class Course {

    Teacher teacher;
    String name;
    String prefix;
    double note;
    double sozluNote;

    Course(String name, String prefix, Teacher teacher){
        this.name = name;
        this.prefix = prefix;
        this.teacher = teacher;
    }

    public void printTeacher(){
        System.out.println("Ders:" + this.name + ", Dersin Öğretmeni: "+this.teacher.name);
    }



}
