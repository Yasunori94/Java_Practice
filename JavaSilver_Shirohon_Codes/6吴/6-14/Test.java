public interface Test {
    void func();
}
class Sample implements Test {
    void func() {
        System.out.println("func()");
    }
}