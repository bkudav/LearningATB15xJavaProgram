package ex_09_If_Else;

import java.util.Scanner;

public class Lab46_Practice_GradeCalculator {
    //Program: Create a program that takes a score (0-100) as input.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for Student:\n");
        int score = scanner.nextInt();

        if (score>0 && score<100)
        {
            if (score >= 90) {
                System.out.println("Grade A");
            } else if (score >= 80) {
                System.out.println("Grade B");
            } else if (score >= 70) {
                System.out.println("Grade C");
            } else {
                System.out.println("FAILED");
            }
        }
        else
        {System.out.println("Invalid score entered");}
        scanner.close();
    }
}
