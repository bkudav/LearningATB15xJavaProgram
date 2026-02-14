package Test_OOPs_Concepts_10_02;

public class Challenge2 {
    public static void main(String[] args) {
        Student S1 = new Student("Alex", 4,'A');
        S1.DisplayInfo();
    }

    static class Student{
        String name;
        int rollno;
        char section;

        public Student(){
            System.out.println("Default Constructor!");
        }

        public Student(String name, int rollno, char section) {
            this.name = name;
            this.rollno = rollno;
            this.section = section;
        }

        public void DisplayInfo()
        {
            System.out.println(name);
            System.out.println(rollno);
            System.out.println(section);
        }

    }
}
