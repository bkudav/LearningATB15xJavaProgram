package ex_09_If_Else;

import java.util.Scanner;

public class Lab47_Practice_LeapYearChecker {
    //Program: Leap Year Checker (Logic Nesting)
    //Goal: Learn how to combine multiple conditions using && (AND) and || (OR).
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter Year:\t");
        int year = SC.nextInt();

        if (year > 1)
        {
        if (year%4==0 || year%400==0)
        {
            System.out.println("Year is a leap year");
        } else if (year%100==0)
        {
            System.out.println("Year is NOT a leap year");
        }
        else
        {
            System.out.println("Enter year again");
        }
        }
        else
        {
            System.out.println("Invalid input provided");
        }

    }
}
