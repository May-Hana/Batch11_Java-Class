package com.javaclass.parttwo;

import java.util.Scanner;
public class ATM_Project {
    int id;
    String name;
    double amount;

    public ATM_Project(int id, String name, double amount)
    {
        this.name=name;
        this.id=id;
        this.amount=amount;
    }
    void addAmount(double amt){
        amount = amount+amt;
    }

    void withdrawAmount(double wAmount){
        amount = amount-wAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM_Project user1= new ATM_Project(123,"Wai",10000);
        System.out.println("Choice a number \n1.Add Amount \n2.Withdraw Amount");
        int userChoice = sc.nextInt();
        if(userChoice == 1){
            System.out.println("Enter Amount you want to add");
            user1.addAmount(sc.nextDouble());
            System.out.println(user1.amount);
        }else if(userChoice == 2){
            System.out.println("Enter Amount you want to withdraw");
            double userWAmount = sc.nextDouble();
            if(userWAmount < user1.amount){
                if(user1.amount - userWAmount <= 1000){
                    System.out.println("Your Balance is not enough to do withdraw");
                }
                else {
                    user1.withdrawAmount(userWAmount);
                    System.out.println(user1.amount);
                }
            }
            else{
                System.out.println("Your Balance is not enough to do withdraw");
            }
        }else{
            System.out.println("Please choose correct number!");
        }

       // System.out.println(user1.amount);
       // user1.withdrawAmount(20000);
        //System.out.println(user1.amount);
    }
}
