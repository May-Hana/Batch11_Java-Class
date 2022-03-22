package com.javaclass.partone;
public class Lesson6_ArrayCopy {
    public static void main(String[] args){
        //Array Copy
       int numbers[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(numbers.getClass().getName());

        int other[] = new int[5];
        System.arraycopy(numbers,3,other,2,2);
        for(int i = 0; i<other.length;i++){
            System.out.print(other[i]+"\t");
        }
        System.out.println();
        int another[]=other.clone();
        for(int i =0;i<another.length;i++){
            System.out.print(other[i]+"\t");
        }
 /*
    int num[]= {1,2,3,4,5,6,7,8,9,4,5,3};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        for (int i= num.length -1; i >=0;i--){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        for(int n : num){
            System.out.print(n+"\t");
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] == num[j]){
                    System.out.print(num[j]+"\t");
                }
            }
        }
  */
        System.out.println();
        //ArrayCopy
        int array[]={1,2,4,5,6,7,8,6,3,3,4,2};
        int copy[]= new int[7];
        System.arraycopy(array,2,copy,0,6);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }
        System.out.println();

        int clone[]=copy.clone();
        for (int i = 0; i < clone.length; i++) {
            System.out.print(clone[i]+"\t");
        }

        //jagged Array
        int jagnum[][]= {{1,4,6},{2,4},{1,5,3,3},{1,4,6,7,4}};//already input value

        //haven't input value; just declare room length;
        int jagnumber[][]= new int[3][];
        jagnumber[0] = new int[4];
        jagnumber[1] = new int[2];
        jagnumber[2] = new int[3];
    }
}
