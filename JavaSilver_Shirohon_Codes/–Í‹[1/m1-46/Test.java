class Customer {
    private int id;
    private String name;
    public Customer(int id) {
        this.id = id;
        this.name = "Tom";
    }
    public Customer(int i, String n) {
        this(i);
        name = n;
    }
    public Customer(int id, String name, String lang) {
        this(id, name);
    }
    public void disp() {
        System.out.println(id + " : " + name);
    }
}
class Test {
    public static void main(String[] args) {
        new Customer(101, "Duke", "Java").disp();
    }
}