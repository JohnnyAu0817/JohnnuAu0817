package ex1;

public abstract class Person {
   private String name;
   private char gender;
   private String hkid;

    public Person(String name, char gender, String hkid){
        this.name = name;
        this.gender = gender;
        this.hkid = hkid;
    }
    public abstract String getId();

    public String getName(){
        return name;
    }

}
















