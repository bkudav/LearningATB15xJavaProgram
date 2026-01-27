package ex_17_Arrays;

public class Lab73_SumOfArrays {
    public static void main(String[] args) {
        int [] array = {2,4,6};

        int sum = array[0];

        for(int i=0;i<array.length;i++)
        {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
