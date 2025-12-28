package ex_05_TypeCasting;

public class Lab30_Widening_ShortToInt {
    public static void main(String[] args) {
        short a = 115;
        int b = a; //Valid Syntax - Implicit - Cast Widening
        int c = (int)a; //Valid Syntax - Explicit - Cast Widening
        System.out.println(a);
        System.out.println((int)a);

    }
}
