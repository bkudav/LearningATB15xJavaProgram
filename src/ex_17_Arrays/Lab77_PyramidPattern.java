package ex_17_Arrays;

import java.util.Scanner;

public class Lab77_PyramidPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = input.nextInt();

        for(int i = 0; i<=rows; i++)
        {
        //Print spaces
            for (int space=0;space<=rows;space++)
            {
                System.out.println(" ");
            }
            //Print stars
        for (int star=0;star<=i;star++)
        {
            System.out.print("*");
        }
            System.out.println("");
        }
    }
}
