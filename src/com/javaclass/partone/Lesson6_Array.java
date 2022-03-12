package com.company.calculator;

import java.util.Arrays;

public class Lesson6_Array {
    public static void main(String[] args){
      //  String fruits[] = {"mango", "banana", "pineapple"}};
/*
        int arrName[] = new int[6];
        arrName[0] = 1;
        arrName[1] = 2;
        arrName[2] = 3;
        arrName[3] = 4;
        arrName[4] = 5;
        arrName[5] = 6;

        for(int i=0; i < arrName.length ; i++){
            System.out.print(arrName[i]+"\t");
        }

        for(int i = arrName.length - 1; i >= 0; i--){
            System.out.print(arrName[i] + "\t");
        }
        //for each loop
        for (int j : arrName){
            System.out.println(j);
        }
*/
        //one dimentional array
        //two or multidimentional array

/*
        //int arrN[][] = new int[][];
        int arrN[][] = {{1,2,3},{4,5,6},{7,8,9},{111,12,13}};
        System.out.println(arrN.length);

        arrN[3][1]=45;

        for(int a = 0; a < arrN.length; a++){
            for(int a1 = 0; a1 < arrN[a].length; a1++){
                System.out.print(arrN[a][a1]+"\t");
            }
            System.out.println();
        }
        //if different array room == jagged array
        String fruits[][]= {{"mango","banana","Orange"},{"Pineapple","Watermelon"},{"grape","apple"},{"orange","peach"}};
        for (int b = 0; b < fruits.length ; b++){
            for(int b1 = 0; b1< fruits[b].length; b1++){
                System.out.print(fruits[b][b1]+"\t");
            }
            System.out.println();
        }
*/
        //Duplicate Element
        int duplicate[] = {1,2,3,4,5,3,6,4,7,2,9};//2,3,4
        for(int m = 0; m < duplicate.length; m++){
            for(int j = m+1; j < duplicate.length; j++){
                if (duplicate[m] == duplicate[j]){
                    System.out.println(duplicate[j]);
                }
            }
        }

        //two dimentional array
        int numbers[][] = {{1,2,3},{4,5,6},{7,8,9,0},{7,5,4,8}};
        for (int row = 0; row < numbers.length ; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + "\t");
            }

        }
        //for each loop
        System.out.println(numbers[2][2]);
        System.out.println();
        for (int[] num: numbers){
            for (int n: num) {
                System.out.print(n +"\t");
            }
        }

        //Homework
        int evenodd[] = {1,2,3,4,5,6,7,8,9,0};
        for(int i = 0; i < evenodd.length; i++){
            if(evenodd[i]%2 == 0){
                System.out.print(evenodd[i]+"\t");
            }
        }
        System.out.println();
        for (int i = 0; i < evenodd.length; i++) {
            if(evenodd[i]%2 != 0){
                System.out.print(evenodd[i]+"\t");
            }
        }
        System.out.println();
        int MaxMin[]={23,45,56,78,20,15,8};//8,15,20,23,45,56,78
        MaxMin[3]=105;
        int n= MaxMin.length;
        Arrays.sort(MaxMin);
        System.out.println("Largest Number "+MaxMin[n-1]);
        System.out.println("Second Largest Number "+MaxMin[n-2]);
        System.out.println("Smallest Number "+MaxMin[n-7]);
    }
}
