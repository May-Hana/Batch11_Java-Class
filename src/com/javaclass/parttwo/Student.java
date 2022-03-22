package com.javaclass.parttwo;

public class Student extends Lesson3_Inheritance{

    int rollNumber,grade;

    static String name = "Wai";
    public static void main(String[] args){

 /*       Student student = new Student();
        student.showInfo();
        Lesson2_MethodInJava.sumTwoNum();
        Lesson2_MethodInJava.printHello();
        Lesson2_MethodInJava obj = new Lesson2_MethodInJava();
        obj.sayMingalarpr();
*/
        for (int i = 0; i < 7; i++) {
            if(i==3){
                return;
            }
            System.out.println(i);
        }

    }
    public void showInfo(){
        String name = "Shwe Yee";

        System.out.println(name);
        System.out.println(this.name);
    }


}
