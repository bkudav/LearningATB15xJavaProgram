package ex_11_ForLoop;

public class Lab63_EvenNumberSum {
    public static void main(String[] args) {

        int sum=0;

        //Loop and display 1 t0 50
        for (int i=1;i<=50;i++) {
            System.out.println(i);
            if (i%2==0)
            {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all even numbers from 1 to 50 is: " + sum);

    }
}
