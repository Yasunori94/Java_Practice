public class Test {
    static void func() {
        System.out.print("func() / ");
    }
    public static void main(String[] args) {
        Test.func();
        Test t = new Test();
        t.func();
    }
}