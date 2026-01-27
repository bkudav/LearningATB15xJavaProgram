package ex_12_while;

import java.util.Scanner;

public class Lab62_factorial {
    public static void main(String[] args)
    {

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = SC.nextInt();

        int fact = 1;
        int i = 1;

        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
