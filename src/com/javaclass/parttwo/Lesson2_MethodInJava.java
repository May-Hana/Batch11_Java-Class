package com.javaclass.parttwo;

public class Lesson2_MethodInJava {
    public static void main(String[] args){
        printHello();
        Lesson2_MethodInJava.printHello();
        sumTwoNum();
        sumTwoNum(10,6);
        greetName("May");

        Lesson2_MethodInJava obj = new Lesson2_MethodInJava();
        obj.sayMingalarpr();

        Lesson2_MethodInJava year = new Lesson2_MethodInJava();
        year.checkLeapYear(2022);
    }
    //User defined Method
    //Static Method
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void sumTwoNum(){
        int a =12;
        int b = 13;
        int result = a+b;
        System.out.println(result);
    }
    public static void sumTwoNum(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }
    public static void greetName(String name){
        System.out.println(name);
    }

    //non-static Method (or) Instance Method;
    public void sayMingalarpr(){
        System.out.println("Mingalarpar");
    }
    public void checkLeapYear(int year){
        if(year%4 == 0){
            System.out.println("It leap year");
        }else {
            System.out.println("It's not leap year");
        }
    }


}
