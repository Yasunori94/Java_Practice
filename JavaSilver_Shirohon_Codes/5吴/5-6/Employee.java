public class Employee {
    int id;
    public Employee() {
        System.out.println("Employee()");
        this(200);
    }
    public Employee(int id) {
        System.out.println("Employee(int id)");
        this.id = id;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.id);
    }
}