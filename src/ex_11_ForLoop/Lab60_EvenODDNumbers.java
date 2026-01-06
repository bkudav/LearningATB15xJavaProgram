package ex_11_ForLoop;

public class Lab60_EvenODDNumbers {
    public static void main(String[] args) {
        for (int i=0; i<101; i++) {
            if (i%2==0) {
                System.out.println("This is an EVEN number" +i);
            }
            else
            {
                System.out.println("This is an ODD number" +i);
            }
        }
    }
}
