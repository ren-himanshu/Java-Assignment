public class Employee {
    protected int id, age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.age=(int)35.5;
        System.out.println(emp.age);
        System.out.println("Successful.");
    }
}
