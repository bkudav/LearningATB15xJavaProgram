package ex_10_Switch;

import java.util.Scanner;

import static java.lang.System.out;

public class Lab55_SeasonFinder {
    //Season Finder (Grouping Cases)
    public static void main(String[] args) {


        Scanner SC = new Scanner(System.in);
        out.println("Enter the Month:");
        String month = SC.next();
        month = month.toLowerCase();


        switch (month)
        {
            case "january","february","december":
            System.out.println("It is Winter");
            break;

            case "march","april","may":
            System.out.println("It is Spring");
            break;

            case "june","july","august":
            System.out.println("It is Monsoon");
            break;

            default:
                System.out.println("Enter a valid month");
                break;
        }
    }
}
