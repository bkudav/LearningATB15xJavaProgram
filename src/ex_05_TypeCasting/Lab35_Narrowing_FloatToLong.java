package ex_05_TypeCasting;

public class Lab35_Narrowing_FloatToLong {
    public static void main(String[] args) {
        float a = 7.5f;
        System.out.println("Before Conversion\t" +a);
        long b = (long) a;
        System.out.println("After Conversion\t" +b);
        System.out.println((long)a);

    }
}
