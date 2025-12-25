package ex_04_Operators;

public class Lab19_CircleGeometry {
    public static void main(String[] args) {
        int radius = 5;
        float pi = 3.14f;
        System.out.println("Display Radius of a Circle:\t" + radius);
        System.out.printf("Display Diameter of a Circle: %d \n", 2*radius);
        System.out.printf("Display Area of a Circle: %.2f \n", pi*radius*radius);
        System.out.printf("Display Circumference of a Circle: %.2f", 2*pi*radius);
    }
}
