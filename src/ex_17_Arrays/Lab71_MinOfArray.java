package ex_17_Arrays;

import java.util.Arrays;

public class Lab71_MinOfArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        Arrays.sort(array);
        System.out.println(array[0]);

        //Without using sort
        int min = array[0];
        for (int i=0;i<array.length;i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
