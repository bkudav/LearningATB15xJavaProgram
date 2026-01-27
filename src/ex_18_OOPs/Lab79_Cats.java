package ex_18_OOPs;

public class Lab79_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Lucy");
        Cat c3 = new Cat("Oggy");
        Cat c4 = new Cat("Spicy");

        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);
    }

    static class  Cat {
        String name;

        //Default constructor
     Cat()
     {
         System.out.println("Default Constructor!");
     }

     //parameterized constructor
        Cat(String nameGiven)
        {
        this.name = nameGiven;
        }

    }
}
