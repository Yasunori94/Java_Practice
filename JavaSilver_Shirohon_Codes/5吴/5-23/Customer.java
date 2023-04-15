public class Customer {
    int id;
    public void setId(int id) {
        this.id = id;
    }
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = c1;
        c1.setId(101);
        c1 = null;
        Customer c3 = new Customer();
        c3.setId(102);
        c3 = c2;
        System.out.print(c2.id);
    }
}