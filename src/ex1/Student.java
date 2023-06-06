package ex1;

import ex1.Person;

public class Student extends Person {
    private String studentId;
    private String classCode;

    public Student(String name,char gender, String hkid, String studentId, String classCode){
        super(name,gender,hkid);
        this.studentId = studentId;
        this.classCode = classCode;
    }

    @Override
    public String getId(){
        return studentId;

    }

    @Override
    public String toString(){
        return String.format("student; id=%s, name=%s, classCode=%s",getId(), getName(),classCode);
    }










}
