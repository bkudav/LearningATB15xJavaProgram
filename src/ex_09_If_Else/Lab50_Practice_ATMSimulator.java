package ex_09_If_Else;

import java.util.Scanner;

public class Lab50_Practice_ATMSimulator {
    public static void main(String[] args) {
        //The ATM Simulator (Nested If-Else)
        //Goal: Practice "nested" structures (putting an if inside another if).
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter balance amount:");
        int balance = SC.nextInt();
        System.out.println("Enter withdrawalAmount:");
        int withdrawalAmount = SC.nextInt();
        int availableBalance = balance-withdrawalAmount;

        if (withdrawalAmount > 0)
        {
        if (balance >= withdrawalAmount)
        {
            System.out.println("Money withdrawn successfully. Available balance is:\t" +availableBalance);
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
        }
        else
        {
            System.out.println("Invalid Amount");
        }

    }
}
