package ex_11_ForLoop;

import java.util.Scanner;

public class Lab65_TheFactorialCalculator {
    public static void main(String[] args) {
        //Step1: Ask the user for a number (e.g., $5$).
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = SC.nextInt();

        // 2. Initialize the result variable to 1
        long factorial = 1;

        // 3. The loop (starting from 1 up to the number n)
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i; // Multiply current factorial by i
        }

        // 4. Output the result
        System.out.println("The factorial of " + num + " (" + num + "!) is: " + factorial);

        SC.close();
    }

}
