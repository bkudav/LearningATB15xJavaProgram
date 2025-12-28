package ex_05_TypeCasting;

public class Lab31_Widening_IntToLong {
    public static void main(String[] args) {
        int a = 18;
        long b = a; //Valid Syntax - Implicit - Cast Widening
        System.out.println(b);
        long c = (long)a; //Valid Syntax - Explicit - Cast Widening
        System.out.println((long)a);

    }
}
