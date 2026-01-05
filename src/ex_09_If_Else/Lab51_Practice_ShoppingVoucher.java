package ex_09_If_Else;

import java.util.Scanner;

public class Lab51_Practice_ShoppingVoucher {
    //Program: The "Smart Shopper" Discount Calculator
    public static void main(String[] args) {


        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter the Bill Amount in $:\t");
        int billAmount = SC.nextInt();

        double silverDiscount = billAmount*0.10;
        double finalSilver = billAmount-silverDiscount;

        double goldDiscount = billAmount*0.20;
        double finalGold = billAmount-goldDiscount;

        double platinumDiscount = billAmount*0.30;
        double finalPlatinum = billAmount-platinumDiscount;

        if (billAmount>0) {
            if (billAmount < 50)
                System.out.println("No discount is applied. The original bill amount is:\t" + billAmount);
            else if (billAmount>50 && billAmount<100)
            {System.out.println("Silver Voucher with 10% discount is applied. The final amount to be paid is:\t" + finalSilver);
                System.out.println("The discount amount saved is:\t" +silverDiscount);}
            else if (billAmount>101 && billAmount<200) {
                {System.out.println("Gold Voucher with 20% discount is applied. The final amount to be paid is:\t" +finalGold);
                    System.out.println("The discount amount saved is:\t" +goldDiscount);}
            } else if (billAmount>300) {
                System.out.println("Platinum Voucher with 30% discount is applied. The final amount to be paid is:\t" +finalPlatinum);
                System.out.println("The discount amount saved is:\t" +platinumDiscount);}
            }
        else
            System.out.println("Invalid Amount entered");
        SC.close();
        }

    }

