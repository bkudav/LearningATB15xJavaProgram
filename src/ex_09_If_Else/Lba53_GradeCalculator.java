package ex_09_If_Else;

import java.util.Scanner;

public class Lba53_GradeCalculator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the Score:\n");
        int score = SC.nextInt();

        if (score >= 90 && score <= 100)
            System.out.println("Grade is A");
        else if (score >= 80 && score <= 89) {
            System.out.println("Grade is B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade is C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade is D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Grade is F");
        } else if (score < 0) {
            System.out.println("Please enter valid score");
        }
        SC.close();
    }
}



