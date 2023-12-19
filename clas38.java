class Employee {
    int id;
    String name;
    public void printdetails()
    {
        System.out.println("My Id is "+id);
        System.out.println("My name is "+name);
    }
}

public class clas38 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.id = 5;
        harry.name = " Hardik";
        System.out.println(harry.id);
        System.out.println(harry.name);
        harry.printdetails();
    }
}
