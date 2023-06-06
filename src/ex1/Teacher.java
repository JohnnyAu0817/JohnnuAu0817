package ex1;

public class Teacher extends Person {
    private String teacherId;
    private double salary;

    public Teacher(String name, char gender, String hkid, String teacherId, int salary){
        super(name,gender,hkid);
        this.teacherId = teacherId;
        this.salary = salary;
    }

    @Override
    public String getId(){
        return teacherId;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("Teacher: id=%s, name=%s, salary=$%.2f",getId(),getName(), getSalary());
    }
}
