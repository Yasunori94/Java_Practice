class Customer {
    public void disp() {
        System.out.println("disp()");
    }
}
class WebCustomer extends Customer {
    public void disp(String str) {
        System.out.println(str + "_disp()");
    }
}
class Test {
    public static void main(String[] args) {
        WebCustomer wc = new WebCustomer();
        wc.disp("Web");
    }
}