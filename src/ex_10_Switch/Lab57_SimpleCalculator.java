package ex_10_Switch;

import java.util.Scanner;

public class Lab57_SimpleCalculator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number 1:");
        double num1 = SC.nextDouble();

        System.out.println("Enter number 2");
        double num2 = SC.nextDouble();

        System.out.println("Enter the operator(+, -, *, /):");
        char ch = SC.next().charAt(0);

        double result;

        switch (ch)
        {
            case '+':
                result = num1 + num2;
            System.out.println("Add 2 nos.:" +result);
            break;

            case '-':
                result = num1 - num2;
                System.out.println("Subtract 2 nos.:" +result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Multiply 2 nos.:" +result);
                break;

            case '/':
                if (num2!=0) {
                    result = num1 / num2;
                    System.out.println("Divide 2 nos.:" + result);
                }
                else {
                    System.out.println("Error: Cannot divide by zero!");}
                break;

            default:
                System.out.println("Invalid operation");

            SC.close();
        }


    }
}
