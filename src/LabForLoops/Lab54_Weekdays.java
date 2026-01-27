package LabForLoops;

import java.util.Scanner;

public class Lab54_Weekdays {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Weekday");
        int day = SC.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Please enter valid day");
                break;
        }
    }
}
