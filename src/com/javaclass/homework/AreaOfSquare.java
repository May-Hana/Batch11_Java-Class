package com.javaclass.homework;
import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Square Size!");
        int square = sc.nextInt();
        int area = square * square;
        System.out.println("The area of square is "+ area +".");
    }
}
