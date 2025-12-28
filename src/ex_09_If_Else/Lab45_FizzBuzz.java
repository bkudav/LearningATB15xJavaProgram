package ex_09_If_Else;

public class Lab45_FizzBuzz {
    public static void main(String[] args) {
        printNumbers(1);

    }

    public static void printNumbers(int n) {
        if (n <= 100 || n % 3 == 0) { // The "if" checks if we should continue
            System.out.println(n);
            printNumbers(n + 1); // The function calls itself with the next number
            System.out.println("Fizz");
        } else if (n % 5 == 0)
        {
            System.out.println("Buzz");
            return;
        }
        if (n % 3 == 0 && n % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
    }
}
