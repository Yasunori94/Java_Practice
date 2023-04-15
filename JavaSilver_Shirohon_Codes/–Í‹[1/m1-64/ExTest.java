class Test {
    public void func() {
        this.disp();
    }
    public void disp() {
        System.out.print("Test");
    }
}
class ExTest extends Test {
    public void disp() {
        System.out.print("ExTest");
    }
    public static void main(String[] args) {
        Test t = new ExTest();
        t.disp(); System.out.print(" : ");
        t.func();
    }
}