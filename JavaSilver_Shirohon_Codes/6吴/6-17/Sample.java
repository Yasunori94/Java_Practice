interface Test1 {
    void foo();
}
interface Test2 {
    void bar();
}
abstract class Test3{
    public abstract void foo();
}
class Sample extends Test3 implements Test1, Test2{
    public void foo() { }
    public void bar() { }
}