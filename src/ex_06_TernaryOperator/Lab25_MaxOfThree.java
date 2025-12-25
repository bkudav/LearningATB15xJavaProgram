package ex_06_TernaryOperator;

public class Lab25_MaxOfThree {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println("Value of n1:\t" +n1);
        System.out.println("Value of n2:\t" +n2);
        System.out.println("Value of n3:\t" +n3);

        String result = ((n1>n2)? "n1":(n2>n3)? "n2": "n3");
        System.out.println("MAX OUT OF THREE:\t" +result);
    }
}
