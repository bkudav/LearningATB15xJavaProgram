package ex_05_TypeCasting;

public class Lab22_Narrowing {
    public static void main(String[] args) {
        /* TYPE CASTING can be used only with compatible data-types. */
        int val = 300;
        byte b = (byte)val; //Valid Syntax - Explicit - Cast Narrowing
        System.out.println(b);
    }
}
