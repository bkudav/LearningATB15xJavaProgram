package ex_17_Arrays;

public class Lab69_ArraysPrint {
    public static void main(String[] args) {

        int[] marks = {98, 90, 78, 89, 79};

        //Print using advanced for loop
        for (int mark : marks) {
            System.out.println(mark);
        };

        System.out.println(" ====== ");

        //Print using for loop
        for(int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
        };

    }
}
