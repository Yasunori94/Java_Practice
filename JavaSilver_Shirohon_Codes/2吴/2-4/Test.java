class Customer {
    int id;
    public void setId(int id) {
        id = id;
    }
    public void disp() {
        System.out.println(id);
    }
}
public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setId(101);
        c.disp();
    }
}