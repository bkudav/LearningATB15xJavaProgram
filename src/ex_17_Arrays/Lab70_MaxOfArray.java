package ex_17_Arrays;

import java.util.Arrays;

public class Lab70_MaxOfArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        //Print using sort
        Arrays.sort(array);
        System.out.println(array[array.length-1]);

        //Print without using sort
        int max = array[0];

        for(int i=0; i<array.length;i++)
        {
            if (array[i]>max)
                max = array[i];
        };
        System.out.println(max);
    }
}
