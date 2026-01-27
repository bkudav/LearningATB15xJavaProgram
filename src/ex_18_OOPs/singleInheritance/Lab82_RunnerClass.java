package ex_18_OOPs.singleInheritance;

public class Lab82_RunnerClass {
    public static void main(String[] args) {
        Son a = new Son();
        System.out.println(a.gold_f);
        a.bhk3();
        a.bhk2();

        Father b = new Father();
        System.out.println(b.gold_f);
        b.bhk2();

    }
}
