package com.javaclass.parttwo;

public class Lesson3_Inheritance {
    String name;
    int age;

    public void info(){
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        //Single inheritance
        Student student = new Student();
        student.name="May";
        student.age=27;
        student.rollNumber=2;
        student.grade=10;
        student.info();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.rollNumber);
        System.out.println(student.grade);

        //multiple inheritance
        ObjectOne obj1 = new ObjectOne();
        obj1.name = "Shwe";
        obj1.rollNumber=15;
        obj1.age=21;
        obj1.message="Hello how are you";
        System.out.println(obj1.name);
        System.out.println(obj1.rollNumber);
        System.out.println(obj1.age);
        System.out.println(obj1.message);
    }
}
