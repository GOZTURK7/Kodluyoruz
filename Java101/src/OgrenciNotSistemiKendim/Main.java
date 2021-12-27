package OgrenciNotSistemiKendim;

public class Main {

    public static void main(String[] args) {


        Teacher t1 = new Teacher("Mahmut Hoca", "Matematik", 12345);
        Teacher t2 = new Teacher("Kamil Hoca", "Fizik", 124563);
        Teacher t3 = new Teacher("Ahmet Hoca", "Kimya", 124563);

        Course mat = new Course("Matematik", "MAT101", t1);
        Course fiz = new Course("Fizik", "FIZ101", t2);
        Course kim = new Course("Kimya", "KIM101", t3);


        Student st1 = new Student("Gökhan", 644, mat, fiz, kim);
        st1.addBulkExamNote(50,50,50,100,50, 100);
        //st1.isPass();

        Student st2 = new Student("Yusuf Burhan", 645, mat, fiz, kim);
        st2.addBulkExamNote(50,70,50,50,100, 50);
        //st2.isPass();

        Student st3 = new Student("Hatice", 646, mat, fiz, kim);
        st3.addBulkExamNote(50,50,50,50,50, 50);
        //st3.isPass();
       // st3.printNote();



    }

}
