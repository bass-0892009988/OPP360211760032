package lab7;
//1.name
//2age
//3.gander
//4.height

import com.sun.corba.se.impl.javax.rmi.CORBA.StubDelegateImpl;

public class Student {
    //properties of student class
    private String name;
    private int age;
    private String gender;
    private double height;

    public Student(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
}//class
