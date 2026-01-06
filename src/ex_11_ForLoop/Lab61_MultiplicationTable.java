package ex_11_ForLoop;

import java.util.Scanner;

public class Lab61_MultiplicationTable {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number:\n");
        int num = SC.nextInt();

        System.out.println("Multiplication Table for " + num + ":");
        System.out.println("---------------------------");

        // 2. The For Loop
        // (start at 1; stay in loop while i is 10 or less; increase i by 1 each time)
        for (int i=1;i<=10;i++)
        {
            int result = num * i;

            // 3. Print the row in the format: 5 x 1 = 5
            System.out.println(num + "x" + i +" = " +result);

        }
    }
}
