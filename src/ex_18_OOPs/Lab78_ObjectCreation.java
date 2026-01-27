package ex_18_OOPs;

public class Lab78_ObjectCreation {
    public static void main(String[] args) {
        Person p1 = new Person();
        MySQL a = new MySQL();
        ReadExcelFile b = new ReadExcelFile();


    }
    //default constructor
    static class MySQL
    {
        MySQL()
        {
            System.out.println("MySQL connected");
        }
    }

    //default constructor
    static class ReadExcelFile{
        ReadExcelFile()
        {
            System.out.println("ExcelFile is loaded!");
        }
    }
}
