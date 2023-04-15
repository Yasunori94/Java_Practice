class Customer {
    private int id;
    private String name;
    public Customer(int id) {
        id = id;
        name = "unknown";
    }
    public Customer(int i, String n) {
        id = i;
        name = n;
    }
    public void disp() {
        System.out.println(id + " : " + name);
    }
}
class Test {
    public static void main(String[] args) {
        new Customer(100).disp();
        new Customer(101, "Duke").disp();
    }
}