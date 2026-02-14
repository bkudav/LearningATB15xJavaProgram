package Test_OOPs_Concepts_10_02;

public class Challenge1 {
    public static void main(String[] args) {
        Person P = new Person();
        System.out.println(P.name);
        System.out.println(P.age);

    }

    static class Person{
        String name="Peter";
        int age=35;

    }
}
