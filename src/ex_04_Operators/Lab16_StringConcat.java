package ex_04_Operators;

public class Lab16_StringConcat {
    public static void main(String[] args) {
        String first_name = "Bhagyashree";
        String last_name = "Kudav";
        int A = 10;
        int B = 20;

        // Interview Questions with String concat
        System.out.println(first_name + last_name);
        System.out.println(first_name + last_name + A + B);
        System.out.println(A + B + first_name + last_name);
        System.out.println(first_name + last_name + (A + B));

    }
}
