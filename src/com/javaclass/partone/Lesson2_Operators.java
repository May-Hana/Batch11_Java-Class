package com.javaclass.partone;

public class Lesson2_Operators {
    public static void main(String[] args) {
        //Relational Operator
        int value1 = 10;
        int value2 = 15;
        boolean result2 = value1 > value1;
        System.out.println(result2);

        System.out.println(value1 > value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 != value2);
        System.out.println(value1 == value2);

        int value3 = 5;
        int value4 = 7;
        int value5 = 9;
        int value6 = 10;
        System.out.println(value3<value4 && value4>value5);
        System.out.println(!(value6>value5 || value6<value4));

        //Bitwise And
        System.out.println(value1<value2 & value3<value4); //true

        //Bitwise Inclusive OR
        System.out.println(value1>value2 | value1<value2); //true

        //Bitwise exclusive OR
        System.out.println(6>7 ^ 7<9); // false ^ true == true

        int aa = 1;
        System.out.println(aa++);
        System.out.println(++aa);

        int v1 = 20;
        v1 += 10;
        System.out.println(v1);

        int v2 = 10;
        v2 -= 3;
        System.out.println(v2);

        int v3 = 3;
        v3 *= 4;
        System.out.println("V2 result : "+v3);

        v3 /= 3;
        System.out.println(v3);

        v3 %= 2;
        System.out.println(v3);
    }
}
