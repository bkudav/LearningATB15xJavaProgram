package ex_13_dowhile;

import java.util.Scanner;

public class Lab66_PrintNumbers1to10 {
    public static void main (String[] args)
    {
        /** Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number: "); **/

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}
