class Customer {
    private String name;
    public Customer() {
        this.name = "unknown";
    }
    public Customer(String name) {
        this.name = name;
    }
    public void disp() {
        System.out.print(name);
    }
}
class WebCustomer extends Customer {
    private String pass;
    public WebCustomer(String pass) {
        this.pass = pass;
    }
    public void disp() {
        super.disp();
        System.out.print(" : " + pass);
    }
}
class Test {
    public static void main(String[] args) {
        WebCustomer wc = new WebCustomer("Java");
        wc.disp();
    }
}