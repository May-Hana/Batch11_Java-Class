package com.javaclass.partone;

public class Lesson5_Looping2 {
    public static void main(String[] args){
        //2.Loop Statement: while, do while, for, for each
        /* while(condition){
                    //codes
             }
         */
        int num = 1;
        while (num < 10)
        {
            System.out.println(num);
            num += 2;
        } // pre-test loop

        /*
        do{
            //codes
        }while(condition);
         */
        int num2 = 7;
        System.out.println("Do while loop");
        do{
            System.out.println(num2);
            num2 -= 1;
        }while(num2 > 5);

        //for(initiallization, condition, increment/drecrement){}
        for (int i=0; i<5; i++){
            System.out.println("Number is "+ i);
        }
        for (int i=10; i>1; i--){
            System.out.println("The result is "+i);
        }
    }
}
