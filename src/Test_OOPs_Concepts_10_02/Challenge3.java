package Test_OOPs_Concepts_10_02;

public class Challenge3 {
    public static void main(String[] args) {
    Employee E1 = new Employee(1,"Alexander P", 200000);
        System.out.println("Employee ID: " +E1.getId());
        System.out.println("Employee Name: " +E1.getName());
        System.out.println("Employee Salary: " +E1.getSalary());

    }

    static class Employee
    {
        public Employee() {
            System.out.println("DC!");
        }

        private  int id;
        private String name;
        private int salary;


        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
