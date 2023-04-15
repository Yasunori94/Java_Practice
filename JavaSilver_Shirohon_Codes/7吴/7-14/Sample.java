class Test {
    public void func() throws Exception {
        System.out.println("Test");
    }
}
class ExTest extends Test {
    @Override
    public void func() throws RuntimeException {
        System.out.println("ExTest");
    }
}
class Sample {
    public static void main(String[] args) {
        new ExTest().func();
    }
}