package ex_10_Switch;

import java.util.Scanner;

public class Lab56_TrafficLightSimulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the light color:");
        String color = scanner.next();
        color = color.toLowerCase();

        switch (color)
        {
            case "yellow":
                System.out.println("Prepare to stop.");
                break;
            case "green":
                System.out.println("Go ahead.");
                break;
            default:
                System.out.println("Signal Malfunction.");
                break;
        }
    }
}
