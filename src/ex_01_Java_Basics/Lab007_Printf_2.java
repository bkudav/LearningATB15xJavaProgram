package ex_01_Java_Basics;

public class Lab007_Printf_2 {
    public static void main(String[] args) {

        String browser = "Chrome";
        int version = 120;
        boolean isHeadless = false;


        //Target Output: Testing on Browser: Chrome (Version: 120) | Headless Mode: false
        System.out.printf("Testing on Browser: %s (Version: %d) | Headless Mode: %b",browser, version, isHeadless);
    }

}
