package ex_09_If_Else;

import java.util.Scanner;

public class Lab44_TriangleClassifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1\n:");
        int side1 = scanner.nextInt();

        System.out.println("Enter side1\n:");
        int side2 = scanner.nextInt();

        System.out.println("Enter side1\n:");
        int side3 = scanner.nextInt();

        if (side1 == side3 && side2 == side3)
        {
            System.out.println("Triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3)
        {
            System.out.println("Triangle is isosceles");
        }
        else
        {
                System.out.println("Triangle is scalene ");
        }

        scanner.close();
        }

    }

