package com.javaclass.partone;

public class Lesson4_Looping {
    public static void main(String[] args) {
        //1.Decision Making Statement : if , else if, else , switch
        //(we can do with any datatype like String, double, char)
        //if (condition){ }
        //1. if(){}
        //2. if(){} else{}
        //3. if(){} else if(){} else{}
        //4. if() { if(){} else{} }

        if(10>5){
            System.out.println("10 is greater than 5");
        }
        else{
            System.out.println("5 is greater than 5");
        }

        int mark = 83;
        if (mark >= 40 && mark < 80){
            System.out.println("Pass");
        }
        else if(mark >= 80){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }

        int mark1 = 36;
        if (mark1 >= 40) {
            if(mark1 >= 80){
                System.out.println("D");
            }
            else{
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }

        String address = "Yangon";
        if(address == "Yangon")
            System.out.println("You live in Yangon.");
        else if(address == "Mandalay")
            System.out.println("You live in Mandalay.");
        else
            System.out.println("You live in other City.");

        // switch(condition){
        //      case value: break;
        //      case value: break;
        //      default:
        // }
        int num = 4;
        switch (num){
            case 1:
                System.out.println("Number is One"); break;
            case 2:
                System.out.println("Number is two");break;
            case 3:
                System.out.println("Number is three");break;
            case 4:
                System.out.println("Number is four");break;
            default:
                System.out.println("Your Number is wrong");
        }
        System.out.println("Finish!");

        String city = "Taunggyi";
        switch (city){
            case "Yangon":
                System.out.println("You Live in Yangon.");break;
            case "Mandalay":
                System.out.println("You Live in Mandalay");break;
            case "Taunggyi":
                System.out.println("You Live in Taunggyi");break;
            default:
                System.out.println("You like in other city");
        }
        System.out.println("Finish!");

        char mark4 = 'P';
        switch (mark4){
            case 'P':
                System.out.println("Pass");break;
            case 'F':
                System.out.println("Fail");break;
            default:
                System.out.println("Something Wrong!");
        }
    }
}
