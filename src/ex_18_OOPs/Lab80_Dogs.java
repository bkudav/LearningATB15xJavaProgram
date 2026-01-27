package ex_18_OOPs;

public class Lab80_Dogs {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Leo");
        Dog d3 = new Dog("Rocky");

        System.out.println(d2.name);
        System.out.println(d3.name);


    }

    static class Dog{
        String name;
        //default or non-parameterised constructor
        Dog()
        {
            System.out.println("Default Constructor");
        }

        //parameterised constructor
        Dog(String nameGiven)
        {
            this.name = nameGiven;
        }
    }
}
