package Map;

import java.util.TreeMap;

public class _LinkedHashMap_and_TreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, Student> students = new TreeMap<>(new OrderByNoComparator().reversed());

        students.put(102, new Student(102, "Mustafa", 100));
        students.put(110, new Student(110, "Damla", 25));
        students.put(108, new Student(108, "Ahmet", 77));
        students.put(118, new Student(118, "Cemre", 40));

        for(Student stu : students.values()) {
            System.out.println(stu.getName());

//            buradaki comparator clasının içinde override ettiğimiz compare methodu
//            Map'lerde key'in veritipine göre sıralamasını sağlıyor TreeSet'lerdeki
//            comparator'den farkı bu, burada OrderByNoComparator klasıını Comparator<Intger> şeklinde
//            implement ediyoruz çünkü key veri tipi burada int o yüzden bu şekilde yaptık.
        }




    }
}
