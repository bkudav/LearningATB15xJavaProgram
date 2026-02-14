package Test_OOPs_Concepts_10_02;

public class Challenge6 {
    public static void main(String[] args) {
     Car C = new Car();
     C.start();
     Bike B = new Bike();
     B.start();
    }

     static class Vehicle {
        void start()
        {
            System.out.println("--------");
        }
    }

     static class Car extends Vehicle
    {

        @Override
        void start() {
            super.start();
            System.out.println("Car engine starts with a roar!");
        }
    }

     static class Bike extends Vehicle
    {
        @Override
        void start() {
            super.start();
            System.out.println("Bike engine starts with a purr!");
        }
    }
}
