package com.javaclass.parttwo;
//hierarchial Inheritance
public class ParentClass {
    // parent class
        int parentVariable = 5;

        public static void main(String[] args) {
            // object created
            Child1Class child1 = new Child1Class();
            Child2Class child2 = new Child2Class();

            System.out.println("Parent variable + Child variable of child1 = " + (child1.parentVariable + child1.childVariable));

            System.out.println("Parent variable + Child variable of child2 = " + (child2.parentVariable + child2.childVariable));

        }
}
