package ex_05_TypeCasting;

public class Lab33_Widening_FloatToDouble {
    public static void main(String[] args) {
        byte b = 25;
        short c = b; //Valid Syntax - Implicit - Cast Widening
        short d = (short)b; //Valid Syntax - Explicit - Cast Widening
        System.out.println((short)d);
        System.out.println(c);

    }
}
