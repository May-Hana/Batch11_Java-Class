package com.javaclass.homework;
import java.util.Scanner;
public class AreaOfCircle {

    public static void main(String[] args) {
        double area, radius, pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        radius = sc.nextDouble();
        area = pi * radius * radius;
        System.out.println("The area of Circle is "+area);
    }
}
