package ex_17_Arrays;

public class Lab67_Arrays {
    public static void main(String[] args) {

        //Array - 1
        int [] marks = {98,90,78,89,79};
        for (int mark : marks)
        {
            System.out.println(mark);
        };

        System.out.println("------------");

        //Array - 2
        String [] names = {"Tom","Peter","Jackson"};
        for (String name:names)
        {
            System.out.println(name);
        };

        System.out.println("------------");

        //Array - 3
        boolean[] isMarried = {true,false,true};
        for(boolean Married:isMarried)
        {
            System.out.println(Married);
        };

        System.out.println("------------");

        //Array - 4
        float[] values = new float[3];
        values[0] = 3.14f;
        values[1] = 4.14f;
        values[2] = 5.14f;
        //Advanced for loop
        for (float value : values)
        {
            System.out.println(value);
        }

        System.out.println("------------");
    }
}
