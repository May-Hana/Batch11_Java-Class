package com.javaclass.partone;
import java.util.Scanner;
public class Lesson7_Scanner {
    public static void main(String[] args){

 /*       //break;//continue;
        for (int i = 0; i < 10; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 12; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
 */
        //Scanner
        Scanner input = new Scanner(System.in);
  /*    System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter you age");
        int age = input.nextInt();

        System.out.println("Your Name is "+ name + " and your age is "+age);
  */

        System.out.println("Enter the base: ");
        int base = input.nextInt();

        System.out.println("Enter the high");
        int high = input.nextInt();

        int result = (base*high)/2;
        System.out.println("Area of triangle is : "+ result);

    }
}
