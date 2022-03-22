package com.javaclass.parttwo;

public class Lesson1_Variables {
    //Variables => //1. Globle Variable,2. Local Variable
    //1.Globle Variable
    //1.1 Static Variable (owner by classes)
    //1.2 Non-Static Variable or Instance Variable (owner by objects)

    static String name = "May"; //static variable
    String message = "Hello!"; //Instance variable
    int age = 26; //Instance variable

    public static void main(String[] args) {
        System.out.println(Lesson1_Variables.name);//Call from Class

        Lesson1_Variables obj = new Lesson1_Variables();//build object
        System.out.println(obj.message);
        System.out.println(obj.age);

        Student student = new Student();
        student.showInfo();
    }

}
