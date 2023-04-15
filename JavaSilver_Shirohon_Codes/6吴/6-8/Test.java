class Customer {
    public Customer() {
        System.out.print(1);
    }
    public Customer(int num) {
        this();
        System.out.print(num);
    }
}
class WebCustomer extends Customer {
    public WebCustomer() {
        super();
        System.out.print(2);
    }
    public WebCustomer(int num) {
        super(num);
        System.out.print(3);
    }
}
class Test {
    public static void main(String[] args) {
        WebCustomer wc = new WebCustomer(4);
    }
}