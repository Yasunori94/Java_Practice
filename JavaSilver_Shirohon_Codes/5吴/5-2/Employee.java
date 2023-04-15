public class Employee {
    private int id;
    private String name;
    public void setId(int i) {
        id = i;
    }
    public void setName(String n) {
        name = n;
    }
    public void disp() {
        System.out.println(id + " : " + name);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.disp();
    }
}