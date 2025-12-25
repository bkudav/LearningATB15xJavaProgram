package ex_06_TernaryOperator;

public class Lab26_Real_Age_Classification {
    // A user input will give you an age.
    // You need to check if the user is minor, adult or senior citizen.
    public static void main(String [] args) {
        String age_input = args[3];
        System.out.println(age_input instanceof String);
        /*Need to convert String to int. Type Casting can be used only with compatible data types.
        int is primitive and String is non-primitive.
        */
        int age_user_input = Integer.parseInt(age_input);

        String result = (age_user_input < 18)? "MINOR":(age_user_input<=60)? "ADULT": "Sr. CITIZEN";
        System.out.println(result);

    }
}
