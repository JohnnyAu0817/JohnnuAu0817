package ex1;

import java.util.*;

public class SchoolManagement {
    public static void main(String [] args){
        Person [] people = {
                new Student("Chan Tai Man", "m","00000","1","1A")
                new Student("Lee Siu Fai", "m", "00001", "2", "2B")
                new Teacher("Wong Chun Yip", "m", "00002", "1", "20000")
                new Teacher("Tang Wing Chung", "m", "00003", "2", "25000")
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which type (‘S’ for Student, ‘T’ for Teacher)?");
        String type  = keyboard.nextLine();
        System.out.println("Input the target id:");
        String targetId = keyboard.nextLine();


    if(type.equals("S"){





    }
}
