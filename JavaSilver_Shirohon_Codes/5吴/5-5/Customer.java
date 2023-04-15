public class Customer {
    private String name;
    public void Customer() {
        name = "unknown";
    }
    public void Customer(String name) {
        this.name = name;
    }
    public void disp() {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Customer c = new Customer("Duke");
        c.disp();
    }
}