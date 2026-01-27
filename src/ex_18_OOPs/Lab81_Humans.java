package ex_18_OOPs;

public class Lab81_Humans {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("Bhagyashree");
        Human h3 = new Human("Viraj");
        Human h4 = new Human("Meera");
        
        System.out.println(h4.name);
        System.out.println(h2.name);
        System.out.println(h3.name);
    }

    static class Human{
        String name;
        int age;

        Human()
        {
            System.out.println("Default Constructor!");
        }

        Human(String nameGiven)
        {
            this.name = nameGiven;
        }
    }
}
