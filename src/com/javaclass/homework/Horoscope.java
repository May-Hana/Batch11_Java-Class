package com.javaclass.homework;
import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your Birth Date! " +
                "\n1.March 21 – April 19 \n2.April 20 – May 20 \n3.May 21 – June 20 " +
                "\n4.June 21 – July 22 \n5.July 23 – August 22 \n6.August 23 – September 22 " +
                "\n7.September 23 – October 22 \n8.October 23 – November 21 \n9.November 22 – December 21 " +
                "\n10.December 22 – January 19 \n11.January 20 – February 18 \n12.February 19 – March 20 ");
        int horoscope = sc.nextInt();
        if(horoscope == 1){
            System.out.println("Your Zodiac Sign is Aries.");
        }else if(horoscope == 2){
            System.out.println("Your Zodiac Sign is Taurus.");
        }else if(horoscope == 3){
            System.out.println("Your Zodiac Sign is Gemini.");
        }else if(horoscope == 4){
            System.out.println("Your Zodiac Sign is Cancer.");
        }else if(horoscope == 5){
            System.out.println("Your Zodiac Sign is Leo.");
        }else if(horoscope == 6){
            System.out.println("Your Zodiac Sign is Virgo.");
        }else if(horoscope == 7){
            System.out.println("Your Zodiac Sign is Libra.");
        }else if(horoscope == 8){
            System.out.println("Your Zodiac Sign is Scorpio.");
        }else if(horoscope == 9){
            System.out.println("Your Zodiac Sign is Sagittarius.");
        }else if(horoscope == 10){
            System.out.println("Your Zodiac Sign is Capricorn.");
        }else if(horoscope == 11){
            System.out.println("Your Zodiac Sign is Aquarius.");
        }else if(horoscope == 12){
            System.out.println("Your Zodiac Sign is Pisces.");
        }else{
            System.out.println("Please choose again correctly.");
        }

    }
}
