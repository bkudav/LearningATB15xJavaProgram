package ex_11_ForLoop;

public class Lab64_ThePyramidMaker {
    public static void main(String[] args) {

        int rows = 5;

        // 1. Outer Loop: Handles how many rows to print
        for (int i=1;i <= rows;i++)
        {
            // 2. Inner Loop: Handles how many stars to print in the CURRENT row
            for (int j=1;j <= i;j++) {
                System.out.print("*");
            }
            //3. Move to the next line after the inner loop finishes a row
            System.out.println();
        }
    }
}
