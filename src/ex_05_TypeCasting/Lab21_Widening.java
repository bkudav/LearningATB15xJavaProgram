package ex_05_TypeCasting;

public class Lab21_Widening {
    public static void main(String[] args) {
        //TYPE CASTING can be used only with compatible data-types.
        byte b = 10;
        int a = b; //Valid Syntax - Implicit - Cast Widening
        int a1 = (int)b; //Valid Syntax - Explicit - Cast Widening
        System.out.println(a1);

        byte c = 20;
        int d = c;
        int d1 = (int)c;
        System.out.println(d1);
    }
}
