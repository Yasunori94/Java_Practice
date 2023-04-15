public class Test {
    public void func(int i) {
        System.out.println("int");
    }
    public void func(double d) {
        System.out.println("double");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.func(100.0);
    }
}