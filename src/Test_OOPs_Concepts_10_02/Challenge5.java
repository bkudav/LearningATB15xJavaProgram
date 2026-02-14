package Test_OOPs_Concepts_10_02;

public class Challenge5 {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.makesound();

        Cat C = new Cat();
        C.makesound();
    }

    static class Animal
    {
        void makesound()
        {
            System.out.println("-----------");
        }
    }

    static class Dog extends Animal
    {
        @Override
        void makesound() {
            super.makesound();
            System.out.println("Dog says: Woof! Woof!");
        }
    }

    static class Cat extends Animal
    {
        @Override
        void makesound() {
            super.makesound();
            System.out.println("Cat says: Meow! Meow!");
        }
    }
}
