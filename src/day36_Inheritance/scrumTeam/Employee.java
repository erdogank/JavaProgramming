package day36_Inheritance.scrumTeam;

public class Employee extends Person {

    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(int id, String jobTitle, double salary) {
        setInfo(name,age,gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
            System.out.println(name+ "is working");
        }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
