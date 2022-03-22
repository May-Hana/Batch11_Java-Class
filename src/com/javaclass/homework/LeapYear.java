package com.javaclass.homework;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year!");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year + " is Leap year.");
        }else{
            System.out.println(year + " is not Leap year.");
        }
    }
}
