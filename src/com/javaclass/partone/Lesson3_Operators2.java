package com.company.calculator;

public class Lesson3_Operators2 {
    public static void main(String[] args){

        //Binary Operator
        int number = 10;
        System.out.println(Integer.toBinaryString(number));

        int num1 = 10 << 4;
        System.out.println("10 << 4 "+num1);
        //10 * 2^4 = 10 * 16 = 160

        int num2 = 8 << 3;
        System.out.println("8 << 3 "+num2);
        //8 * 2^3 = 8 * 8 = 64

        String num3 = "1+1";
        System.out.println("1+1 " + (1+1));

        int num4 = 6 >> 2;
        System.out.println("6 >> 2 "+num4);
        //6 / 2^2 = 6/4 = 3/2 = 1

        int num5 = -6 >> 2;
        System.out.println(num5);
        // -6 / 2^2 = -6/4 = -2

        int value = 8;
        value >>>= 2;
        System.out.println(value);

        int value1 = 8;
        value1 >>=2;
        System.out.println(value1);

        int value2 = -8;
        value2 >>>= 2;
        System.out.println(value2);

        int value3 = -8;
        value3 >>=2;
        System.out.println(value3);

        //Ternary Operator
        int mark = 50;
        String result = (mark >= 40)?"Pass":"Fail";
        System.out.println(result);

        int result1 = (mark >= 40)?1:0;
        System.out.println(result1);

        boolean result2 = (mark >=40)?true:false;
        System.out.println(result2);

        char result3 = (mark >= 40)?'P':'F';
        System.out.println(result3);
    }
}
