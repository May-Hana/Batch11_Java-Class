package com.javaclass.partone;

public class lesson6_customCopy {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8};

        int copy[] = new int[array.length];
        //before copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }
        System.out.println();
        //copy
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        //after copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }
        System.out.println();
        //find largest number
        int largestNum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>largestNum){
                largestNum = array[i];
            }
        }
        System.out.println(largestNum);

        //sorting
        int numbers[] = {3,75,4,8,3,2,9,2,1};
        int value=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                    value=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=value;
                }
            }
            System.out.print(numbers[i]+"\t");
        }
        System.out.println();
        //sorting
        int number[] = {3,75,4,8,3,2,9,2,1};
        int value1=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if(number[i]<number[j]){
                    value1=number[i];
                    number[i]=number[j];
                    number[j]=value1;
                }
            }
            System.out.print(number[i]+"\t");
        }
        System.out.println(number[number.length-9]);
    }
}
