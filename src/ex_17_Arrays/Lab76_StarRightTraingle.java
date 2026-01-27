package ex_17_Arrays;

import java.util.Scanner;

public class Lab76_StarRightTraingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n for pattern, e.g: n=3 ");
        int n = input.nextInt();

        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
