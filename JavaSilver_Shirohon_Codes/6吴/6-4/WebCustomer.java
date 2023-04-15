class Customer {
    void disp() {
        System.out.println("disp()");
    }
    public final void func() {
        System.out.println("func()");
    }
}
class WebCustomer extends Customer {
    public void disp() {
        System.out.println("Web_disp()");
    }
    public void func() {
        System.out.println("Web_func()");
    }
}