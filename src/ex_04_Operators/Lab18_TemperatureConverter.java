package ex_04_Operators;

public class Lab18_TemperatureConverter {
    public static void main(String[] args) {
        //Create a program that converts Fahrenheit to Celsius using the formula:
        //C = (F - 32) * 5/9

        int f = 60;

        System.out.printf("Convert temperature from %d fahrenheit to Celsius : %d celsius", f, (f - 32) * 5/9);

    }
}
