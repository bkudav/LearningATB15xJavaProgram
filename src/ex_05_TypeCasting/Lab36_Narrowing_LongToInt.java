package ex_05_TypeCasting;

public class Lab36_Narrowing_LongToInt {
    public static void main(String[] args) {
        long a = 10;
        System.out.println("Before Conversion\t" +a);
        int b = (int)a;
        System.out.println("After Conversion\t" +b);
        System.out.println((int)a);

    }
}
