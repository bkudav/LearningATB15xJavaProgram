package ex_17_Arrays;

public class Lab68_ArrayUsingnewOperator {
    public static void main(String[] args) {

        //Array using new operator
        int[] marks = new int[5];
        marks[0] = 98;
        marks[1] = 89;
        marks[2] = 100;
        marks[3] = 91;
        marks[4] = 95;

        for(int mark:marks)
        {
            System.out.println(mark);
        };
        System.out.println("------------");
        System.out.println(marks[1]);

    }
}
