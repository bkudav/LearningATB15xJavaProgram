package Test_OOPs_Concepts_10_02;

public class Challenge1 {
    public static void main(String[] args) {
        Person P1 = new Person("Jon Snow",35);
        System.out.println("Name: "+P1.name);
        System.out.println("Age: " +P1.age);

        Person P2 = new Person("Arya Start",20);
        System.out.println("Name: " +P2.name);
        System.out.println("Name: " +P2.age);
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
