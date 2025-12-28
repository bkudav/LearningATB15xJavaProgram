package ex_05_TypeCasting;

public class Lab37_Narrowing_IntToShort {
    public static void main(String[] args) {
        int a = 35363;
        short b = (short)a;//Valid syntax - Explicit - Narrowing
        System.out.println(a);
        System.out.println(b);
        System.out.println((short)a);
    }
}
