class Customer {
    public int id = 10;
    public void disp() {
        System.out.print(id);
    }
}
class WebCustomer extends Customer {
    private int id = 11;
    public void disp() {
        System.out.print(id);
    }
    public static void main(String[] args) {
        Customer c = new WebCustomer();
        c.disp();
    }
}