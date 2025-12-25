package ex_04_Operators;

public class Lab14_LogicalOperators {
    public static void main(String[] args) {
        int age_Tom = 35;
        int age_Peter = 20;

        // OR operator is used
        System.out.println(age_Tom > 45 || age_Peter < 34);

        // OR and Reverse operator is used
        System.out.println(!(age_Tom > 45 || age_Peter < 34));

        // AND operator is used
        System.out.println(age_Tom > 45 && age_Peter < 34);

        // AND and Reverse operator is used
        System.out.println(!(age_Tom > 45 && age_Peter < 34));
    }
}
