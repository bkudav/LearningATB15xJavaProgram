package Test_OOPs_Concepts_10_02;

public class Challenge1 {
    public static void main(String[] args) {
        Person P = new Person("Peter",5);
        System.out.println(P.name);
        System.out.println(P.age);
    }

    static class Person{
        String name;
        int age;

        public Person() {
            System.out.println("Default Constructor");
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
}
