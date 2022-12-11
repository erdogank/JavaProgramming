package day33_Statics;

public class CydeoStudent {

    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName, programmingLanguage;


    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying" );
    }
    public void attendClass(){
        System.out.println(name+ " is attending the class");
    }
    public void printSchoolname(){
        System.out.println(name+ "school name is: "+schoolName);
    }
    public static void printProgLang(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
