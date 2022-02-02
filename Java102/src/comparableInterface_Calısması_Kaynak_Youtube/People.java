package comparableInterface_Calısması_Kaynak_Youtube;

public class People implements Comparable<People>{

    private String name;
    private String surname;
    private int age;


    public People(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(People o) {// o people clasından bir instans mı ?
        if(o instanceof People){
            People other=(People) o;

            if(this.age > other.getAge()){ // age büyük
                return 1;
            }else if(this.age < other.getAge()){ // other
                return -1;
            }else{
                return 0;
            }
        }
        return 0;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
