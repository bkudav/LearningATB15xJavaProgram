package ex_05_TypeCasting;

public class Lab38_Narrowing_ShortToByte {
    public static void main(String[] args) {
        double a = 35.46;
        //float b = a;
       // System.out.println(a); //java: incompatible types: possible lossy conversion from double to float
        float b = (float)a; //Valid Syntax - Explicit -
        System.out.println(b);
        System.out.println((float)a);

    }
}
